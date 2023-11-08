import includes.Koneksi;
import includes.User;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();

        Koneksi koneksi = new Koneksi();

        String name; String password;
        Scanner input = new Scanner(System.in);


//        String query = "SELECT * FROM user WHERE name = " + name + " AND password = " + password;

        koneksi.queryUser("SELECT * FROM user WHERE id = 0", user1);

        System.out.println(user1.getName());

//        Login dialog = new Login();
//        dialog.pack();
//        dialog.setVisible(true);
//        System.exit(0);
    }
}