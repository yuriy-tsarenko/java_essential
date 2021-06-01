package com.cbs.java_essential.examples.lesson10.example.dto;

import com.google.gson.annotations.SerializedName;
import lombok.ToString;

import java.util.Date;

@ToString
public class Post {
    @SerializedName("id")
    public int id;

    @SerializedName("user_id")
    public int userId;

    @SerializedName("title")
    public String title;

    @SerializedName("body")
    public String body;

    @SerializedName("created_at")
    public Date createdAt;

    @SerializedName("updated_at")
    public Date updatedAt;
}