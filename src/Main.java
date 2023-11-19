import includes.Koneksi;
import includes.User;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();

        Koneksi koneksi = new Koneksi();
//        Scanner input = new Scanner(System.in);
        JFrame frame = new JFrame("Login");
        JLabel labelUsername = new JLabel("Username");
        JLabel labelPassword = new JLabel("Password");
        JTextField fieldUsername = new JTextField();
        JPasswordField fieldPassword = new JPasswordField();
        JButton buttonLogin = new JButton("Login");

        JPanel panel = new JPanel();
        panel.setLayout(null);
        labelUsername.setBounds(10, 10, 100, 30);
        labelPassword.setBounds(10, 50, 100, 30);
        fieldUsername.setBounds(110, 10, 100, 30);
        fieldPassword.setBounds(110, 50, 100, 30);
        buttonLogin.setBounds(10, 90, 100, 30);
        panel.add(labelUsername);
        panel.add(labelPassword);
        panel.add(fieldUsername);
        panel.add(fieldPassword);
        panel.add(buttonLogin);
        frame.add(panel);
        frame.setVisible(true);
        frame.setBounds(500, 100, 400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        buttonLogin.addActionListener(e -> {
            String name = fieldUsername.getText();
            String password = new String(fieldPassword.getPassword());
            String query = "SELECT * FROM user WHERE name = \"" + name + "\" AND password = \"" + password + "\"";
            koneksi.queryUser(query, user1);

            if (user1.getName() == null){
                System.out.println("User tidak ditemukan");
            } else {
                System.out.println("User ditemukan");
            }
        });

    }
}