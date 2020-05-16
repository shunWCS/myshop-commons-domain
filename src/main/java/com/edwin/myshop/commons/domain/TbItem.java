package com.edwin.myshop.commons.domain;

import com.edwin.myshop.commons.dto.AbstractBaseDomain;
import com.edwin.myshop.commons.utils.DateUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "tb_item")
@Data
@ApiModel(value = "商品信息")
public class TbItem extends AbstractBaseDomain {
    /**
     * 商品id，同时也是商品编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品卖点
     */
    @Column(name = "sell_point")
    private String sellPoint;

    /**
     * 商品价格，单位为：分
     */
    private Long price;

    /**
     * 库存数量
     */
    private Integer num;

    /**
     * 商品条形码
     */
    private String barcode;

    /**
     * 商品图片
     */
    private String image;

    /**
     * 所属类目，叶子类目
     */
    private Long cid;

    /**
     * 商品状态，1-正常，2-下架，3-删除
     */
    private Byte status;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = DateUtils.FORMAT3)
    @JsonFormat(pattern = DateUtils.FORMAT3,timezone = DateUtils.TIMEZONE)
    private Date created;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = DateUtils.FORMAT3)
    @JsonFormat(pattern = DateUtils.FORMAT3,timezone = DateUtils.TIMEZONE)
    private Date updated;

}