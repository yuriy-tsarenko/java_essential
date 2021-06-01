package com.cbs.java_essential.examples.lesson10.example.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public abstract class GenericResponse<T> {

    @SerializedName("code")
    public Integer code;

    @SerializedName("meta")
    public Meta meta;

    public abstract List<T> getContent();
}
