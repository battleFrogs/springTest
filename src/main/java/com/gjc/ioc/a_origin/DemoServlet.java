package com.gjc.ioc.a_origin;

import com.gjc.ioc.a_origin.service.DemoService;
import com.gjc.ioc.a_origin.service.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/demoIoc")
public class DemoServlet extends HttpServlet {


    private DemoService demoService = new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("DemoService run ....");
        List<String> all = demoService.findAll();
        System.out.println(all);
    }
}
