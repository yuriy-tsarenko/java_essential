package com.cbs.java_essential.examples.lesson10.example.dto;

import com.google.gson.annotations.SerializedName;
import lombok.ToString;

import java.util.Date;

@ToString
public class Comment {

    @SerializedName("id")
    public int id;

    @SerializedName("post_id")
    public int postId;

    @SerializedName("name")
    public String name;

    @SerializedName("email")
    public String email;

    @SerializedName("body")
    public String body;

    @SerializedName("created_at")
    public Date createdAt;

    @SerializedName("updated_at")
    public Date updatedAt;
}
