package com.LaboratoryManagementSystem.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * <pre>
 *     消息信息
 * </pre>
 *
 */
@Data
@TableName("message")
public class Message implements Serializable {

    private static final long serialVersionUID = -5144055068797033748L;

    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 状态
     */
    private String status;

    /**
     * 内容
     */
    private String content;

    /**
     * 接受人
     */
    private Long userId;


    private Long createTime;

    /**
     * Gets the value of id.
     *
     * @return the value of id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id id
     * @return this
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the value of status.
     *
     * @return the value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     *
     * @param status status
     * @return this
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the value of content.
     *
     * @return the value of content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the content.
     *
     * @param content content
     * @return this
     */
    public void setContent(String content) {
        this.content = content;
    }

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
     * Gets the value of createTime.
     *
     * @return the value of createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * Sets the createTime.
     *
     * @param createTime createTime
     * @return this
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
