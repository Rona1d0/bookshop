package com.cbp.centurybookpavilion.service;

import com.cbp.centurybookpavilion.pojo.TbType;

import java.util.List;

public interface TypeService {
    List<TbType> getTypeList();
    TbType getTypeById(Integer id);
    int deleTypeById(Integer id);
    int updateType(TbType type);
}
