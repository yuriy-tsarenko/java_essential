package com.cbs.java_essential.examples.lesson10.example.dto;

import com.google.gson.annotations.SerializedName;
import lombok.ToString;

@ToString
public class Meta {
    @SerializedName("pagination")
    public Pagination pagination;
}
