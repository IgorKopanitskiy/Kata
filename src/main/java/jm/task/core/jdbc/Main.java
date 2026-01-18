package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       UserServiceImpl userServiceImpl = new UserServiceImpl();

       //1. Создание таблицы User(ов)
       userServiceImpl.createUsersTable();

       //2. Добавление 4 User(ов) в таблицу с данными на свой выбор.
        userServiceImpl.saveUser("Michael", "Jordan", (byte) 23);
        userServiceImpl.saveUser("Kobe", "Bryant", (byte) 24);
        userServiceImpl.saveUser("Lebron", "James", (byte) 23);
        userServiceImpl.saveUser("Derrick", "Rose", (byte) 19);

        //3. Получение всех User из базы и вывод в консоль
        userServiceImpl.getAllUsers();

        //4. Очистка таблицы User(ов)
        userServiceImpl.cleanUsersTable();

        //5. Удаление таблицы
        userServiceImpl.dropUsersTable();

    }
}
