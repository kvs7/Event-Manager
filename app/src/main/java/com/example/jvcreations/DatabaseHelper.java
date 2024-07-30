package com.example.jvcreations;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {UserDB.class}, exportSchema = false,version = 1)
public abstract class DatabaseHelper extends RoomDatabase {

    private static final String DB_NAME = "UsersDB";
    private static DatabaseHelper instance;


    public static synchronized DatabaseHelper getDB(Context context){
        if (instance==null){
            instance = Room.databaseBuilder(context, DatabaseHelper.class, DB_NAME)
                    .addMigrations()
                    .allowMainThreadQueries()
                    .build();
        }

        return instance;
    }

    public abstract userDao userDao();

}
