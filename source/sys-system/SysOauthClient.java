package com.fawkes.sys.system.common.model;

import com.fawkes.core.base.model.BaseEntity;
import java.io.Serializable;

public class SysOauthClient extends BaseEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_client.client_name
     *
     * @mbggenerated
     */
    private String clientName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_client.source
     *
     * @mbggenerated
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_client.client_id
     *
     * @mbggenerated
     */
    private String clientId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_client.client_secret
     *
     * @mbggenerated
     */
    private String clientSecret;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_client.redirect_uri
     *
     * @mbggenerated
     */
    private String redirectUri;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_client.alipay_public_key
     *
     * @mbggenerated
     */
    private String alipayPublicKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_client.union_id
     *
     * @mbggenerated
     */
    private Boolean unionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_client.stack_overflow_key
     *
     * @mbggenerated
     */
    private String stackOverflowKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_client.agent_id
     *
     * @mbggenerated
     */
    private String agentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_client.coding_croup_name
     *
     * @mbggenerated
     */
    private String codingCroupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_client.ignore_check_state
     *
     * @mbggenerated
     */
    private Boolean ignoreCheckState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_client.proxy_addr
     *
     * @mbggenerated
     */
    private String proxyAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_client.proxy_port
     *
     * @mbggenerated
     */
    private Integer proxyPort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_client.enable_proxy
     *
     * @mbggenerated
     */
    private Boolean enableProxy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oauth_client.tenant_id
     *
     * @mbggenerated
     */
    private Integer tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_oauth_client
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_client.client_name
     *
     * @return the value of sys_oauth_client.client_name
     *
     * @mbggenerated
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_client.client_name
     *
     * @param clientName the value for sys_oauth_client.client_name
     *
     * @mbggenerated
     */
    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_client.source
     *
     * @return the value of sys_oauth_client.source
     *
     * @mbggenerated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_client.source
     *
     * @param source the value for sys_oauth_client.source
     *
     * @mbggenerated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_client.client_id
     *
     * @return the value of sys_oauth_client.client_id
     *
     * @mbggenerated
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_client.client_id
     *
     * @param clientId the value for sys_oauth_client.client_id
     *
     * @mbggenerated
     */
    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_client.client_secret
     *
     * @return the value of sys_oauth_client.client_secret
     *
     * @mbggenerated
     */
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_client.client_secret
     *
     * @param clientSecret the value for sys_oauth_client.client_secret
     *
     * @mbggenerated
     */
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret == null ? null : clientSecret.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_client.redirect_uri
     *
     * @return the value of sys_oauth_client.redirect_uri
     *
     * @mbggenerated
     */
    public String getRedirectUri() {
        return redirectUri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_client.redirect_uri
     *
     * @param redirectUri the value for sys_oauth_client.redirect_uri
     *
     * @mbggenerated
     */
    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri == null ? null : redirectUri.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_client.alipay_public_key
     *
     * @return the value of sys_oauth_client.alipay_public_key
     *
     * @mbggenerated
     */
    public String getAlipayPublicKey() {
        return alipayPublicKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_client.alipay_public_key
     *
     * @param alipayPublicKey the value for sys_oauth_client.alipay_public_key
     *
     * @mbggenerated
     */
    public void setAlipayPublicKey(String alipayPublicKey) {
        this.alipayPublicKey = alipayPublicKey == null ? null : alipayPublicKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_client.union_id
     *
     * @return the value of sys_oauth_client.union_id
     *
     * @mbggenerated
     */
    public Boolean getUnionId() {
        return unionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_client.union_id
     *
     * @param unionId the value for sys_oauth_client.union_id
     *
     * @mbggenerated
     */
    public void setUnionId(Boolean unionId) {
        this.unionId = unionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_client.stack_overflow_key
     *
     * @return the value of sys_oauth_client.stack_overflow_key
     *
     * @mbggenerated
     */
    public String getStackOverflowKey() {
        return stackOverflowKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_client.stack_overflow_key
     *
     * @param stackOverflowKey the value for sys_oauth_client.stack_overflow_key
     *
     * @mbggenerated
     */
    public void setStackOverflowKey(String stackOverflowKey) {
        this.stackOverflowKey = stackOverflowKey == null ? null : stackOverflowKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_client.agent_id
     *
     * @return the value of sys_oauth_client.agent_id
     *
     * @mbggenerated
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_client.agent_id
     *
     * @param agentId the value for sys_oauth_client.agent_id
     *
     * @mbggenerated
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_client.coding_croup_name
     *
     * @return the value of sys_oauth_client.coding_croup_name
     *
     * @mbggenerated
     */
    public String getCodingCroupName() {
        return codingCroupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_client.coding_croup_name
     *
     * @param codingCroupName the value for sys_oauth_client.coding_croup_name
     *
     * @mbggenerated
     */
    public void setCodingCroupName(String codingCroupName) {
        this.codingCroupName = codingCroupName == null ? null : codingCroupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_client.ignore_check_state
     *
     * @return the value of sys_oauth_client.ignore_check_state
     *
     * @mbggenerated
     */
    public Boolean getIgnoreCheckState() {
        return ignoreCheckState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_client.ignore_check_state
     *
     * @param ignoreCheckState the value for sys_oauth_client.ignore_check_state
     *
     * @mbggenerated
     */
    public void setIgnoreCheckState(Boolean ignoreCheckState) {
        this.ignoreCheckState = ignoreCheckState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_client.proxy_addr
     *
     * @return the value of sys_oauth_client.proxy_addr
     *
     * @mbggenerated
     */
    public String getProxyAddr() {
        return proxyAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_client.proxy_addr
     *
     * @param proxyAddr the value for sys_oauth_client.proxy_addr
     *
     * @mbggenerated
     */
    public void setProxyAddr(String proxyAddr) {
        this.proxyAddr = proxyAddr == null ? null : proxyAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_client.proxy_port
     *
     * @return the value of sys_oauth_client.proxy_port
     *
     * @mbggenerated
     */
    public Integer getProxyPort() {
        return proxyPort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_client.proxy_port
     *
     * @param proxyPort the value for sys_oauth_client.proxy_port
     *
     * @mbggenerated
     */
    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_client.enable_proxy
     *
     * @return the value of sys_oauth_client.enable_proxy
     *
     * @mbggenerated
     */
    public Boolean getEnableProxy() {
        return enableProxy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_client.enable_proxy
     *
     * @param enableProxy the value for sys_oauth_client.enable_proxy
     *
     * @mbggenerated
     */
    public void setEnableProxy(Boolean enableProxy) {
        this.enableProxy = enableProxy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_oauth_client.tenant_id
     *
     * @return the value of sys_oauth_client.tenant_id
     *
     * @mbggenerated
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_oauth_client.tenant_id
     *
     * @param tenantId the value for sys_oauth_client.tenant_id
     *
     * @mbggenerated
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_oauth_client
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
        SysOauthClient other = (SysOauthClient) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getClientName() == null ? other.getClientName() == null : this.getClientName().equals(other.getClientName()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getClientSecret() == null ? other.getClientSecret() == null : this.getClientSecret().equals(other.getClientSecret()))
            && (this.getRedirectUri() == null ? other.getRedirectUri() == null : this.getRedirectUri().equals(other.getRedirectUri()))
            && (this.getAlipayPublicKey() == null ? other.getAlipayPublicKey() == null : this.getAlipayPublicKey().equals(other.getAlipayPublicKey()))
            && (this.getUnionId() == null ? other.getUnionId() == null : this.getUnionId().equals(other.getUnionId()))
            && (this.getStackOverflowKey() == null ? other.getStackOverflowKey() == null : this.getStackOverflowKey().equals(other.getStackOverflowKey()))
            && (this.getAgentId() == null ? other.getAgentId() == null : this.getAgentId().equals(other.getAgentId()))
            && (this.getCodingCroupName() == null ? other.getCodingCroupName() == null : this.getCodingCroupName().equals(other.getCodingCroupName()))
            && (this.getIgnoreCheckState() == null ? other.getIgnoreCheckState() == null : this.getIgnoreCheckState().equals(other.getIgnoreCheckState()))
            && (this.getProxyAddr() == null ? other.getProxyAddr() == null : this.getProxyAddr().equals(other.getProxyAddr()))
            && (this.getProxyPort() == null ? other.getProxyPort() == null : this.getProxyPort().equals(other.getProxyPort()))
            && (this.getEnableProxy() == null ? other.getEnableProxy() == null : this.getEnableProxy().equals(other.getEnableProxy()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_oauth_client
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
        result = prime * result + ((getClientName() == null) ? 0 : getClientName().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        result = prime * result + ((getRedirectUri() == null) ? 0 : getRedirectUri().hashCode());
        result = prime * result + ((getAlipayPublicKey() == null) ? 0 : getAlipayPublicKey().hashCode());
        result = prime * result + ((getUnionId() == null) ? 0 : getUnionId().hashCode());
        result = prime * result + ((getStackOverflowKey() == null) ? 0 : getStackOverflowKey().hashCode());
        result = prime * result + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        result = prime * result + ((getCodingCroupName() == null) ? 0 : getCodingCroupName().hashCode());
        result = prime * result + ((getIgnoreCheckState() == null) ? 0 : getIgnoreCheckState().hashCode());
        result = prime * result + ((getProxyAddr() == null) ? 0 : getProxyAddr().hashCode());
        result = prime * result + ((getProxyPort() == null) ? 0 : getProxyPort().hashCode());
        result = prime * result + ((getEnableProxy() == null) ? 0 : getEnableProxy().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_oauth_client
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clientName=").append(clientName);
        sb.append(", source=").append(source);
        sb.append(", clientId=").append(clientId);
        sb.append(", clientSecret=").append(clientSecret);
        sb.append(", redirectUri=").append(redirectUri);
        sb.append(", alipayPublicKey=").append(alipayPublicKey);
        sb.append(", unionId=").append(unionId);
        sb.append(", stackOverflowKey=").append(stackOverflowKey);
        sb.append(", agentId=").append(agentId);
        sb.append(", codingCroupName=").append(codingCroupName);
        sb.append(", ignoreCheckState=").append(ignoreCheckState);
        sb.append(", proxyAddr=").append(proxyAddr);
        sb.append(", proxyPort=").append(proxyPort);
        sb.append(", enableProxy=").append(enableProxy);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}