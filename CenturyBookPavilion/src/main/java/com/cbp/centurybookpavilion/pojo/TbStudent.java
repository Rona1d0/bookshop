package com.cbp.centurybookpavilion.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tb_student")
public class TbStudent {
    @TableId(type = IdType.AUTO,value = "student_id")
    private Integer studentId;
    private String studentName;
}
