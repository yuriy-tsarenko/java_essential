package com.cbs.java_essential.examples.lesson10.example.dto;

import com.google.gson.annotations.SerializedName;
import lombok.ToString;

import java.util.List;

@ToString
public class CommentResponse extends GenericResponse<Comment> {

    @SerializedName("data")
    public List<Comment> data;

    @Override
    public List<Comment> getContent() {
        return data;
    }
}
