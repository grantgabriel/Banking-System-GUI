package pages;

import includes.User;

import javax.swing.*;
import java.awt.*;

class dashboard extends JPanel {
    private JLabel tes_welcum;

    public dashboard(User user) {
        setLayout(new BorderLayout());
        tes_welcum = new JLabel("Welcome, " + user.getName() + "!"+"\nYour money: "+user.getMoney());
        tes_welcum.setFont(new Font("Arial", Font.PLAIN, 20));
        tes_welcum.setHorizontalAlignment(SwingConstants.CENTER);
        add(tes_welcum, BorderLayout.CENTER);
    }
}
