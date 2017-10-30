package com.home.serviceImpl;

import com.home.model.GFileUser;
import com.home.service.GFileUserService;
import org.springframework.stereotype.Service;

/**
 * Created by gateman on 17-10-30.
 */
@Service("userService")
public class GFileUserServiceImpl implements GFileUserService{
    @Override
    public GFileUser getUser(int id) {
        return new GFileUser(1,"Becky");
    }
}
