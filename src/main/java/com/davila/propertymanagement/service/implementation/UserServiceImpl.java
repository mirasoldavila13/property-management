package com.davila.propertymanagement.service.implementation;

import com.davila.propertymanagement.dto.UserDTO;
import com.davila.propertymanagement.repository.UserRepository;
import com.davila.propertymanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO register(UserDTO userDTO) {

        return null;
    }

    @Override
    public UserDTO login(String email, String password) {
        return null;
    }
}
