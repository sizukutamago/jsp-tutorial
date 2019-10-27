package com.Controller;

import com.Model.User;
import com.service.RegisterUserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/user/register")
public class RegisterUserController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String forwardPath = null;

        String action = req.getParameter("action");

        if (action == null) {
            forwardPath = "/WEB-INF/jsp/user/registerForm.jsp";
        } else if (action.equals("done")) {
            HttpSession session = req.getSession();
            User registerUser = (User) session.getAttribute("registerUser");
            RegisterUserService registerUserService = new RegisterUserService();
            registerUserService.execute(registerUser);

            session.removeAttribute("registerUser");
            forwardPath = "/WEB-INF/jsp/user/registerDone.jsp";
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher(forwardPath);
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        User registerUser = new User(id, name, password);

        HttpSession session = req.getSession();
        session.setAttribute("registerUser", registerUser);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/user/registerConfirm.jsp");
        dispatcher.forward(req, resp);
    }
}
