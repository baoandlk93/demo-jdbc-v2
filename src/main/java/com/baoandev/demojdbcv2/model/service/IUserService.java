package com.baoandev.demojdbcv2.model.service;

import com.baoandev.demojdbcv2.model.entity.User;

import java.util.List;

public interface IUserService {

    List<User> findAllUsers();

    User findUserById(int id);

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    void insertUpdateUseTransaction();
}
