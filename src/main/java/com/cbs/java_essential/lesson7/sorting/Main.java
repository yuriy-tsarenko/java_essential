package com.cbs.java_essential.lesson7.sorting;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        List<User> usersById = service.getUsersById();
        for (User user : usersById) {
            System.out.println(user);
        }
    }
}
