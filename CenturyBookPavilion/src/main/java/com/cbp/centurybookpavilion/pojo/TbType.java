package com.cbp.centurybookpavilion.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "tb_type")
public class TbType {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String bookType;
    private Timestamp createTime;
    private Timestamp modifyTime;
}
