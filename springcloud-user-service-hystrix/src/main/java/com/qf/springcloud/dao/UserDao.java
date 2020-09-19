package com.qf.springcloud.dao;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.qf.springcloud.pojo.entity.User;
import com.qf.springcloud.pojo.query.PageQuery;
import com.qf.springcloud.pojo.query.UserQuery;
import com.qf.springcloud.pojo.vo.GoodsVO;
import com.qf.springcloud.pojo.vo.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

public interface UserDao {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    UserVO selectUserVOByQuery(UserQuery query);

    List<UserVO> ajaxSplitList(PageQuery query);

    Integer ajaxSplitListCount(PageQuery query);

    List<UserVO> selectByCollection(@Param("ids") List<GoodsVO> goodsVOS);

    List<UserVO> selectByIds(@Param("ids") Collection ids);
}
