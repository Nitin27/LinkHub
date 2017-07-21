package org.bootcamp.ttn.controllers;

import org.bootcamp.ttn.dto.UserSessionDto;
import org.bootcamp.ttn.dto.UserSubscribedTopicDto;
import org.bootcamp.ttn.services.IResourceService;
import org.bootcamp.ttn.services.ISubscriptionService;
import org.bootcamp.ttn.services.ITopicService;
import org.bootcamp.ttn.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Nitin Jain on 7/22/2017.
 */
@Controller
public class DashboardController {

    @Autowired
    IUserService iUserSevice;
    @Autowired
    ITopicService iTopicService;
    @Autowired
    ISubscriptionService iSubscriptionService;
    @Autowired
    IResourceService iResourceService;

    @RequestMapping("/dashboard")
    ModelAndView fetchController(Model model, HttpSession session) {
        ModelAndView modelAndView;
        if (session.isNew() || session.getAttribute("userName") == null) {
            modelAndView = new ModelAndView("redirect:/home");
        } else {
            String userName = (String) session.getAttribute("userName");
            UserSessionDto user = iUserSevice.getUserDetails(userName);
            modelAndView = new ModelAndView("dashboard");
            modelAndView.addObject("user", user);
        }
        return modelAndView;
    }

    @RequestMapping("/dashboard/addTopic")
    @ResponseBody
    String saveUserTopic(@RequestParam("topicName") String topicName, @RequestParam("visibility") String visibility, HttpSession session) {
        if (iTopicService.addTopic(topicName, visibility, (String) session.getAttribute("userName")))
            return "TOPIC SAVED AT USER'S PROFILE";
        else
            return "TOPIC ADDITION FAILED TRY SOMETHING ELSE";
    }

    @RequestMapping("/dashboard/addLink")
    @ResponseBody
    String saveUserLink(@RequestParam("linkName") String linkName, @RequestParam("linkDescription") String linkDescription, @RequestParam("topic") Integer topicId, HttpSession session) {
        if (iResourceService.addLink(linkName, linkDescription, topicId, (String) session.getAttribute("userName")))
            return "LINK SHARED FOR YOUR SUBSCRIBED TOPIC";
        else
            return "UNABLE TO SHARE LINK TRY SOMETHING ELSE";
    }

    @RequestMapping("/dashboard/checkUniqueTopicName")
    @ResponseBody
    public String checkUniqueUserTopicName(@RequestParam("topicName") String topicName, HttpSession session) {
        Boolean check = iTopicService.isTopicNamePresent(topicName, (String) session.getAttribute("userName"));
        return check + "";
    }

    @RequestMapping("/dashboard/populateLinkResource")
    @ResponseBody
    List<UserSubscribedTopicDto> populateLinkedResourceForSubscription(HttpSession session) {
        String userName = (String) session.getAttribute("userName");
        List<UserSubscribedTopicDto> list = iSubscriptionService.fetchUserSubscribedTopic(userName);
        return list;
    }

    @RequestMapping("/logoutToHome")
    ModelAndView logoutUser(HttpSession session) {
        session.invalidate();
        return new ModelAndView("redirect:/home");
    }
}
