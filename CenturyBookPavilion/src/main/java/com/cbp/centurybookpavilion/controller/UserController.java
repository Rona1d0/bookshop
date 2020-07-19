package com.cbp.centurybookpavilion.controller;

import com.cbp.centurybookpavilion.entity.Result;
import com.cbp.centurybookpavilion.entity.StatusCode;
import com.cbp.centurybookpavilion.pojo.TbUser;
import com.cbp.centurybookpavilion.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@Api(tags = "用户相关接口")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation( "查询所有用户")
    @GetMapping(value = "/list")
    public Result getUserList(){
        List<TbUser> userList = userService.selectList();
        return  new Result(true, StatusCode.OK,"成功",userList);
    }
}
