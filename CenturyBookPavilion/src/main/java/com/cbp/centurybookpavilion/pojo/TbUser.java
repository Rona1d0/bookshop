package com.cbp.centurybookpavilion.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@TableName(value = "tb_user")
@Data
public class TbUser {
    @JSONField(name = "id")
    @TableField(fill = FieldFill.INSERT)
    @TableId(value = "id",type = IdType.AUTO)
    private int id;

    @JSONField(name = "username")
    private String username;

    @JSONField(name = "password")
    private String password;

    @JSONField(name = "email")
    private String email;

    @JSONField(name = "icon")
    private String icon;

    @JSONField(name = "nickname")
    private String nickname;

    @JSONField(name = "age")
    private int age;

    @JSONField(name = "gender")
    private String gender;

    @JSONField(name = "location")
    private String location;

    @JSONField(name = "status")
    private String status;

    @JSONField(name = "createtime")
    private String createtime;

    @JSONField(name = "modifytime")
    private String modifytime;
}
