package com.cbp.centurybookpavilion.service.imp;

import com.cbp.centurybookpavilion.mapper.TypeMapper;
import com.cbp.centurybookpavilion.pojo.TbType;
import com.cbp.centurybookpavilion.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TypeServiceImp implements TypeService {
    //注入dao对象
    @Resource
    private TypeMapper typeMapper;
    @Override
    public List<TbType> getTypeList() {
        //调用dao查询数据库
        List<TbType> typeList = typeMapper.selectList(null);
        return typeList;
    }

    @Override
    public TbType getTypeById(Integer id) {
        TbType tbType = typeMapper.selectById(id);
        return tbType;
    }

    @Override
    public int deleTypeById(Integer id) {
        return typeMapper.deleteById(id);
    }

    @Override
    public int updateType(TbType type) {
        return typeMapper.updateById(type);
    }
}
