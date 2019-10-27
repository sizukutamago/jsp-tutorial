package com.dao;

import com.Model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public List<Employee> findAll() {
        Connection connection = null;
        List<Employee> employeeList = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost/java-sample", "root", "");
            String sql = "SELECT * FROM employee";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                String id = result.getString("id");
                String name = result.getString("name");
                int age = result.getInt("age");
                Employee employee = new Employee(id, name, age);
                employeeList.add(employee);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }

        return employeeList;
    }
}
