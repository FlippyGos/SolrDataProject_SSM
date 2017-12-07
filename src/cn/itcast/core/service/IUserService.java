package cn.itcast.core.service;

import java.util.List;

import cn.itcast.core.pojo.User;

public interface IUserService {

	void addUser(User user);

	List<User> findAllUsers();

}
