package com.baoandev.demojdbcv2.model.service.impl;

import com.baoandev.demojdbcv2.model.entity.User;
import com.baoandev.demojdbcv2.model.repository.IUserRepository;
import com.baoandev.demojdbcv2.model.repository.impl.UserRepository;
import com.baoandev.demojdbcv2.model.service.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
    private final IUserRepository repository = new UserRepository();

    @Override
    public List<User> findAllUsers() {
        return repository.selectAllUsers();
    }

    @Override
    public User findUserById(int id) {
        return repository.selectUser(id);
    }

    @Override
    public void createUser(User user) {
        try {
            repository.insertUser(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateUser(User user) {
        try {
            repository.updateUser(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteUser(int id) {
        try {
            repository.deleteUser(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insertUpdateUseTransaction() {
        repository.insertUpdateUseTransaction();
    }
}
