package com.fawkes.sys.msg.common.model.fawkes;

import com.fawkes.core.base.model.BaseEntity;
import java.io.Serializable;

public class SmsLog extends BaseEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sms_log.mobile
     *
     * @mbggenerated
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sms_log.parameter
     *
     * @mbggenerated
     */
    private String parameter;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sms_log.template
     *
     * @mbggenerated
     */
    private String template;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sms_log.template_type
     *
     * @mbggenerated
     */
    private String templateType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sms_log.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sms_log.tenant_id
     *
     * @mbggenerated
     */
    private Integer tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_sms_log
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sms_log.mobile
     *
     * @return the value of sys_sms_log.mobile
     *
     * @mbggenerated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sms_log.mobile
     *
     * @param mobile the value for sys_sms_log.mobile
     *
     * @mbggenerated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sms_log.parameter
     *
     * @return the value of sys_sms_log.parameter
     *
     * @mbggenerated
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sms_log.parameter
     *
     * @param parameter the value for sys_sms_log.parameter
     *
     * @mbggenerated
     */
    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sms_log.template
     *
     * @return the value of sys_sms_log.template
     *
     * @mbggenerated
     */
    public String getTemplate() {
        return template;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sms_log.template
     *
     * @param template the value for sys_sms_log.template
     *
     * @mbggenerated
     */
    public void setTemplate(String template) {
        this.template = template == null ? null : template.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sms_log.template_type
     *
     * @return the value of sys_sms_log.template_type
     *
     * @mbggenerated
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sms_log.template_type
     *
     * @param templateType the value for sys_sms_log.template_type
     *
     * @mbggenerated
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType == null ? null : templateType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sms_log.status
     *
     * @return the value of sys_sms_log.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sms_log.status
     *
     * @param status the value for sys_sms_log.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sms_log.tenant_id
     *
     * @return the value of sys_sms_log.tenant_id
     *
     * @mbggenerated
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sms_log.tenant_id
     *
     * @param tenantId the value for sys_sms_log.tenant_id
     *
     * @mbggenerated
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_sms_log
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
        SmsLog other = (SmsLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getParameter() == null ? other.getParameter() == null : this.getParameter().equals(other.getParameter()))
            && (this.getTemplate() == null ? other.getTemplate() == null : this.getTemplate().equals(other.getTemplate()))
            && (this.getTemplateType() == null ? other.getTemplateType() == null : this.getTemplateType().equals(other.getTemplateType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_sms_log
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getParameter() == null) ? 0 : getParameter().hashCode());
        result = prime * result + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        result = prime * result + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_sms_log
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mobile=").append(mobile);
        sb.append(", parameter=").append(parameter);
        sb.append(", template=").append(template);
        sb.append(", templateType=").append(templateType);
        sb.append(", status=").append(status);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}