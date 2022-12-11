package com.atom.mall.tiny.controller;

import com.atom.mall.tiny.mbg.model.PmsBrand;
import com.atom.mall.tiny.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PmsBrandController {

    @Autowired
    private PmsBrandService pmsBrandService;

    @GetMapping("/myGetBrandList")
    public List<PmsBrand> myGetBrandList(){
        return pmsBrandService.listAllBrand();
    }
}
