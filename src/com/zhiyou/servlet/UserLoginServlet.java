package com.zhiyou.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @Author:灵魂码仔
 * @Description:
 * @Time: created on 2021/1/22 16:32
 * @Email: 873227070@qq.com
 */
public class UserLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //编码设置
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //接收数据
        String username = req.getParameter("username");
        Object password = req.getAttribute("password");
        System.out.println("日志:");
    }
}
