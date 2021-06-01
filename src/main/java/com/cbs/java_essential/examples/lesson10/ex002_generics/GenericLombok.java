package com.cbs.java_essential.examples.lesson10.ex002_generics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class GenericLombok<T, R> {

    private T typeTest;
    private R typeTest2;

    public static void main(String[] args) {
        GenericLombok<String, Integer> text = new GenericLombok<>("string", 12345);
        System.out.println(text);

        GenericLombok<Object, Object> string = GenericLombok.builder()
                .typeTest("string")
                .typeTest2(12345)
                .build();

        System.out.println(string);
    }
}
