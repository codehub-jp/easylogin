package com.example.easylogin.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.easylogin.model.entity.User;

@Repository
public interface UserRepository extends JpaRepositoryImplementation<User, Long> {
	List<User> findByUserNameAndPassword(String userName, String password);
}
