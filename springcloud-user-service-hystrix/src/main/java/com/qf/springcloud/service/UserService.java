package com.qf.springcloud.service;


import com.qf.springcloud.pojo.dto.ResponseDTO;

/**
 * 作者：杜夫人
 * date: 2020/9/15
 */
public interface UserService {
    ResponseDTO findUserById(Long id);

    ResponseDTO findByNameAndPhone(String nickName, String phone);
}
