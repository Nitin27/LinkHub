package org.bootcamp.ttn.controllers;

import org.bootcamp.ttn.dto.UserLoginDto;
import org.bootcamp.ttn.dto.UserRegisterDto;
import org.bootcamp.ttn.dto.UserSessionDto;
import org.bootcamp.ttn.services.ITopicService;
import org.bootcamp.ttn.services.IUserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @Autowired
    IUserSevice iUserSevice;
    @Autowired
    ITopicService iTopicService;

    @RequestMapping(value = {"/home", "/"})
    ModelAndView fetchHomePage(Model model, HttpSession session, ModelAndView modelAndView, @ModelAttribute("errorLogin") String error) {
        ModelAndView fetchViewModel;
        if (session.isNew()||session.getAttribute("userName")==null) {
            fetchViewModel = new ModelAndView("home");
            if (!fetchViewModel.isEmpty()) {
                fetchViewModel.addObject("errorLogin", error);
            }
            model.addAttribute("userRegisterDto", new UserRegisterDto());
            model.addAttribute("userLoginDto", new UserLoginDto());
        } else
            fetchViewModel = new ModelAndView("redirect:/dashboard");
        return fetchViewModel;
    }

    @RequestMapping("/home/registerUser")
    ModelAndView registerUser(@ModelAttribute("userRegisterDto") UserRegisterDto userRegisterDto, HttpSession session) {
        Boolean isRegistered = iUserSevice.registerUser(userRegisterDto);
        ModelAndView modelAndView;
        if (isRegistered) {
            session.setAttribute("userName", userRegisterDto.getUserName());
            modelAndView = new ModelAndView("redirect:/dashboard");
            return modelAndView;
        } else {
            modelAndView = new ModelAndView("forward:/home");
            return modelAndView;
        }

    }

    @RequestMapping("/home/userLogin")
    String loginUser(@ModelAttribute("userLoginDto") UserLoginDto userLoginDto, HttpSession session, BindingResult result, ModelMap model) {
        UserSessionDto user = iUserSevice.validateUser(userLoginDto);
        if (user == null) {
            model.addAttribute("errorLogin", "Try again wrong password");
            return "redirect:/home";
        } else {
            session.setAttribute("userName", user.getUserName());
            return "redirect:/dashboard";
        }
    }

    @RequestMapping("/dashboard")
    ModelAndView fetchController(Model model, HttpSession session) {
        ModelAndView modelAndView;
        if (session.isNew()||session.getAttribute("userName")==null) {
            modelAndView = new ModelAndView("redirect:/home");
        } else {
            String userName = (String) session.getAttribute("userName");
            UserSessionDto user = iUserSevice.getUserDetails(userName);
            modelAndView = new ModelAndView("dashboard");
            modelAndView.addObject("user", user);
        }
        return modelAndView;
    }

    @RequestMapping("/logoutToHome")
    ModelAndView logoutUser(HttpSession session) {
        session.invalidate();
        return new ModelAndView("redirect:/home");
    }


    @RequestMapping("/dashboard/addTopic")
    @ResponseBody
    String saveUserTopic(@RequestParam("topicName") String topicName, @RequestParam("visibility") String visibility, HttpSession session) {
        if (iTopicService.addTopic(topicName, visibility, (String) session.getAttribute("userName")))
            return "TOPIC SAVED AT USER'S PROFILE";
        else
            return "TOPIC ADDITION FAILED TRY SOMETHING ELSE";
    }

    @RequestMapping("/dashboard/checkUniqueTopicName")
    @ResponseBody
    public String checkUniqueUserTopicName(@RequestParam("topicName") String topicName, HttpSession session) {
        Boolean check = iTopicService.isTopicNamePresent(topicName, (String) session.getAttribute("userName"));
        return check + "";
    }

//  AJAX CONTROLLERS

    @RequestMapping("/home/checkLoginUserName")
    @ResponseBody
    public String checkPresentUserName(@RequestParam("userName") String userName) {
        Boolean check = iUserSevice.isUserNamePresent(userName);
        return check.toString();
    }


    @RequestMapping("/home/checkRegisterUserName")
    @ResponseBody
    public String checkAvailableUserName(@RequestParam("userName") String userName) {
        Boolean check = iUserSevice.isUserNamePresent(userName);
        return check.toString();
    }


    @RequestMapping("/home/checkRegisterUserMail")
    @ResponseBody
    public String checkAvailableUserMail(@RequestParam("userMail") String userMail) {
        Boolean check = iUserSevice.isUserMailPresent(userMail);
        return check.toString();
    }
}
