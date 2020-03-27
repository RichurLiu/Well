package com.well.service.impl;

import com.well.entity.User;
import com.well.mapper.UserMapper;
import com.well.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author RichurLiu
 * @since 2020-03-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
