package com.epam.javahomeworks.Homework11.Task2;

import java.util.HashMap;
import java.util.Map;

class Translator {
    private Map<String, String> vocabulary = new HashMap<String, String>();

    private String translation = "";

    public void put(String eng, String ru) {
        eng = eng.toLowerCase();
        ru = ru.toLowerCase();
        vocabulary.put(eng, ru);
    }

    public String translate(String request) {
        request = request.toLowerCase();
        if (vocabulary.get(request)!=null){
            return vocabulary.get(request) + " ";
        } else return "Translation not found.";
    }
}