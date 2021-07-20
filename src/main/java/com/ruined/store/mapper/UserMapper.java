package com.ruined.store.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruined.store.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @author BoomJs
 * @date 2021/7/19 20:54
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    @Insert("insert into `ruined_user`(`username`, `password`) value (#{username} ,MD5(#{password})) ")
    public Integer registered(String username,String password);
}
