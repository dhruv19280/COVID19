package com.covid19;

// Java program to read JSON from a file

import com.google.gson.*;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class JSONReader {

    public static void readURL() throws Exception {
        String url = "https://api.rootnet.in/covid19-in/unofficial/covid19india.org/statewise/history";
        String out = readStringFromURL(url);

        System.out.println(out);

        Gson g = new Gson();
        //g.fromJson(out, DataRecord.class);

        //System.out.println(g.toJson(out));
    }

    public static String readStringFromURL(String requestURL) throws IOException {
        try (Scanner scanner = new Scanner(new URL(requestURL).openStream(),
                StandardCharsets.UTF_8.toString())) {
            scanner.useDelimiter("\\A");
            return scanner.hasNext() ? scanner.next() : "";
        }
    }

}
