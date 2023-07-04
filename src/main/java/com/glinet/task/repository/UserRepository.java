package com.glinet.task.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.glinet.task.entity.User;
import com.glinet.task.mapper.UserMapper;
import org.springframework.stereotype.Repository;


/**
* <p>
 *  表数据库访问层
 * </p>
*
* @author Clan Xie
* @since 2023-07-05
*/
@Repository
public class UserRepository extends ServiceImpl<UserMapper, User> {

}

