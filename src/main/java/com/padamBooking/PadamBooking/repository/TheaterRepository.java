package com.padamBooking.PadamBooking.repository;

import com.padamBooking.PadamBooking.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Integer> {
    @Query("SELECT DISTINCT t FROM Theater t JOIN t.screens s JOIN s.showTimes st WHERE st.movie.id = :movieId")
    List<Theater> findTheatersByMovieId(Integer movieId);

    @Query("SELECT t FROM Theater t " +
            "JOIN FETCH t.screens s " +
            "JOIN FETCH s.showTimes st " +
            "JOIN FETCH st.seats se " +
            "WHERE st.movie.id = :movieId")
    List<Theater> findTheatreDetailsByMovieId(Integer movieId);
}
