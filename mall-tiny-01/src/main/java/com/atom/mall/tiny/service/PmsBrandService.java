package com.atom.mall.tiny.service;

import com.atom.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

public interface PmsBrandService {

    /*List<PmsBrand> myListAllBrand();*/

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);

}
