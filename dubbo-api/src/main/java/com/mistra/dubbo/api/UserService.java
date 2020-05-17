package com.mistra.dubbo.api;

import com.mistra.dubbo.api.entity.User;

import java.util.List;


public interface UserService {

    /**
     *
     * @param name
     * @return
     */
    String welcome(String name);


    User getUserByid(String id);

    List<User> getAll();
}
