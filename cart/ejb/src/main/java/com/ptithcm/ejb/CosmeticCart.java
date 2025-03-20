package com.ptithcm.ejb;

import com.ptithcm.util.ProductException;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface CosmeticCart {
    public void initialize(String person) throws ProductException;
    public void initialize(String person, String id) throws ProductException;
    public void addProduct(String productName);
    public void removeProduct(String productName) throws ProductException;
    public List<String> getContents();
    public void remove();
}
