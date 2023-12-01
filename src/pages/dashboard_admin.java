package pages;

import includes.User;

import javax.swing.*;
import java.awt.*;

class dashboard_admin extends JPanel {
    private JLabel tes_welcum;

    public dashboard_admin(User user) {
        setLayout(new BorderLayout());
        tes_welcum = new JLabel("Admin COOOK, " + user.getName() + "!"+"\nYour money: "+user.getMoney());
        tes_welcum.setFont(new Font("Arial", Font.PLAIN, 20));
        tes_welcum.setHorizontalAlignment(SwingConstants.CENTER);
        add(tes_welcum, BorderLayout.CENTER);
    }
}
