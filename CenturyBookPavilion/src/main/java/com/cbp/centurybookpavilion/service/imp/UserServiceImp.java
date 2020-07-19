package com.cbp.centurybookpavilion.service.imp;

import com.cbp.centurybookpavilion.mapper.TbUserMapper;
import com.cbp.centurybookpavilion.pojo.TbUser;
import com.cbp.centurybookpavilion.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Resource
    private TbUserMapper userMapper;

    @Override
    public List<TbUser> selectList() {
        return userMapper.selectList(null);
    }
}
