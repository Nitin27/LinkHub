package org.bootcamp.ttn.services;

import org.bootcamp.ttn.dto.UserLoginDto;
import org.bootcamp.ttn.dto.UserRegisterDto;
import org.bootcamp.ttn.dto.UserSessionDto;
import org.bootcamp.ttn.entities.User;
import org.springframework.stereotype.Controller;

public interface IUserService {
    Boolean registerUser(UserRegisterDto userRegisterDto);
    UserSessionDto validateUser(UserLoginDto userLoginDto);
    Boolean isUserNamePresent(String userName);
    Boolean isUserMailPresent(String userMail);
    UserSessionDto getUserDetails(String userName);
    User getUserId(String userName);
}
