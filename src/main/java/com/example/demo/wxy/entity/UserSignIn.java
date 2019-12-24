package com.example.demo.wxy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import com.example.demo.wxy.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户签到表
 * </p>
 *
 * @author Graciano
 * @since 2019-12-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("wxy_user_sign_in")
@ApiModel(value="UserSignIn对象", description="用户签到表")
public class UserSignIn extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "签到日期")
    private LocalDate signInDate;

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "用户名称")
    private String userName;


}
