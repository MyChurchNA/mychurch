package com.mychurch.service.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mychurch.service.db.model.UserDetail;

public interface UserDetailRepository extends JpaRepository<UserDetail, String> {

}
