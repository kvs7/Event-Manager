package com.example.jvcreations;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface userDao {

    @Query("select * from Users")
    List<UserDB> getALlUsers();

    @Insert
    void addUsr(UserDB userDB);
}
