package com.edwin.myshop.commons.domain;


import com.edwin.myshop.commons.dto.AbstractBaseDomain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Table(name = "tb_user")
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "用户表")
public class TbUser extends AbstractBaseDomain {

    /**
     * 用户名
     */
    @NotNull(message = "用户名不可为空")
    @Length(min = 5, max = 20, message = "用户名长度必须介于 5 和 20 之间")
    @ApiModelProperty(value = "用户名",required = true)
    private String username;

    /**
     * 密码，加密存储
     */
    @JsonIgnore
    @ApiModelProperty(value = "密码",required = true)
    private String password;

    /**
     * 注册手机号
     */
    @ApiModelProperty(value = "手机号",required = true)
    private String phone;
    @ApiModelProperty(value = "邮箱",required = true)
    private String email;
}