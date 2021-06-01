package com.cbs.java_essential.examples.lesson10.example.dto;

import com.google.gson.annotations.SerializedName;
import lombok.ToString;

@ToString
public class Pagination {

    @SerializedName("total")
    public int total;

    @SerializedName("pages")
    public int pages;

    @SerializedName("page")
    public int page;

    @SerializedName("limit")
    public int limit;
}

