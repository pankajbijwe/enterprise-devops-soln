package com.example.userservice.service;

import com.example.userservice.model.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

  private final UserService userService = new UserService();

  @Test
  void testGetUserById() {
    String id = "123";
    User user = userService.getUserById(id);

    assertNotNull(user);
    assertEquals(id, user.getId());
    assertEquals("Demo User", user.getName());
    assertTrue(user.getEmail().contains("@example.com"));
  }
}