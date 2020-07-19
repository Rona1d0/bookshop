package com.cbp.centurybookpavilion.controller;

import com.cbp.centurybookpavilion.pojo.TbType;
import com.cbp.centurybookpavilion.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;

@RestController
@RequestMapping("/type")
public class TypeController {
    //注入业务层对象
    @Autowired
    private TypeService typeService;

    @GetMapping(value = "/list")
    public List<TbType> getTypeList(){
        List<TbType> typeList = typeService.getTypeList();
        return typeList;
    }
    @GetMapping(value = "/list/{id}")
    public TbType getTypeById(@PathVariable Integer id){
        TbType type = typeService.getTypeById(id);
        return type;
    }

    @DeleteMapping(value = "/list")
    public int deleteTypeById(@RequestParam Integer id){
        //业务层添加、
        int i = typeService.deleTypeById(id);
        return i;
    }

    @PutMapping(value = "/list")
    public TbType updateType(@RequestBody TbType type){
        int result = typeService.updateType(type);
        if (result>0){
            return type;
        }else{
            return null;
        }
    }

}
