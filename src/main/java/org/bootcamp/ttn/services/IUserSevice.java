package org.bootcamp.ttn.services;

import org.bootcamp.ttn.dto.UserLoginDto;
import org.bootcamp.ttn.dto.UserRegisterDto;
import org.bootcamp.ttn.dto.UserSessionDto;
import org.springframework.stereotype.Controller;

/**
 * Created by Nitin Jain on 7/17/2017.
 */

public interface IUserSevice {
    Boolean registerUser(UserRegisterDto userRegisterDto);
    UserSessionDto validateUser(UserLoginDto userLoginDto);
    Boolean isUserNamePresent(String userName);
    Boolean isUserMailPresent(String userMail);
    UserSessionDto getUserDetails(String userName);
}
