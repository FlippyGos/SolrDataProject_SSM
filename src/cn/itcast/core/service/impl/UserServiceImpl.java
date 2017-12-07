package cn.itcast.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.core.dao.UserMapper;
import cn.itcast.core.index.IUserIndexRepository;
import cn.itcast.core.pojo.User;
import cn.itcast.core.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Resource
	private UserMapper userDao;
	
	@Resource
	private IUserIndexRepository userIndexRepository;
	
	/**
	 * 添加用户，同时向索引库中添加数据
	 */
	@Override
	public void addUser(User user) {
		//向数据库中添加数据
		userDao.insertSelective(user);
		//向索引库中添加数据
		userIndexRepository.save(user);
	}
	
	/**
	 *从所以库中查询查询所有用户
	 *List<User> --返回用户集合
	 */
	@Override
	public List<User> findAllUsers() {
		//从索引库中获取用户的全部数据
		Iterable<User> users = userIndexRepository.findAll();
		//创建用户集合
		List<User> usersList  = new ArrayList<User>();
		//将Iterable中的用户数据添加到用户集合中
		users.forEach(u -> {usersList.add(u);});
		return usersList;
	}
	

}
