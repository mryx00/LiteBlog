package com.stylefeng.gunSelf.modular.system.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.stylefeng.gunSelf.modular.system.model.Dict;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 字典表 Mapper 接口
 * </p>
 *
 * @author stylefeng
 * @since 2017-07-11
 */
public interface DictMapper extends BaseMapper<Dict> {

    /**
     * 根据编码获取词典列表
     */
    List<Dict> selectByCode(@Param("code") String code);

    /**
     * 查询字典列表
     */
    List<Map<String, Object>> list(@Param("condition") String conditiion);

    /**
     * 查询字典中的全部信息,
     * 用于放入缓存中
     */
    List<Map<String,Object>> listCache();
}