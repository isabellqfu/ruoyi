package com.ruoyi.message.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.annotation.Anonymous;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.message.domain.TblMch;
import com.ruoyi.message.service.ITblMchService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商户Controller
 *
 * @author ruoyi
 * @date 2024-03-29
 */
@Api(tags = "管理端-商户控制器") //配合swagger使用
@RestController
@RequestMapping("/message/mch")
public class TblMchController extends BaseController
{
    @Autowired
    private ITblMchService tblMchService;

    /**
     * 查询商户列表
     */

    @Anonymous
    @ApiOperation(value = "商户列表API")
    //@PreAuthorize("@ss.hasPermi('message:mch:list')")
    @GetMapping("/list")
    public TableDataInfo list(TblMch tblMch)
    {
        startPage();
        List<TblMch> list = tblMchService.selectTblMchList(tblMch);
        return getDataTable(list);
    }

    /**
     * 导出商户列表
     */
    @PreAuthorize("@ss.hasPermi('message:mch:export')")
    @Log(title = "商户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TblMch tblMch)
    {
        List<TblMch> list = tblMchService.selectTblMchList(tblMch);
        ExcelUtil<TblMch> util = new ExcelUtil<TblMch>(TblMch.class);
        util.exportExcel(response, list, "商户数据");
    }

    /**
     * 获取商户详细信息
     */
    @PreAuthorize("@ss.hasPermi('message:mch:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tblMchService.selectTblMchById(id));
    }

    /**
     * 新增商户
     */
    @PreAuthorize("@ss.hasPermi('message:mch:add')")
    @Log(title = "商户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TblMch tblMch)
    {
        return toAjax(tblMchService.insertTblMch(tblMch));
    }

    /**
     * 修改商户
     */
    @PreAuthorize("@ss.hasPermi('message:mch:edit')")
    @Log(title = "商户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TblMch tblMch)
    {
        return toAjax(tblMchService.updateTblMch(tblMch));
    }

    /**
     * 删除商户
     */
    @PreAuthorize("@ss.hasPermi('message:mch:remove')")
    @Log(title = "商户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tblMchService.deleteTblMchByIds(ids));
    }
}
