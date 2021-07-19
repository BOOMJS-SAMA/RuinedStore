package com.ruined.ruinedshoppingmall.controller;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select version()")
    String getVersion();
}
