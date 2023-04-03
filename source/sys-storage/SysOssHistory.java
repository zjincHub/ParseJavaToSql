package com.fawkes.sys.storage.common.model;

import com.fawkes.core.base.model.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
* Created by Mybatis Generator on 2019/12/04
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysOssHistory extends BaseEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_history.file_token
     *
     * @mbggenerated
     */
    private String fileToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_history.file_name
     *
     * @mbggenerated
     */
    private String fileName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_history.bucket_name
     *
     * @mbggenerated
     */
    private String bucketName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_history.ext_name
     *
     * @mbggenerated
     */
    private String extName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_history.endpoint_key
     *
     * @mbggenerated
     */
    private String endpointKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_history.group_token
     *
     * @mbggenerated
     */
    private String groupToken;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_history.dir
     *
     * @mbggenerated
     */
    private String dir;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_history.size
     *
     * @mbggenerated
     */
    private String size;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_history.version
     *
     * @mbggenerated
     */
    private String version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_oss_history.object_name
     *
     * @mbggenerated
     */
    private String objectName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_oss_history
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_oss_history
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
        SysOssHistory other = (SysOssHistory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getFileToken() == null ? other.getFileToken() == null : this.getFileToken().equals(other.getFileToken()))
            && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getBucketName() == null ? other.getBucketName() == null : this.getBucketName().equals(other.getBucketName()))
            && (this.getExtName() == null ? other.getExtName() == null : this.getExtName().equals(other.getExtName()))
            && (this.getEndpointKey() == null ? other.getEndpointKey() == null : this.getEndpointKey().equals(other.getEndpointKey()))
            && (this.getGroupToken() == null ? other.getGroupToken() == null : this.getGroupToken().equals(other.getGroupToken()))
            && (this.getDir() == null ? other.getDir() == null : this.getDir().equals(other.getDir()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getObjectName() == null ? other.getObjectName() == null : this.getObjectName().equals(other.getObjectName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_oss_history
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
        result = prime * result + ((getFileToken() == null) ? 0 : getFileToken().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        result = prime * result + ((getExtName() == null) ? 0 : getExtName().hashCode());
        result = prime * result + ((getEndpointKey() == null) ? 0 : getEndpointKey().hashCode());
        result = prime * result + ((getGroupToken() == null) ? 0 : getGroupToken().hashCode());
        result = prime * result + ((getDir() == null) ? 0 : getDir().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_oss_history
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fileToken=").append(fileToken);
        sb.append(", fileName=").append(fileName);
        sb.append(", bucketName=").append(bucketName);
        sb.append(", extName=").append(extName);
        sb.append(", endpointKey=").append(endpointKey);
        sb.append(", groupToken=").append(groupToken);
        sb.append(", dir=").append(dir);
        sb.append(", size=").append(size);
        sb.append(", version=").append(version);
        sb.append(", objectName=").append(objectName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}