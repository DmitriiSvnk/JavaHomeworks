package com.epam.javahomeworks.Homework11.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Translator tr = new Translator();
        String request;
        String result;

        tr.put("people", "люди");
        tr.put("history", "история");
        tr.put("way", "путь");
        tr.put("art", "искусство");
        tr.put("world", "мир");
        tr.put("information", "информация");
        tr.put("map", "карта");
        tr.put("family", "семья");
        tr.put("government", "правительство");
        tr.put("health", "здоровье");
        tr.put("system", "система");
        tr.put("computer", "");
        tr.put("meat", "компьютер");
        tr.put("year", "мясо");
        tr.put("music", "музыка");

        System.out.println("Type word to translate:");

        request = reader.readLine();
        result = tr.translate(request);

        System.out.print(result);
    }
}
