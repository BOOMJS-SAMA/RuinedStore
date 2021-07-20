package com.ruined.store.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * @author BoomJs
 * @date 2021/7/19 20:41
 */
@Data
@ToString
@TableName(value = "ruin_user")
public class User {
    private Long id;
    private String Username;
    private String Password;
    private Boolean deleted;
    private String phone;
    private String address;
}
