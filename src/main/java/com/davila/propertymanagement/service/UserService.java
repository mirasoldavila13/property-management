package com.davila.propertymanagement.service;

import com.davila.propertymanagement.dto.UserDTO;

public interface UserService {
    UserDTO register(UserDTO userDTO);
    UserDTO login(String email, String password);
}
