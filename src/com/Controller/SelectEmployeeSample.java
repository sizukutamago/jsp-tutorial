package com.Controller;

import com.Model.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/employee")
public class SelectEmployeeSample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost/java-sample", "root", "");
            String sql = "SELECT * FROM employee";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            String id = null;
            String name = null;
            int age = 0;

            while (resultSet.next()) {
                id = resultSet.getString("id");
                name = resultSet.getString("name");
                age = resultSet.getInt("age");
            }

            Employee employee = new Employee(id, name, age);

            req.setAttribute("employee", employee);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/employee/index.jsp");
            dispatcher.forward(req, resp);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
