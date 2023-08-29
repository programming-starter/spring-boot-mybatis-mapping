package me.parker.springbootmybatismapping.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Person {
    private String name;
    private int age;
    private Gender gender;
}
