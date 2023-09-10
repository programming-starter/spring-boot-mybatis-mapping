package me.parker.springbootmybatismapping.entity;

import me.parker.springbootmybatismapping.mapper.MovieMapper;
import me.parker.springbootmybatismapping.model.Movie;
import me.parker.springbootmybatismapping.model.SelectCriteria;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

@MybatisTest
class MovieSelectTest {

    @Autowired
    private MovieMapper movieMapper;

    @Test
    void selectAll() {
        List<Movie> results = movieMapper.selectAll("DESC");
        results.forEach(System.out::println);
    }

    @Test
    void selectAllUsingResultMap() {
        List<Movie> movies = movieMapper.selectAll2();
        movies.forEach(System.out::println);
    }

    @Test
    void selectAllUsingNestedResultMap() {
        List<Movie> movies = movieMapper.selectAll3();
        movies.forEach(System.out::println);
    }

    @Test
    void selectAllUsingNestedSelect() {
        List<Movie> movies = movieMapper.selectAll4();
        movies.forEach(System.out::println);
    }

    @Test
    void selectByReleaseDateAndRunningTime() {
        Movie result = movieMapper.selectByReleaseDateAndRunningTime(
                LocalDate.of(2023, 1, 1), 180);
        System.out.println("result = " + result);
    }

    @Test
    void selectByReleaseDateAndRunningTime2() {
        Movie result = movieMapper.selectByReleaseDateAndRunningTime2(
                new SelectCriteria(LocalDate.of(2023, 1, 1), 180));
        System.out.println("result = " + result);
    }
}