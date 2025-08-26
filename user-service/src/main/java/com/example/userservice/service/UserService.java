package com.example.userservice.service;

import com.example.userservice.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  /**
   * Fetches a user by ID.
   * For this sample, returns a dummy user.
   */
  public User getUserById(String id) {
    return new User(id, "Demo User", "demo.user@example.com");
  }
}