package com.example.fittap;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UsersDao {

    @Insert
    void add(Users user);

    @Query("SELECT * FROM users")
    List<Users> getAll();

    @Query("SELECT * FROM users WHERE id = :id LIMIT 1")
    Users getUserById(long id);

    @Query("SELECT * FROM users WHERE name = :name AND password = :password LIMIT 1")
    Users getUserByNameSurnamePassword(String name, String password);

    @Query("SELECT id FROM users WHERE name = :name AND password = :password LIMIT 1")
    long getIdByNameSurnamePassword(String name, String password);

    @Delete
    void delete(Users user);

    @Update
    void updateUser(Users user);
}
