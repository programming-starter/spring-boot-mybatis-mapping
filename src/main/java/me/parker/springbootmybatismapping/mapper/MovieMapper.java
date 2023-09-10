package me.parker.springbootmybatismapping.mapper;

import me.parker.springbootmybatismapping.model.Movie;
import me.parker.springbootmybatismapping.model.SelectCriteria;
import org.apache.ibatis.annotations.Mapper;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface MovieMapper {

    List<Movie> selectAll(String order);

    List<Movie> selectAll2();

    List<Movie> selectAll3();

    List<Movie> selectAll4();

    Movie selectByTitle(String title);

    Movie selectByReleaseDateAndRunningTime(LocalDate releaseDate, int runningTime);

    Movie selectByReleaseDateAndRunningTime2(SelectCriteria selectCriteria);
}
