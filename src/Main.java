import includes.Koneksi;
import includes.User;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;

import static pages.login_page.createAndShowGUI;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        Koneksi koneksi = new Koneksi();

        SwingUtilities.invokeLater(() -> createAndShowGUI(user1, koneksi));

    }
}



