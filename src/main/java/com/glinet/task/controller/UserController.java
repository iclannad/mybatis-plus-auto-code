package com.glinet.task.controller;

import com.glinet.task.service.UserService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 *  前端控制器
 *
 *
 * @author Clan Xie
 * @since 2023-07-05
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

}

