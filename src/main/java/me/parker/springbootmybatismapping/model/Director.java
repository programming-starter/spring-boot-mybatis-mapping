package me.parker.springbootmybatismapping.model;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString(callSuper = true)
public class Director extends Person {
    private Long directorId;
    private int debutYear;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
