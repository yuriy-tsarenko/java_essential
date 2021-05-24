package com.cbs.java_essential.examples.lesson10.memory;

import java.io.IOException;
import java.net.URL;

public class AppContext {

    public static final String FILE_NAME = "duke.png";

    public String getFilePath() throws IOException {
        URL resource = AppContext.class.getClassLoader().getResource(FILE_NAME);
        if (resource == null) {
            return null;
        }
        return resource.getPath();
    }
}
