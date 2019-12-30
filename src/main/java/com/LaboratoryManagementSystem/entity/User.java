package com.LaboratoryManagementSystem.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * <pre>
 *     用户信息
 * </pre>
 *
 */
@Data
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = -5144055068797033748L;

    /**
     * 用户ID
     */
    @TableId(type = IdType.AUTO)
    private Long userId;

    /**
     * 用户名
     */
    private String userName;


    /**
     * 密码
     */
    private String userPass;

    /**
     * 用户类型
     */
    private String type;

    /**
     * 未读消息数
     */
    @TableField(exist = false)
    private Integer unReadSize;

    /**
     * Gets the value of userId.
     *
     * @return the value of userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the userId.
     *
     * @param userId userId
     * @return this
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Gets the value of userName.
     *
     * @return the value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the userName.
     *
     * @param userName userName
     * @return this
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets the value of userPass.
     *
     * @return the value of userPass
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * Sets the userPass.
     *
     * @param userPass userPass
     * @return this
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    /**
     * Gets the value of type.
     *
     * @return the value of type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type type
     * @return this
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the value of unReadSize.
     *
     * @return the value of unReadSize
     */
    public Integer getUnReadSize() {
        return unReadSize;
    }

    /**
     * Sets the unReadSize.
     *
     * @param unReadSize unReadSize
     * @return this
     */
    public void setUnReadSize(Integer unReadSize) {
        this.unReadSize = unReadSize;
    }
}
