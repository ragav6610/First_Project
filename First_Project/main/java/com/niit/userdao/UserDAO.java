package com.niit.userdao;

import java.util.List;

import com.niit.model.User;

public interface UserDAO {
	public List<User> findAllUsers();
	public User findUserById(int id);
	public User findUserByName(String name);
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(int id);
}
