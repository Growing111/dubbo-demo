package com.mistra.dubbo.provider.mapper;


import com.mistra.dubbo.api.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User getUserById(String Id);

    List<User> getAll();
}
