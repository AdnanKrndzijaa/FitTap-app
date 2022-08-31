package com.example.fittap;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface WorkoutsDao {

    @Insert
    void add(Workouts workout);

    @Query("SELECT * FROM workout")
    List<Workouts> getAll();

    @Query("SELECT * FROM workout WHERE id = :id LIMIT 1")
    Workouts getWorkoutById(long id);

    @Query("SELECT * FROM workout WHERE type = :type")
    List<Workouts> getByType(String type);

    @Delete
    void delete(Workouts workout);

    @Update
    void updateUser(Workouts workout);

    @Query("DELETE FROM workout")
    void deleteAll();
}
