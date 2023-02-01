package ru.mindigulov.projectbot;

// класс для проверки пользователя

import java.sql.SQLException;

public class Check {
    User user;

    public static boolean checking(User user) {

        try {
            SQL sql = new SQL();
            sql.setSQL("INSERT INTO public.\"Users\" (id, name) VALUES ('100', 'Jacky')");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
