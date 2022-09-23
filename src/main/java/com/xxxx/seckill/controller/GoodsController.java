package com.xxxx.seckill.controller;

import com.xxxx.seckill.pojo.User;
import com.xxxx.seckill.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Date:2022/9/23 10:21
 * Author:jyq
 * Description:商品
 */

@Controller
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private IUserService userService;

    /**
     * 跳转商品列表页
     * @param session
     * @param model
     * @param ticket
     * @return
     */
    @RequestMapping("/toList")
    // public String toList(HttpServletRequest request, HttpServletResponse response, Model model, @CookieValue("userTicket") String ticket) {
    public String toList(Model model, User user) {
        // if (StringUtils.isEmpty(ticket)) {
        //     return "login";
        // }
        // // User user = (User) session.getAttribute(ticket);
        // User user = userService.getUserByCookie(ticket, request, response);
        // if (null == user) {
        //     return "login";
        // }
        model.addAttribute("user", user);
        return "goodsList";
    }

}
