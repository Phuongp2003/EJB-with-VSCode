package com.ptithcm.ejb;

import com.ptithcm.util.ProductException;
import com.ptithcm.util.IdVerifier;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.annotation.PostConstruct;

@Stateful
public class CosmeticCartBean implements CosmeticCart {
    private List<String> contents;
    private String customerId;
    private String customerName;

    @PostConstruct
    public void init() {
        contents = new ArrayList<>();
        System.out.println("EJB CosmeticCartBean initialized");
    }

    public void initialize(String person) throws ProductException {
        if (person == null) {
            throw new ProductException("Null person not allowed.");
        }
        customerName = person;
        customerId = "0";
        contents = new ArrayList<>();
    }

    public void initialize(String person, String id) throws ProductException {
        if (person == null) {
            throw new ProductException("Null person not allowed.");
        }
        customerName = person;
        IdVerifier idChecker = new IdVerifier();
        if (idChecker.validate(id)) {
            customerId = id;
        } else {
            throw new ProductException("Invalid id: " + id);
        }
        contents = new ArrayList<>();
    }

    public void addProduct(String productName) {
        System.out.println("Adding product to cart: " + productName); // Debug log
        if (contents == null) {
            contents = new ArrayList<>();
        }
        contents.add(productName);
        System.out.println("Current cart contents: " + contents); // Debug log
    }

    public void removeProduct(String productName) throws ProductException {
        boolean result = contents.remove(productName);
        if (!result) {
            throw new ProductException("\"" + productName + "\" not in cart.");
        }
    }

    public List<String> getContents() {
        System.out.println("Retrieving cart contents: " + contents); // Debug log
        return contents != null ? contents : new ArrayList<>();
    }

    @Remove
    public void remove() {
        contents = null;
    }
}
