package com.ruined.store.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

/**
 * @author BoomJs
 * @date 2021/7/19 20:42
 */
@Data
@TableName(value = "ruined_product")
@ToString
public class Product {
    private Long id;
    private String productName;
    private String productNumbering;
    private String productType;
    private String productPicture;
    private Boolean deleted;

}
