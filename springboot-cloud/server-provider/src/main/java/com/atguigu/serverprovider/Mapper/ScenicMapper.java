package com.atguigu.serverprovider.Mapper;

import com.atguigu.serverprovider.Enity.Scenic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ScenicMapper {
    public List<Scenic> QueryScenicList() ;
}

