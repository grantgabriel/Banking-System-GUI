package pages;

import javax.swing.*;
import java.awt.*;

class dashboard extends JPanel {
    private JLabel tes_welcum;

    public dashboard(String username) {
        setLayout(new BorderLayout());
        tes_welcum = new JLabel("Welcome, " + username + "!");
        tes_welcum.setHorizontalAlignment(SwingConstants.CENTER);
        add(tes_welcum, BorderLayout.CENTER);
    }
}
