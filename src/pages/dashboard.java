package pages;

import includes.User;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

class dashboard extends JPanel  {
    private JLabel tes_welcum;

    public dashboard(User user) {
        setLayout(new BorderLayout());
        tes_welcum = new JLabel("Welcome, " + user.getName() + "!"+"\nYour money: "+user.getMoney());
        tes_welcum.setFont(new Font("Arial", Font.PLAIN, 20));
        tes_welcum.setHorizontalAlignment(SwingConstants.CENTER);
        add(tes_welcum, BorderLayout.CENTER);
    }

    private static final Color backgroundColor = Color.WHITE;
    private static final Color foregroundColor = Color.BLACK;
    private static final Color successColor = Color.GREEN;
    private static final Color failureColor = Color.RED;
    private static final Font font = new Font("SansSerif", Font.BOLD, 16);
    private static final Font font1 = new Font("SansSerif", Font.BOLD, 14);
    private static final Font font2 = new Font("SansSerif", Font.BOLD, 22);
    private static final Font font3 = new Font("SansSerif",  Font.ITALIC, 14);

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField6;
    private JTextField textField7;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel ID;
    private JLabel last;
    private JLabel label6;
    private JLabel label8;
    private JLabel label9;

    private void initialize() {
        JFrame frame = new JFrame(); frame.setSize(500, 700);
        frame.setResizable(false);
        setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JPanel infoPanel = new JPanel();
        JPanel balancePanel = new JPanel();
        infoPanel.setLayout(new GridLayout(5, 1,2,2));
        balancePanel.setLayout(new GridLayout(4, 1,2,2));


        // Top image
        JPanel topPanel = new JPanel();
        JLabel logo = new JLabel();
        logo.setHorizontalAlignment(JLabel.LEFT);

//        logo.setIcon(icon);

        logo.setBorder(BorderFactory.createEmptyBorder(10,20,0,20));
        topPanel.add(logo);
        topPanel.setBackground(backgroundColor);
        topPanel.setForeground(foregroundColor);

        // Bottom image
        JPanel bottomPanel = new JPanel();
        JLabel copyright = new JLabel();
        copyright.setHorizontalAlignment(JLabel.LEFT);
//        ImageIcon icon2 = UserInterface.createImageIcon("./images/bottom.png");
//        copyright.setIcon(icon2);

        copyright.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        bottomPanel.add(copyright);

        // Logout Button
        JButton logout = new JButton();
//        ImageIcon l1 = UserInterface.createImageIcon("./images/logout.png");
//        ImageIcon l2 = UserInterface.createImageIcon("./images/logout2.png");
//        logout.setIcon(l1);
//        logout.setPressedIcon(l2);
        logout.setBackground(backgroundColor);
        logout.setBorderPainted(false);
        logout.setContentAreaFilled(false);
        logout.setFocusPainted(false);
        logout.setSize(new Dimension(10, 10));
        logout.setActionCommand("LOGOUT");
//        logout.addActionListener(this);

        //Line1 (AccountID)
        JPanel p = new JPanel();
        JLabel accID = new JLabel("Account ID: ");
        ID = new JLabel("N/A");
        accID.setFont(font);
        ID.setFont(font);
        p.add(accID);
        p.add(ID);
        p.add(logout);

        //Line2 ( name )
        JPanel panel1 = new JPanel();
        textField1 = new JTextField("N/A");
        textField1.setPreferredSize(new Dimension(200,40));
        textField1.setFont(font);
        textField1.setBorder(BorderFactory.createTitledBorder(new TitledBorder("Name:")));
        textField1.setForeground(foregroundColor);
        button1 = new JButton("Update");
        button1.setPreferredSize(new Dimension(140,40));
        button1.setFont(font1);
        button1.setBackground(foregroundColor);
        button1.setForeground(backgroundColor);
        button1.setActionCommand("NAME");
//        button1.addActionListener(this);
        panel1.add(textField1);
        panel1.add(button1);

        //Line3 ( last name )
        JPanel panel2 = new JPanel();
        textField2 = new JTextField("N/A");
        textField2.setPreferredSize(new Dimension(200,40));
        textField2.setFont(font);
        textField2.setBorder(BorderFactory.createTitledBorder(new TitledBorder("Last Name:")));
        textField2.setForeground(foregroundColor);
        button2 = new JButton("Update");
        button2.setPreferredSize(new Dimension(140,40));
        button2.setFont(font1);
        button2.setBackground(foregroundColor);
        button2.setForeground(backgroundColor);
        button2.setActionCommand("LASTNAME");
//        button2.addActionListener(this);
        panel2.add(textField2);
        panel2.add(button2);

        //Line4 ( Social Insurance Number )
        JPanel panel3 = new JPanel();
        textField3 = new JTextField("N/A");
        textField3.setPreferredSize(new Dimension(200,40));
        textField3.setFont(font);
        textField3.setBorder(BorderFactory.createTitledBorder(new TitledBorder("SIN:")));
        textField3.setForeground(foregroundColor);
        button3 = new JButton("Update");
        button3.setPreferredSize(new Dimension(140,40));
        button3.setFont(font1);
        button3.setBackground(foregroundColor);
        button3.setForeground(backgroundColor);
        button3.setActionCommand("SIN");
//        button3.addActionListener(this);
        panel3.add(textField3);
        panel3.add(button3);

        //Line5 ( BirthDate )
        JPanel panel4 = new JPanel();
        textField4 = new JTextField("N/A");
        textField4.setPreferredSize(new Dimension(200,40));
        textField4.setFont(font);
        textField4.setBorder(BorderFactory.createTitledBorder(new TitledBorder("Birth Date:")));
        textField4.setForeground(foregroundColor);
        button4 = new JButton("Update");
        button4.setPreferredSize(new Dimension(140,40));
        button4.setFont(font1);
        button4.setBackground(foregroundColor);
        button4.setForeground(backgroundColor);
        button4.setActionCommand("DATE");
//        button4.addActionListener(this);
        panel4.add(textField4);
        panel4.add(button4);


        //Balance Field
        JPanel panel5 = new JPanel();
        JLabel label5 = new JLabel("Balance: ");
        label6 = new JLabel("N/A");//balLeft
        JLabel label7 = new JLabel(".");
        label8 = new JLabel("N/A"); // balRight
        label9 = new JLabel("N/A");//currency

        label5.setFont(font2);
        label6.setFont(font2);
        label7.setFont(font2);
        label8.setFont(font2);
        label9.setFont(font2);
        panel5.setForeground(foregroundColor);
        panel5.add(label5);
        panel5.add(label6);
        panel5.add(label7);
        panel5.add(label8);
        panel5.add(label9);


        //Deposit Field
        JPanel panel6 = new JPanel();
        textField6 = new JTextField();
        textField6.setPreferredSize(new Dimension(200,40));
        textField6.setFont(font);
        textField6.setBorder(BorderFactory.createTitledBorder(new TitledBorder("Enter Amount:")));
        textField6.setForeground(foregroundColor);
        JButton button6 = new JButton("Deposit");
        button6.setPreferredSize(new Dimension(140,40));
        button6.setFont(font1);
        button6.setBackground(Color.RED);
        button6.setForeground(backgroundColor);
        button6.setActionCommand("DEPOSIT");
//        button6.addActionListener(this);
        panel6.add(button6);
        panel6.add(textField6);

        //Withdraw Field
        JPanel panel7 = new JPanel();
        textField7 = new JTextField();
        textField7.setPreferredSize(new Dimension(200,40));
        textField7.setFont(font);
        textField7.setBorder(BorderFactory.createTitledBorder(new TitledBorder("Enter Amount:")));
        textField7.setForeground(foregroundColor);
        JButton button7 = new JButton("Withdraw");
        button7.setPreferredSize(new Dimension(140,40));
        button7.setFont(font1);
        button7.setBackground(Color.BLUE);
        button7.setForeground(backgroundColor);
        button7.setActionCommand("WITHDRAW");
//        button7.addActionListener(this);
        panel7.add(button7);
        panel7.add(textField7);

        //Last Activity Line
        JPanel lastActivity = new JPanel();
        JLabel la = new JLabel("Last Activity: ");
        la.setFont(font3);
        last = new JLabel("N/A");
        last.setFont(font3);
        lastActivity.add(la);
        lastActivity.add(last);


        JPanel midPanel = new JPanel();
        infoPanel.add(p);
        infoPanel.add(panel1);
        infoPanel.add(panel2);
        infoPanel.add(panel3);
        infoPanel.add(panel4);
        balancePanel.add(panel5);
        balancePanel.add(panel6);
        balancePanel.add(panel7);
        balancePanel.add(lastActivity);

        midPanel.add(infoPanel);
        midPanel.add(balancePanel);


        this.add(topPanel,BorderLayout.PAGE_START);
        this.add(midPanel,BorderLayout.CENTER);
        this.add(bottomPanel,BorderLayout.PAGE_END);
    }
}
