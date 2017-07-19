package org.bootcamp.ttn.dao;

import org.bootcamp.ttn.dto.UserLoginDto;
import org.bootcamp.ttn.dto.UserRegisterDto;
import org.bootcamp.ttn.dto.UserSessionDto;
import org.bootcamp.ttn.entities.User;

public interface IUserDao {
    Boolean registerUser(UserRegisterDto userRegisterDto);
    User validateUser(UserLoginDto userLoginDto);
    Boolean isUserNamePresent(String userName);
    Boolean isUserMailPresent(String userMail);
    User getUserDetails(String userName);
}
