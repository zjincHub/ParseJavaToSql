package com.fawkes.sys.system.common.model;

import com.fawkes.core.base.model.BaseEntity;

import java.io.Serializable;

public class SysOrg extends BaseEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.ent_name
     *
     * @mbggenerated
     */
    private String entName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.org_no
     *
     * @mbggenerated
     */
    private Integer orgNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.parent_no
     *
     * @mbggenerated
     */
    private Integer parentNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.parent_name
     *
     * @mbggenerated
     */
    private String parentName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.path_no
     *
     * @mbggenerated
     */
    private String pathNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.path_name
     *
     * @mbggenerated
     */
    private String pathName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.sort
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.type
     *
     * @mbggenerated
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.portal_id
     *
     * @mbggenerated
     */
    private Long portalId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.org_type
     *
     * @mbggenerated
     */
    private String orgType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.tenant_id
     *
     * @mbggenerated
     */
    private Integer tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.ext1
     *
     * @mbggenerated
     */
    private String ext1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.ext2
     *
     * @mbggenerated
     */
    private String ext2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.ext3
     *
     * @mbggenerated
     */
    private String ext3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.ext4
     *
     * @mbggenerated
     */
    private String ext4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_org.ext5
     *
     * @mbggenerated
     */
    private String ext5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_org
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.name
     *
     * @return the value of sys_org.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.name
     *
     * @param name the value for sys_org.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.ent_name
     *
     * @return the value of sys_org.ent_name
     *
     * @mbggenerated
     */
    public String getEntName() {
        return entName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.ent_name
     *
     * @param entName the value for sys_org.ent_name
     *
     * @mbggenerated
     */
    public void setEntName(String entName) {
        this.entName = entName == null ? null : entName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.org_no
     *
     * @return the value of sys_org.org_no
     *
     * @mbggenerated
     */
    public Integer getOrgNo() {
        return orgNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.org_no
     *
     * @param orgNo the value for sys_org.org_no
     *
     * @mbggenerated
     */
    public void setOrgNo(Integer orgNo) {
        this.orgNo = orgNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.parent_no
     *
     * @return the value of sys_org.parent_no
     *
     * @mbggenerated
     */
    public Integer getParentNo() {
        return parentNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.parent_no
     *
     * @param parentNo the value for sys_org.parent_no
     *
     * @mbggenerated
     */
    public void setParentNo(Integer parentNo) {
        this.parentNo = parentNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.parent_name
     *
     * @return the value of sys_org.parent_name
     *
     * @mbggenerated
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.parent_name
     *
     * @param parentName the value for sys_org.parent_name
     *
     * @mbggenerated
     */
    public void setParentName(String parentName) {
        this.parentName = parentName == null ? null : parentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.path_no
     *
     * @return the value of sys_org.path_no
     *
     * @mbggenerated
     */
    public String getPathNo() {
        return pathNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.path_no
     *
     * @param pathNo the value for sys_org.path_no
     *
     * @mbggenerated
     */
    public void setPathNo(String pathNo) {
        this.pathNo = pathNo == null ? null : pathNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.path_name
     *
     * @return the value of sys_org.path_name
     *
     * @mbggenerated
     */
    public String getPathName() {
        return pathName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.path_name
     *
     * @param pathName the value for sys_org.path_name
     *
     * @mbggenerated
     */
    public void setPathName(String pathName) {
        this.pathName = pathName == null ? null : pathName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.sort
     *
     * @return the value of sys_org.sort
     *
     * @mbggenerated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.sort
     *
     * @param sort the value for sys_org.sort
     *
     * @mbggenerated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.type
     *
     * @return the value of sys_org.type
     *
     * @mbggenerated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.type
     *
     * @param type the value for sys_org.type
     *
     * @mbggenerated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.portal_id
     *
     * @return the value of sys_org.portal_id
     *
     * @mbggenerated
     */
    public Long getPortalId() {
        return portalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.portal_id
     *
     * @param portalId the value for sys_org.portal_id
     *
     * @mbggenerated
     */
    public void setPortalId(Long portalId) {
        this.portalId = portalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.org_type
     *
     * @return the value of sys_org.org_type
     *
     * @mbggenerated
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.org_type
     *
     * @param orgType the value for sys_org.org_type
     *
     * @mbggenerated
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType == null ? null : orgType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.tenant_id
     *
     * @return the value of sys_org.tenant_id
     *
     * @mbggenerated
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.tenant_id
     *
     * @param tenantId the value for sys_org.tenant_id
     *
     * @mbggenerated
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.ext1
     *
     * @return the value of sys_org.ext1
     *
     * @mbggenerated
     */
    public String getExt1() {
        return ext1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.ext1
     *
     * @param ext1 the value for sys_org.ext1
     *
     * @mbggenerated
     */
    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.ext2
     *
     * @return the value of sys_org.ext2
     *
     * @mbggenerated
     */
    public String getExt2() {
        return ext2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.ext2
     *
     * @param ext2 the value for sys_org.ext2
     *
     * @mbggenerated
     */
    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.ext3
     *
     * @return the value of sys_org.ext3
     *
     * @mbggenerated
     */
    public String getExt3() {
        return ext3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.ext3
     *
     * @param ext3 the value for sys_org.ext3
     *
     * @mbggenerated
     */
    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.ext4
     *
     * @return the value of sys_org.ext4
     *
     * @mbggenerated
     */
    public String getExt4() {
        return ext4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.ext4
     *
     * @param ext4 the value for sys_org.ext4
     *
     * @mbggenerated
     */
    public void setExt4(String ext4) {
        this.ext4 = ext4 == null ? null : ext4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_org.ext5
     *
     * @return the value of sys_org.ext5
     *
     * @mbggenerated
     */
    public String getExt5() {
        return ext5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_org.ext5
     *
     * @param ext5 the value for sys_org.ext5
     *
     * @mbggenerated
     */
    public void setExt5(String ext5) {
        this.ext5 = ext5 == null ? null : ext5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
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
        SysOrg other = (SysOrg) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getEntName() == null ? other.getEntName() == null : this.getEntName().equals(other.getEntName()))
            && (this.getOrgNo() == null ? other.getOrgNo() == null : this.getOrgNo().equals(other.getOrgNo()))
            && (this.getParentNo() == null ? other.getParentNo() == null : this.getParentNo().equals(other.getParentNo()))
            && (this.getParentName() == null ? other.getParentName() == null : this.getParentName().equals(other.getParentName()))
            && (this.getPathNo() == null ? other.getPathNo() == null : this.getPathNo().equals(other.getPathNo()))
            && (this.getPathName() == null ? other.getPathName() == null : this.getPathName().equals(other.getPathName()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getPortalId() == null ? other.getPortalId() == null : this.getPortalId().equals(other.getPortalId()))
            && (this.getOrgType() == null ? other.getOrgType() == null : this.getOrgType().equals(other.getOrgType()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()))
            && (this.getExt1() == null ? other.getExt1() == null : this.getExt1().equals(other.getExt1()))
            && (this.getExt2() == null ? other.getExt2() == null : this.getExt2().equals(other.getExt2()))
            && (this.getExt3() == null ? other.getExt3() == null : this.getExt3().equals(other.getExt3()))
            && (this.getExt4() == null ? other.getExt4() == null : this.getExt4().equals(other.getExt4()))
            && (this.getExt5() == null ? other.getExt5() == null : this.getExt5().equals(other.getExt5()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
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
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getEntName() == null) ? 0 : getEntName().hashCode());
        result = prime * result + ((getOrgNo() == null) ? 0 : getOrgNo().hashCode());
        result = prime * result + ((getParentNo() == null) ? 0 : getParentNo().hashCode());
        result = prime * result + ((getParentName() == null) ? 0 : getParentName().hashCode());
        result = prime * result + ((getPathNo() == null) ? 0 : getPathNo().hashCode());
        result = prime * result + ((getPathName() == null) ? 0 : getPathName().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPortalId() == null) ? 0 : getPortalId().hashCode());
        result = prime * result + ((getOrgType() == null) ? 0 : getOrgType().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        result = prime * result + ((getExt1() == null) ? 0 : getExt1().hashCode());
        result = prime * result + ((getExt2() == null) ? 0 : getExt2().hashCode());
        result = prime * result + ((getExt3() == null) ? 0 : getExt3().hashCode());
        result = prime * result + ((getExt4() == null) ? 0 : getExt4().hashCode());
        result = prime * result + ((getExt5() == null) ? 0 : getExt5().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_org
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append(", entName=").append(entName);
        sb.append(", orgNo=").append(orgNo);
        sb.append(", parentNo=").append(parentNo);
        sb.append(", parentName=").append(parentName);
        sb.append(", pathNo=").append(pathNo);
        sb.append(", pathName=").append(pathName);
        sb.append(", sort=").append(sort);
        sb.append(", type=").append(type);
        sb.append(", portalId=").append(portalId);
        sb.append(", orgType=").append(orgType);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", ext1=").append(ext1);
        sb.append(", ext2=").append(ext2);
        sb.append(", ext3=").append(ext3);
        sb.append(", ext4=").append(ext4);
        sb.append(", ext5=").append(ext5);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}