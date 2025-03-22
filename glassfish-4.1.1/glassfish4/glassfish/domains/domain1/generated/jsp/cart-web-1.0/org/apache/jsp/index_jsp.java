package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      response.setHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta\r\n");
      out.write("\t\t\thttp-equiv=\"Content-Type\"\r\n");
      out.write("\t\t\tcontent=\"text/html; charset=UTF-8\" />\r\n");
      out.write("\t\t<title>Shopping Cart Demo</title>\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\t\tbody {\r\n");
      out.write("\t\t\t\tfont-family: Arial, sans-serif;\r\n");
      out.write("\t\t\t\tmargin: 20px;\r\n");
      out.write("\t\t\t\tpadding: 20px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.form-section {\r\n");
      out.write("\t\t\t\tmargin-bottom: 30px;\r\n");
      out.write("\t\t\t\tpadding: 20px;\r\n");
      out.write("\t\t\t\tborder: 1px solid #ddd;\r\n");
      out.write("\t\t\t\tborder-radius: 5px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.form-section h2 {\r\n");
      out.write("\t\t\t\tmargin-top: 0;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tinput[type='text'] {\r\n");
      out.write("\t\t\t\tpadding: 5px;\r\n");
      out.write("\t\t\t\tmargin: 5px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tinput[type='submit'] {\r\n");
      out.write("\t\t\t\tpadding: 5px 15px;\r\n");
      out.write("\t\t\t\tbackground-color: #4caf50;\r\n");
      out.write("\t\t\t\tcolor: white;\r\n");
      out.write("\t\t\t\tborder: none;\r\n");
      out.write("\t\t\t\tborder-radius: 3px;\r\n");
      out.write("\t\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tinput[type='submit']:hover {\r\n");
      out.write("\t\t\t\tbackground-color: #45a049;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<h1>Shopping Cart Management</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"form-section\">\r\n");
      out.write("\t\t\t<h2>Initialize Cart</h2>\r\n");
      out.write("\t\t\t<form\r\n");
      out.write("\t\t\t\taction=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cart/init\"\r\n");
      out.write("\t\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t\tPerson Name:\r\n");
      out.write("\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\tname=\"person\"\r\n");
      out.write("\t\t\t\t\trequired /><br />\r\n");
      out.write("\t\t\t\tID (optional):\r\n");
      out.write("\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\tname=\"id\" /><br />\r\n");
      out.write("\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\ttype=\"submit\"\r\n");
      out.write("\t\t\t\t\tvalue=\"Initialize Cart\" />\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"form-section\">\r\n");
      out.write("\t\t\t<h2>Add Book to Cart</h2>\r\n");
      out.write("\t\t\t<form\r\n");
      out.write("\t\t\t\taction=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cart/add\"\r\n");
      out.write("\t\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t\tBook Title:\r\n");
      out.write("\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\tname=\"title\"\r\n");
      out.write("\t\t\t\t\trequired />\r\n");
      out.write("\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\ttype=\"submit\"\r\n");
      out.write("\t\t\t\t\tvalue=\"Add Book\" />\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"form-section\">\r\n");
      out.write("\t\t\t<h2>Remove Book from Cart</h2>\r\n");
      out.write("\t\t\t<form\r\n");
      out.write("\t\t\t\taction=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cart/remove\"\r\n");
      out.write("\t\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t\tBook Title:\r\n");
      out.write("\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\ttype=\"text\"\r\n");
      out.write("\t\t\t\t\tname=\"title\"\r\n");
      out.write("\t\t\t\t\trequired />\r\n");
      out.write("\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\ttype=\"submit\"\r\n");
      out.write("\t\t\t\t\tvalue=\"Remove Book\" />\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"form-section\">\r\n");
      out.write("\t\t\t<h2>View Cart Contents</h2>\r\n");
      out.write("\t\t\t<form\r\n");
      out.write("\t\t\t\taction=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/cart\"\r\n");
      out.write("\t\t\t\tmethod=\"get\">\r\n");
      out.write("\t\t\t\t<input\r\n");
      out.write("\t\t\t\t\ttype=\"submit\"\r\n");
      out.write("\t\t\t\t\tvalue=\"View Cart\" />\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
