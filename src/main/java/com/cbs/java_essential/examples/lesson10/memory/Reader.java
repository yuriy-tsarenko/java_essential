package com.cbs.java_essential.examples.lesson10.memory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    public List<Integer> readFile() {
        AppContext context = new AppContext();
        List<Integer> buffer = new ArrayList<>();
        int flag;
        try {
            FileInputStream stream = new FileInputStream("D:\\IT\\IdeaProjects\\java_essential\\src\\main\\java\\com\\cbs\\java_essential\\examples\\lesson10\\memory\\duke1.png");
            while (-1 != (flag = stream.read())) {
                buffer.add(flag);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }
}
