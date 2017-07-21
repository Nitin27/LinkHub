package org.bootcamp.ttn.services.impl;

import org.bootcamp.ttn.dao.IUserDao;
import org.bootcamp.ttn.dto.UserLoginDto;
import org.bootcamp.ttn.dto.UserRegisterDto;
import org.bootcamp.ttn.dto.UserSessionDto;
import org.bootcamp.ttn.entities.User;
import org.bootcamp.ttn.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    public Boolean registerUser(UserRegisterDto userRegisterDto) {
        return userDao.registerUser(userRegisterDto);
    }

    public UserSessionDto validateUser(UserLoginDto userLoginDto) {
        User user = userDao.validateUser(userLoginDto);
        if (user == null) {
            return null;
        } else {
            UserSessionDto userSessionDto = new UserSessionDto();
            userSessionDto.setUserName(user.getUserName());
            userSessionDto.setFirstName(user.getFirstName());
            userSessionDto.setLastName(user.getLastName());
            userSessionDto.setEmail(user.getEmail());
            userSessionDto.setActive(user.getActive());
            userSessionDto.setAdmin(user.getAdmin());
            return userSessionDto;
        }
    }

    public Boolean isUserNamePresent(String userName) {
        Boolean check = userDao.isUserNamePresent(userName);
        return check;
    }

    public Boolean isUserMailPresent(String userMail) {
        Boolean check = userDao.isUserMailPresent(userMail);
        return check;
    }

    public UserSessionDto getUserDetails(String userName) {
        User user = userDao.getUserDetails(userName);
        UserSessionDto userSessionDto = new UserSessionDto();
        if (user == null) {
            return null;
        } else {
            userSessionDto.setUserName(user.getUserName());
            userSessionDto.setFirstName(user.getFirstName());
            userSessionDto.setLastName(user.getLastName());
            userSessionDto.setEmail(user.getEmail());
            userSessionDto.setActive(user.getActive());
            userSessionDto.setAdmin(user.getAdmin());
            return userSessionDto;
        }
    }

    @Override
    public User getUserId(String userName) {
        User user = userDao.getUserDetails(userName);
        return user;
    }
}
