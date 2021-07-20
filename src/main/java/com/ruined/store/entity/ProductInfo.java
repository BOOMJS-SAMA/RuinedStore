package com.ruined.store.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author BoomJs
 * @date 2021/7/19 20:42
 */
@Data
@ToString
@TableName(value = "ruined_product_info")
public class ProductInfo {
    private Long id;
    private Long productInfoId;
    private Map<String,String> productInfoOption;
    private Double productOriginalPrice;
    private Double productCurrentPrice;
    private Long productInfoAmount;
    private String productInfoPicture;
    private Boolean deleted;
}
