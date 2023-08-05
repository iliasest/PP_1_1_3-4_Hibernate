package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        //Создание userService
        UserServiceImpl userService = new UserServiceImpl();

        //Создание таблицы
        userService.createUsersTable();

        //Добавление четырех юзеров в таблицу
        userService.saveUser("Barack", "Obama", (byte) 62);
        userService.saveUser("Orack", "Bobama", (byte) 62);
        userService.saveUser("Baram", "Obacka", (byte) 62);
        userService.saveUser("Baback", "Orama", (byte) 62);

        //Вывод юзеров из таблицы
        List<User> userList = userService.getAllUsers();
        for (User user: userList) {
            System.out.println(user);
        }

        //Очистка таблицы
        userService.cleanUsersTable();

        //Удаление таблицы
        userService.dropUsersTable();
    }
}
