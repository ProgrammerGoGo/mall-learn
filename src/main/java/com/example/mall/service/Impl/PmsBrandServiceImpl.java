package com.example.mall.service.Impl;

import com.example.mall.mybatis.mapper.PmsBrandMapper;
import com.example.mall.mybatis.model.PmsBrand;
import com.example.mall.mybatis.model.PmsBrandExample;
import com.example.mall.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author programmerGoGo
 * @Description
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Override
    public List<PmsBrand> listAll() {
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }
}
