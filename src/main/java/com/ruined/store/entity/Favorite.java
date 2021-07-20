package com.ruined.store.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * @author BoomJs
 * @date 2021/7/19 20:43
 */
@Data
@ToString
@TableName(value = "ruined_favorite")
public class Favorite {
    private Long id;
    private Long userId;
    private Long productId;
    private Boolean valided;
}
