package com.cbs.java_essential.examples.lesson10.example.util;

import com.cbs.java_essential.examples.lesson10.example.dto.GenericResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public final class ObjectBuilder {

    private ObjectBuilder() {
    }

    public static <T extends GenericResponse<R>, R> List<R> build(String object, Class<T> type) {
        Gson gson = new GsonBuilder().serializeNulls().create();
        T response = gson.fromJson(object, type);
        return response.getContent();
    }
}
