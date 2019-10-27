package com.Controller;

import com.Model.Human;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/human")
public class HumanController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Human human = new Human("テスト", 22);
        req.setAttribute("human", human);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/human.jsp");
        dispatcher.forward(req, resp);
    }
}
