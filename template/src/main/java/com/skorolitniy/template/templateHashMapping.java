package com.skorolitniy.template;

import java.util.HashMap;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Attr;

public class templateHashMapping extends Result {

    private HashMap<String, String> Vector;
    private String asd="BHO";

    public templateHashMapping() {
        Vector = new HashMap<>();
        status=true;
    }

    public HashMap<String, String> getVector()
    {
        return Vector;
    }

    public void putVector(String s1,String s2)
    {
        Vector.put(s1,s2);
    }

}
