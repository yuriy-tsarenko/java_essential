package com.cbs.java_essential.examples.lesson10.example.dto;

import com.google.gson.annotations.SerializedName;
import lombok.ToString;

import java.util.List;

@ToString
public class PostResponse extends GenericResponse<Post> {

    @SerializedName("data")
    public List<Post> data;

    @Override
    public List<Post> getContent() {
        return data;
    }
}
