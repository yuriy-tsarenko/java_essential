package com.cbs.java_essential.lesson7.enums.demo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Role {
    USER(1), ADMIN(2), SUPER_ADMIN(3), MODERATOR(4);

    private int code;
}
