package com.mychurch.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mychurch.service.common.BaseRest;
import com.mychurch.service.system.SystemVars;

@RestController
@RequestMapping(value = SystemVars.SYS_API_PREFIX + "/user/v1")
public class UserRestV1 extends BaseRest {

	@Autowired
	private IUserService userService;

}
