package com.baoandev.demojdbcv2.model.repository;

import com.baoandev.demojdbcv2.model.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    void insertUser(User user) throws SQLException;

    User selectUser(int id);

    List<User> selectAllUsers();

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(User user) throws SQLException;

    void insertUpdateUseTransaction();
}
