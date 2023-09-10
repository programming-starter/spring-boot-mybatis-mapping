package me.parker.springbootmybatismapping.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Genre {
    private Long genreId;
    private GenreType genreType;
}
