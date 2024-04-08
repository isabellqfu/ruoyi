package com.ruoyi.message.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.message.mapper.TblMchMapper;
import com.ruoyi.message.domain.TblMch;
import com.ruoyi.message.service.ITblMchService;

/**
 * 商户Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-29
 */
@Service
public class TblMchServiceImpl implements ITblMchService 
{
    @Autowired
    private TblMchMapper tblMchMapper;

    /**
     * 查询商户
     * 
     * @param id 商户主键
     * @return 商户
     */
    @Override
    public TblMch selectTblMchById(Long id)
    {
        return tblMchMapper.selectTblMchById(id);
    }

    /**
     * 查询商户列表
     * 
     * @param tblMch 商户
     * @return 商户
     */
    @Override
    public List<TblMch> selectTblMchList(TblMch tblMch)
    {
        return tblMchMapper.selectTblMchList(tblMch);
    }

    /**
     * 新增商户
     * 
     * @param tblMch 商户
     * @return 结果
     */
    @Override
    public int insertTblMch(TblMch tblMch)
    {
        tblMch.setCreateTime(DateUtils.getNowDate());
        return tblMchMapper.insertTblMch(tblMch);
    }

    /**
     * 修改商户
     * 
     * @param tblMch 商户
     * @return 结果
     */
    @Override
    public int updateTblMch(TblMch tblMch)
    {
        tblMch.setUpdateTime(DateUtils.getNowDate());
        return tblMchMapper.updateTblMch(tblMch);
    }

    /**
     * 批量删除商户
     * 
     * @param ids 需要删除的商户主键
     * @return 结果
     */
    @Override
    public int deleteTblMchByIds(Long[] ids)
    {
        return tblMchMapper.deleteTblMchByIds(ids);
    }

    /**
     * 删除商户信息
     * 
     * @param id 商户主键
     * @return 结果
     */
    @Override
    public int deleteTblMchById(Long id)
    {
        return tblMchMapper.deleteTblMchById(id);
    }
}
