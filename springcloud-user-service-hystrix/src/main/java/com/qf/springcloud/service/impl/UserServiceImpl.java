package com.qf.springcloud.service.impl;


import com.qf.springcloud.dao.UserDao;
import com.qf.springcloud.pojo.dto.ResponseDTO;
import com.qf.springcloud.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 作者：杜夫人
 * date: 2020/9/15
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public ResponseDTO findUserById(Long id) {
        return ResponseDTO.ok("查询成功", userDao.selectByPrimaryKey(id));
    }

    @Override
    public ResponseDTO findByNameAndPhone(String nickName, String phone) {
        return ResponseDTO.ok();
    }
}
