package me.parker.springbootmybatismapping.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@ToString
public class SelectCriteria {
    private LocalDate releaseDate;
    private int runningTime;
}
