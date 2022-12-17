package com.atom.mall.tiny.service.impl;

import com.atom.mall.tiny.mbg.mapper.PmsBrandMapper;
import com.atom.mall.tiny.mbg.model.PmsBrand;
import com.atom.mall.tiny.mbg.model.PmsBrandExample;
import com.atom.mall.tiny.service.PmsBrandService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PmsBrandServiceImpl implements PmsBrandService {

    @Resource
    private PmsBrandMapper pmsBrandMapper;

    /*@Override
    public List<PmsBrand> myListAllBrand() {
        return pmsBrandMapper.selectAllBrand();
    }
*/
    @Override
    public List<PmsBrand> listAllBrand() {
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public int createBrand(PmsBrand brand) {
        return pmsBrandMapper.insertSelective(brand);
    }

    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        brand.setId(id);
        return pmsBrandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int deleteBrand(Long id) {
        return pmsBrandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandMapper.selectByPrimaryKey(id);
    }
}
