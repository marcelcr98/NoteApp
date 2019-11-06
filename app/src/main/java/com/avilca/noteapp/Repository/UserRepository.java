package com.avilca.noteapp.Repository;

import com.orm.SugarRecord;
import com.avilca.noteapp.Model.User;

public class UserRepository {

    public static User read(Long id){
        User user = SugarRecord.findById(User.class, id);
        return user;
    }
    public static void create (String username,String fullname,String email,String password){
        User user=new User(username,fullname,email,password);
        SugarRecord.save(user);
    }
}
