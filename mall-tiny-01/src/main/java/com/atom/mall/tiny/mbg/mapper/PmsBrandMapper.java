package com.atom.mall.tiny.mbg.mapper;

import com.atom.mall.tiny.mbg.model.PmsBrand;
import com.atom.mall.tiny.mbg.model.PmsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsBrandMapper {

    /**
     * 我写的，获取所有品牌信息
     * @return 品牌信息集合
     */
    List<PmsBrand> selectAllBrand();

    long countByExample(PmsBrandExample example);

    int deleteByExample(PmsBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsBrand row);

    int insertSelective(PmsBrand row);

    List<PmsBrand> selectByExampleWithBLOBs(PmsBrandExample example);

    List<PmsBrand> selectByExample(PmsBrandExample example);

    PmsBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") PmsBrand row, @Param("example") PmsBrandExample example);

    int updateByExampleWithBLOBs(@Param("row") PmsBrand row, @Param("example") PmsBrandExample example);

    int updateByExample(@Param("row") PmsBrand row, @Param("example") PmsBrandExample example);

    int updateByPrimaryKeySelective(PmsBrand row);

    int updateByPrimaryKeyWithBLOBs(PmsBrand row);

    int updateByPrimaryKey(PmsBrand row);
}
