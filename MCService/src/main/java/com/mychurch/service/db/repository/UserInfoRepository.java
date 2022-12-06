package com.mychurch.service.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mychurch.service.db.model.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

}
