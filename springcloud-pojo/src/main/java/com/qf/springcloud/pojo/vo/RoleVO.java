package com.qf.springcloud.pojo.vo;

import com.qf.springcloud.pojo.entity.Role;
import lombok.Data;

import java.util.List;


/**
 * 作者：杜夫人
 * date: 2020/8/13
 */
@Data
public class RoleVO extends Role {
    List<PermissionVO> permissionVOS;
}
