package com.gjc.aop.a_origin;

import com.gjc.aop.a_origin.service.DemoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/demo1")
public class DemoServlet extends HttpServlet {


    private DemoService demoService = (DemoService) BeanFactory.getBean("demoService");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        demoService.add("bearbear", 666);
        demoService.subtract("bearbear", 666);
    }
}
