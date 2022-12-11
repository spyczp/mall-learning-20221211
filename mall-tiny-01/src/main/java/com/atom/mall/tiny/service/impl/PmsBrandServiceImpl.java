package com.atom.mall.tiny.service.impl;

import com.atom.mall.tiny.mbg.mapper.PmsBrandMapper;
import com.atom.mall.tiny.mbg.model.PmsBrand;
import com.atom.mall.tiny.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public List<PmsBrand> listAllBrand() {
        return pmsBrandMapper.selectAllBrand();
    }
}
