package com.mychurch.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mychurch.service.common.BaseService;
import com.mychurch.service.db.repository.UserDetailRepository;
import com.mychurch.service.db.repository.UserInfoRepository;

@Service
public class UserServiceImpl extends BaseService implements IUserService {

	@Autowired
	private UserInfoRepository userInfoRepository;

	@Autowired
	private UserDetailRepository userDetailRepository;

}
