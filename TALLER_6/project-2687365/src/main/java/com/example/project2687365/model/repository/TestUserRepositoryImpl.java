package com.example.project2687365.model.repository;

import com.example.project2687365.model.User;

import java.sql.SQLException;

public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<User> repository = new UserRepositoryImpl();

        System.out.println("========== saveObj Insert ==========");
        User userInsert = new User();
        userInsert.setUser_firstname("daniel");
        userInsert.setUser_lastname("avila");
        userInsert.setUser_email("daniel@gmail.com");
        userInsert.setUser_password("1034278289");
        repository.saveObj(userInsert);
        User userInsert2 = new User();
        userInsert2.setUser_firstname("maicol");
        userInsert2.setUser_lastname("ayala");
        userInsert2.setUser_email("maicol@gmail.com");
        userInsert2.setUser_password("1034278289");
        repository.saveObj(userInsert2);

        System.out.println("========== listAllObj ==========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ===========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("========== saveObj ==========");
        User userUpdate = new User();
        userUpdate.setUser_id(2);
        userUpdate.setUser_firstname("luis");
        userUpdate.setUser_lastname("avila");
        userUpdate.setUser_email("avila@gmail.com");
        userUpdate.setUser_password("1034278289");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj =========");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);
    }
}
