package com.example.roleservice.core.service;

import com.example.roleservice.controller.datamodel.UserDataModel;
import com.example.roleservice.controller.datamodel.UserLoginDataModel;
import com.example.roleservice.controller.datamodel.UserLoginOutputDatenModel;

import java.util.List;

public interface UserService {

    String createUser(UserDataModel userDataModel);

    UserDataModel getUserById(long id);

    UserLoginOutputDatenModel authenticateUser(UserLoginDataModel user);

    List<UserDataModel> getAllUsers();
}
