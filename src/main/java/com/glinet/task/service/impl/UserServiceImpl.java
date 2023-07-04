package com.glinet.task.service.impl;

import com.glinet.task.repository.UserRepository;
import com.glinet.task.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Clan Xie
 * @since 2023-07-05
 */
@Service
public class UserServiceImpl  implements UserService {

    @Resource
    private UserRepository UserRepository;

}

