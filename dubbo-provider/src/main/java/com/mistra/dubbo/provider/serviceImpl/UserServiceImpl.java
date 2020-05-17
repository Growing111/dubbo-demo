package com.mistra.dubbo.provider.serviceImpl;



import com.alibaba.dubbo.config.annotation.Service;
import com.mistra.dubbo.api.UserService;
import com.mistra.dubbo.api.entity.User;
import com.mistra.dubbo.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;


@Service(version = "${mistra.service.version}")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String welcome(String name) {
        return "Hello" + name;
    }

    @Override
    public User getUserByid(String id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
