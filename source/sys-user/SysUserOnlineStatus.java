package com.fawkes.sys.user.common.model;

import com.fawkes.core.base.model.BaseEntity;
import java.io.Serializable;

public class SysUserOnlineStatus extends BaseEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_online_status.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_online_status.tenant_id
     *
     * @mbggenerated
     */
    private Integer tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_online_status.web_status
     *
     * @mbggenerated
     */
    private Integer webStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_online_status.app_status
     *
     * @mbggenerated
     */
    private Integer appStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user_online_status
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_online_status.user_id
     *
     * @return the value of sys_user_online_status.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_online_status.user_id
     *
     * @param userId the value for sys_user_online_status.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_online_status.tenant_id
     *
     * @return the value of sys_user_online_status.tenant_id
     *
     * @mbggenerated
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_online_status.tenant_id
     *
     * @param tenantId the value for sys_user_online_status.tenant_id
     *
     * @mbggenerated
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_online_status.web_status
     *
     * @return the value of sys_user_online_status.web_status
     *
     * @mbggenerated
     */
    public Integer getWebStatus() {
        return webStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_online_status.web_status
     *
     * @param webStatus the value for sys_user_online_status.web_status
     *
     * @mbggenerated
     */
    public void setWebStatus(Integer webStatus) {
        this.webStatus = webStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_online_status.app_status
     *
     * @return the value of sys_user_online_status.app_status
     *
     * @mbggenerated
     */
    public Integer getAppStatus() {
        return appStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_online_status.app_status
     *
     * @param appStatus the value for sys_user_online_status.app_status
     *
     * @mbggenerated
     */
    public void setAppStatus(Integer appStatus) {
        this.appStatus = appStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_online_status
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysUserOnlineStatus other = (SysUserOnlineStatus) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()))
            && (this.getWebStatus() == null ? other.getWebStatus() == null : this.getWebStatus().equals(other.getWebStatus()))
            && (this.getAppStatus() == null ? other.getAppStatus() == null : this.getAppStatus().equals(other.getAppStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_online_status
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        result = prime * result + ((getWebStatus() == null) ? 0 : getWebStatus().hashCode());
        result = prime * result + ((getAppStatus() == null) ? 0 : getAppStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_online_status
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", webStatus=").append(webStatus);
        sb.append(", appStatus=").append(appStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}