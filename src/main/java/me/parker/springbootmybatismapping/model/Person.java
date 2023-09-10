package me.parker.springbootmybatismapping.model;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@ToString
public class Person {
    private String name;
    private LocalDate birthDate;
    private Gender gender;
}
