package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://gist.githubusercontent.com/electron0zero/07a1cddde7948d72dc2c0a12163f92fa/raw/0df255624a2690b6a88dfa13586554ac717a37fa/data.json" );
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
        }

        BASE_URL = url;
    }
}
