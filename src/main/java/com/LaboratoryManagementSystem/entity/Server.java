package com.LaboratoryManagementSystem.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 *     服务器信息
 * </pre>
 *
 */
@Data
@TableName("server")
public class Server implements Serializable {

    private static final long serialVersionUID = -5144055068797033748L;

    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 使用人
     */
    private String applyUserName;


    /**
     * 服务器名称
     */
    private String serverName;

    /**
     * 服务器状态
     */
    private String serverStatus;

    /**
     * 申请时间
     */
    private Long applyTime;

    /**
     * 释放时间
     */
    private Long releaseTime;

    /**
     * 项目名称
     */
    private String projectName;

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
     * Gets the value of applyUserName.
     *
     * @return the value of applyUserName
     */
    public String getApplyUserName() {
        return applyUserName;
    }

    /**
     * Sets the applyUserName.
     *
     * @param applyUserName applyUserName
     * @return this
     */
    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
    }

    /**
     * Gets the value of serverName.
     *
     * @return the value of serverName
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * Sets the serverName.
     *
     * @param serverName serverName
     * @return this
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * Gets the value of serverStatus.
     *
     * @return the value of serverStatus
     */
    public String getServerStatus() {
        return serverStatus;
    }

    /**
     * Sets the serverStatus.
     *
     * @param serverStatus serverStatus
     * @return this
     */
    public void setServerStatus(String serverStatus) {
        this.serverStatus = serverStatus;
    }

    /**
     * Gets the value of applyTime.
     *
     * @return the value of applyTime
     */
    public Long getApplyTime() {
        return applyTime;
    }

    /**
     * Sets the applyTime.
     *
     * @param applyTime applyTime
     * @return this
     */
    public void setApplyTime(Long applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * Gets the value of releaseTime.
     *
     * @return the value of releaseTime
     */
    public Long getReleaseTime() {
        return releaseTime;
    }

    /**
     * Sets the releaseTime.
     *
     * @param releaseTime releaseTime
     * @return this
     */
    public void setReleaseTime(Long releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * Gets the value of projectName.
     *
     * @return the value of projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the projectName.
     *
     * @param projectName projectName
     * @return this
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
