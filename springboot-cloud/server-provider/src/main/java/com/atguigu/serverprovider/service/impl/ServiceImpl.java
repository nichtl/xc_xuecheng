package com.atguigu.serverprovider.service.impl;

import com.atguigu.serverprovider.Enity.Scenic;
import com.atguigu.serverprovider.Mapper.ScenicMapper;
import com.atguigu.serverprovider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements ProviderService {
    @Autowired
    private ScenicMapper scenicMapper;
    @Override
    public String getTickter() {
        return "8002出票成功";
    }

    @Override
    public List<Scenic> FindAllScenicMsg() {
        List<Scenic> s = scenicMapper.QueryScenicList();
        return  s;
    }
}
