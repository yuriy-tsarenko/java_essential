package com.cbs.java_essential.examples.lesson1;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {

    private Integer index;
    private String country;
    private String city;
    private String street;
    private Integer house;
    private String apartment;
}
