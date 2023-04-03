package com.fawkes.sys.system.common.model;

import com.fawkes.core.base.model.BaseEntity;
import java.io.Serializable;

public class SysConfig extends BaseEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_system_config.password_strategy
     *
     * @mbggenerated
     */
    private String passwordStrategy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_system_config.interface_config
     *
     * @mbggenerated
     */
    private String interfaceConfig;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_system_config.conversation_management
     *
     * @mbggenerated
     */
    private String conversationManagement;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_system_config.multilingualism_config
     *
     * @mbggenerated
     */
    private String multilingualismConfig;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_system_config.login_strategy
     *
     * @mbggenerated
     */
    private String loginStrategy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_system_config
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_system_config.password_strategy
     *
     * @return the value of sys_system_config.password_strategy
     *
     * @mbggenerated
     */
    public String getPasswordStrategy() {
        return passwordStrategy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_system_config.password_strategy
     *
     * @param passwordStrategy the value for sys_system_config.password_strategy
     *
     * @mbggenerated
     */
    public void setPasswordStrategy(String passwordStrategy) {
        this.passwordStrategy = passwordStrategy == null ? null : passwordStrategy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_system_config.interface_config
     *
     * @return the value of sys_system_config.interface_config
     *
     * @mbggenerated
     */
    public String getInterfaceConfig() {
        return interfaceConfig;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_system_config.interface_config
     *
     * @param interfaceConfig the value for sys_system_config.interface_config
     *
     * @mbggenerated
     */
    public void setInterfaceConfig(String interfaceConfig) {
        this.interfaceConfig = interfaceConfig == null ? null : interfaceConfig.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_system_config.conversation_management
     *
     * @return the value of sys_system_config.conversation_management
     *
     * @mbggenerated
     */
    public String getConversationManagement() {
        return conversationManagement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_system_config.conversation_management
     *
     * @param conversationManagement the value for sys_system_config.conversation_management
     *
     * @mbggenerated
     */
    public void setConversationManagement(String conversationManagement) {
        this.conversationManagement = conversationManagement == null ? null : conversationManagement.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_system_config.multilingualism_config
     *
     * @return the value of sys_system_config.multilingualism_config
     *
     * @mbggenerated
     */
    public String getMultilingualismConfig() {
        return multilingualismConfig;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_system_config.multilingualism_config
     *
     * @param multilingualismConfig the value for sys_system_config.multilingualism_config
     *
     * @mbggenerated
     */
    public void setMultilingualismConfig(String multilingualismConfig) {
        this.multilingualismConfig = multilingualismConfig == null ? null : multilingualismConfig.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_system_config.login_strategy
     *
     * @return the value of sys_system_config.login_strategy
     *
     * @mbggenerated
     */
    public String getLoginStrategy() {
        return loginStrategy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_system_config.login_strategy
     *
     * @param loginStrategy the value for sys_system_config.login_strategy
     *
     * @mbggenerated
     */
    public void setLoginStrategy(String loginStrategy) {
        this.loginStrategy = loginStrategy == null ? null : loginStrategy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_system_config
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
        SysConfig other = (SysConfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPasswordStrategy() == null ? other.getPasswordStrategy() == null : this.getPasswordStrategy().equals(other.getPasswordStrategy()))
            && (this.getInterfaceConfig() == null ? other.getInterfaceConfig() == null : this.getInterfaceConfig().equals(other.getInterfaceConfig()))
            && (this.getConversationManagement() == null ? other.getConversationManagement() == null : this.getConversationManagement().equals(other.getConversationManagement()))
            && (this.getMultilingualismConfig() == null ? other.getMultilingualismConfig() == null : this.getMultilingualismConfig().equals(other.getMultilingualismConfig()))
            && (this.getLoginStrategy() == null ? other.getLoginStrategy() == null : this.getLoginStrategy().equals(other.getLoginStrategy()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_system_config
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPasswordStrategy() == null) ? 0 : getPasswordStrategy().hashCode());
        result = prime * result + ((getInterfaceConfig() == null) ? 0 : getInterfaceConfig().hashCode());
        result = prime * result + ((getConversationManagement() == null) ? 0 : getConversationManagement().hashCode());
        result = prime * result + ((getMultilingualismConfig() == null) ? 0 : getMultilingualismConfig().hashCode());
        result = prime * result + ((getLoginStrategy() == null) ? 0 : getLoginStrategy().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_system_config
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", passwordStrategy=").append(passwordStrategy);
        sb.append(", interfaceConfig=").append(interfaceConfig);
        sb.append(", conversationManagement=").append(conversationManagement);
        sb.append(", multilingualismConfig=").append(multilingualismConfig);
        sb.append(", loginStrategy=").append(loginStrategy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}