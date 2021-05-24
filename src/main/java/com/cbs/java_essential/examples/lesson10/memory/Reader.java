package com.cbs.java_essential.examples.lesson10.memory;

import java.io.FileInputStream;
import java.io.IOException;

public class Reader {
    public byte[] readFile() {
        AppContext context = new AppContext();
        byte[] buffer = new byte[0];
        try {
            FileInputStream stream = new FileInputStream(context.getFilePath());
            buffer = new byte[stream.available()];
            for (int i = 0; i < stream.available(); i++) {
                buffer[i] = (byte) stream.read();
            }
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }
}
