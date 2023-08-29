package me.parker.springbootmybatismapping.domain;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@ToString
public class Movie {
    private String title;
    private Director director;
    private List<Genre> genres;
    private List<Actor> actors;
    private int runningTime;
    private LocalDate releaseDate;
}
