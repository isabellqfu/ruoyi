package com.ruoyi.message.mapper;

import java.util.List;
import com.ruoyi.message.domain.TblMch;

/**
 * 商户Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-29
 */
public interface TblMchMapper 
{
    /**
     * 查询商户
     * 
     * @param id 商户主键
     * @return 商户
     */
    public TblMch selectTblMchById(Long id);

    /**
     * 查询商户列表
     * 
     * @param tblMch 商户
     * @return 商户集合
     */
    public List<TblMch> selectTblMchList(TblMch tblMch);

    /**
     * 新增商户
     * 
     * @param tblMch 商户
     * @return 结果
     */
    public int insertTblMch(TblMch tblMch);

    /**
     * 修改商户
     * 
     * @param tblMch 商户
     * @return 结果
     */
    public int updateTblMch(TblMch tblMch);

    /**
     * 删除商户
     * 
     * @param id 商户主键
     * @return 结果
     */
    public int deleteTblMchById(Long id);

    /**
     * 批量删除商户
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTblMchByIds(Long[] ids);
}
