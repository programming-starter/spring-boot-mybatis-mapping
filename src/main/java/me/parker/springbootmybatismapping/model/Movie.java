package me.parker.springbootmybatismapping.model;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@ToString
public class Movie {
    private Long movieId;
    private String title;
    private Director director;
    private List<Genre> genres;
    private int runningTime;
    private LocalDate releaseDate;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
