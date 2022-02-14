package com.ucucs.rental.service;

import com.ucucs.rental.dao.CarUserMapper;
import com.ucucs.rental.entity.CarUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Usage Of File.
 *
 * @author ucucs Created at 14.02.2022
 */
@Service
public class UserService {

    @Autowired
    private CarUserMapper carUserMapper;

    public CarUser getUser(Integer userId) {
        return carUserMapper.selectByPrimaryKey(userId);
    }
}
