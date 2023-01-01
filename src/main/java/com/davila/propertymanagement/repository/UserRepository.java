package com.davila.propertymanagement.repository;

import com.davila.propertymanagement.dto.UserDTO;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserRepository, Long> {

   UserDTO register(UserDTO userDTO);
   UserDTO login(String email, String password);

}
