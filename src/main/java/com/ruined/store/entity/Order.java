package com.ruined.store.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.util.Map;

/**
 * @author BoomJs
 * @date 2021/7/19 20:42
 */
@Data
@ToString
@TableName(value = "ruined_order")
public class Order {
    private Long id;
    private String orderNumbering;
    private Double orderPrice;
    private Map<String,String> order_products;
}
