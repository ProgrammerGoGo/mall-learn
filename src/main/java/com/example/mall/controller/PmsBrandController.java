package com.example.mall.controller;

import com.example.mall.common.CommonResult;
import com.example.mall.mybatis.model.PmsBrand;
import com.example.mall.service.PmsBrandService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author programmerGoGo
 * @Description
 */
@RestController
@RequestMapping("/brand")
@Slf4j
public class PmsBrandController {

    @Autowired
    private PmsBrandService pmsBrandService;

    @GetMapping("/listAll")
    public CommonResult<List<PmsBrand>> listAll() {
        return CommonResult.success(pmsBrandService.listAll());
    }
}
