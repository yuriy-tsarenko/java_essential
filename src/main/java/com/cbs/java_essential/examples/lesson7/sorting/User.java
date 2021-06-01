package com.cbs.java_essential.examples.lesson7.sorting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {

    private Integer id;
    private String username;
    private String password;
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private String jobTitle;
    private Integer office;
}
