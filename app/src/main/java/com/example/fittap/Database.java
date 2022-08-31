package com.example.fittap;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {Users.class,Workouts.class},version = 1,exportSchema = false)
public abstract class Database extends RoomDatabase {
    public abstract UsersDao usersDao();
    public abstract WorkoutsDao workoutsDao();

    private static Database INSTANCE;

    public static Database getInsance(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context,Database.class,"app_database").allowMainThreadQueries().build();
        }
        return INSTANCE;
    }
}
