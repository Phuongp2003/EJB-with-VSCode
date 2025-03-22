package com.ptithcm.servlet;

import com.ptithcm.ejb.CosmeticCart;
import com.ptithcm.util.ProductException;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CartServlet", urlPatterns = {"/cart/*"}) // Remove this
public class CartServlet extends HttpServlet {
    
    @EJB(mappedName="com.ptithcm.ejb.CosmeticCart")
    private CosmeticCart cart;
    
    @Override
    public void init() throws ServletException {
        if (cart == null) {
            try {
                InitialContext ic = new InitialContext();
                cart = (CosmeticCart) ic.lookup("com.ptithcm.ejb.CosmeticCart");
            } catch (Exception e) {
                throw new ServletException("Failed to initialize EJB: " + e.getMessage(), e);
            }
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pathInfo = request.getPathInfo();
        System.out.println("Processing request: " + pathInfo); // Debug log
        
        try {
            if (pathInfo == null) {
                pathInfo = "/";
            }
            
            switch (pathInfo) {
                case "/init":
                    String person = request.getParameter("person");
                    String id = request.getParameter("id");
                    System.out.println("Initializing cart for: " + person + " with id: " + id); // Debug log
                    if (id != null && !id.isEmpty()) {
                        cart.initialize(person, id);
                    } else {
                        cart.initialize(person);
                    }
                    break;
                    
                case "/add":
                    String title = request.getParameter("title");
                    System.out.println("Adding product: " + title); // Debug log
                    cart.addProduct(title);
                    break;
                    
                case "/remove":
                    cart.removeProduct(request.getParameter("title"));
                    break;
                    
                default:
                    // View cart contents
                    request.setAttribute("products", cart.getContents());
                    break;
            }
            
            // After any operation, get latest contents
            List<String> contents = cart.getContents();
            System.out.println("Cart contents: " + contents); // Debug log
            request.setAttribute("products", contents);
            
            request.getRequestDispatcher("/WEB-INF/cart.jsp").forward(request, response);
            
        } catch (ProductException e) {
            System.err.println("Error processing request: " + e.getMessage()); // Debug log
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
