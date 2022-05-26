package com.example.ex23;

public interface UserService {
    public User findByUsername(String username);
    public void create(User u);
    public void delete(User u);
}
