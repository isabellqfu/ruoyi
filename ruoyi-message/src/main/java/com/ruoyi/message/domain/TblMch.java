package com.ruoyi.message.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 商户对象 tbl_mch
 * 
 * @author ruoyi
 * @date 2024-03-29
 */
public class TblMch extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 名称 */
    @Excel(name = "名称")
    private String name;

    /** 状态 */
    @Excel(name = "状态")
    private Integer available;

    /** 备注 */
    @Excel(name = "备注")
    private String description;

    /** 通信秘钥 */
    @Excel(name = "通信秘钥")
    private String apiSecret;

    /** 创建人ID */
    @Excel(name = "创建人ID")
    private String createById;

    /** 修改人ID */
    @Excel(name = "修改人ID")
    private String updateById;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAvailable(Integer available) 
    {
        this.available = available;
    }

    public Integer getAvailable() 
    {
        return available;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setApiSecret(String apiSecret) 
    {
        this.apiSecret = apiSecret;
    }

    public String getApiSecret() 
    {
        return apiSecret;
    }
    public void setCreateById(String createById) 
    {
        this.createById = createById;
    }

    public String getCreateById() 
    {
        return createById;
    }
    public void setUpdateById(String updateById) 
    {
        this.updateById = updateById;
    }

    public String getUpdateById() 
    {
        return updateById;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("available", getAvailable())
            .append("description", getDescription())
            .append("apiSecret", getApiSecret())
            .append("createBy", getCreateBy())
            .append("createById", getCreateById())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateById", getUpdateById())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
