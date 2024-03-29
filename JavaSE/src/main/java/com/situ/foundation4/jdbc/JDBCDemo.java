package com.situ.foundation4.jdbc;

import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo {

    @Test
    public void test() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获得连接对象Connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/situ?useSSL=false" +
                    "&useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2b8", "root", "123456");
            //写sql语句
            String sql = "select id,name,age,gender from student";
            //建立statement
            statement = connection.createStatement();
            //执行sql语句
            //更新类（更改了表里面数据）：delete/update/insert   executeUpdate()
            //返回值：int，表示你影响的行数
            //查询（没有改变表里面数据）:  select  executeQuery()
            //返回值：结果集ResultSet
            resultSet = statement.executeQuery(sql);
            List<Student> list = new ArrayList<>();
            while (resultSet.next()) {//判断下一个还有没有
                //当前resultSet指向第一行
                //while每遍历一次，把这一行每个字段的值拿出来
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                Student student = new Student(id, name, age, gender);
                list.add(student);
            }
            System.out.println(list);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {//处理空值
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2() {
        Connection connection = null;
        Statement statement = null;
        //PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "select id,name,age,gender from student";
            //prepareStatement
            //preparedStatement = connection.prepareStatement(sql);
            //resultSet = preparedStatement.executeQuery();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            List<Student> list = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                Student student = new Student(id, name, age, gender);
                list.add(student);
            }
            System.out.println(list);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection, statement, resultSet);
        }
    }

    @Test
    public void testInsert() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "Insert into student(name,age,gender) values (?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "张三");
            preparedStatement.setInt(2, 23);
            preparedStatement.setString(3, "男");
            int count = preparedStatement.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection, preparedStatement, null);
        }
    }

    @Test
    public void testDelete() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "delete from student where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 7);
            int count = preparedStatement.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection, preparedStatement, null);
        }
    }

    @Test
    public void testUpdate() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "update student set name = ?, age = ?, gender = ? where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "李");
            preparedStatement.setInt(2, 24);
            preparedStatement.setString(3, "男");
            preparedStatement.setInt(4, 4);
            int count = preparedStatement.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection, preparedStatement, null);
        }
    }

    @Test
    public void testSelectLike() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "select id, name, age, gender from student where name like ? ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "李%");
            resultSet = preparedStatement.executeQuery();
            ArrayList<Student> students = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                Student student = new Student(id, name, age, gender);
                students.add(student);
            }
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection, preparedStatement, resultSet);
        }
    }
}
