package com.ptithcm.util;

public class IdVerifier {
    public boolean validate(String id) {
        if (id == null) {
            return false;
        }
        return id.length() > 0;
    }
}
