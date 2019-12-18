package com.example.demo.wxy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.demo.wxy.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户粉丝信息表
 * </p>
 *
 * @author Graciano
 * @since 2019-12-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("wxy_user_fan")
@ApiModel(value="UserFan对象", description="用户粉丝信息表")
public class UserFan extends BaseEntity {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "用户类型(1:普通用户 2:机构用户)")
    private Integer userType;

    @ApiModelProperty(value = "用户名称")
    private String userName;

    @ApiModelProperty(value = "粉丝名称")
    private String fanName;

    @ApiModelProperty(value = "是否拉黑(0:否,1:是)")
    private Boolean isBlacklist;

    @ApiModelProperty(value = "粉丝用户头像信息")
    private String fanAvatar;

    @ApiModelProperty(value = "粉丝用户ID")
    private Long fanId;

    @ApiModelProperty(value = "是否已加好友(0:否 1:是)")
    private Boolean isFriend;


}
