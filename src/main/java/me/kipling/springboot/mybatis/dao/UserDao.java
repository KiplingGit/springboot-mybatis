package me.kipling.springboot.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import me.kipling.springboot.mybatis.domain.User;

public interface UserDao {

	List<User> findByNameLike(@Param("strLike")String strLike);
}
