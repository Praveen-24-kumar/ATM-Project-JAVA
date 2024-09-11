
import javax.swing.*;
import java.awt.*;
// import java.util.*;
import java.awt.event.*;
import java.sql.*;// using ReslutSet 


public class Login extends JFrame implements ActionListener{

        JButton login,signin,clear,signup;
        JTextField cardTextField;
        JPasswordField pinTextField;
        
        public Login(){
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setTitle("AUTOMATIC TELLER MACHINE");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
        Image i2= i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text=new JLabel("Welcome to ATM");
        text.setBounds(200,60,500,40);
        text.setFont(new Font("Osward",Font.BOLD,40));
        add(text);


        JLabel cardno=new JLabel("CARD NO :");
        cardno.setBounds(150,150,200,30);
        cardno.setFont(new Font("arial",Font.BOLD,20));
        add(cardno);

        cardTextField=new JTextField();
        cardTextField.setBounds(270,150,250,30);
        cardTextField.setFont(new Font("Calibri Light (Headings)",Font.BOLD,15));
        add(cardTextField);

        JLabel pin=new JLabel("PIN :");
        pin.setBounds(150,200,200,30);
        pin.setFont(new Font("Calibri Light (Headings)",Font.BOLD,20));
        add(pin);
        pinTextField=new JPasswordField();
        pinTextField.setBounds(270,200,250,30);
        pinTextField.setFont(new Font("arial",Font.BOLD,15));
        add(pinTextField);


         signin=new JButton("SIGN IN");
        signin.setBounds(270,250,100,30);
        signin.setFont(new Font("arial",Font.BOLD,15));
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        signin.addActionListener(this);
        add(signin);

        clear=new JButton("CLEAR");
        clear.setBounds(420,250,100,30);
        clear.setFont(new Font("arial",Font.BOLD,15));
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup=new JButton("SIGN UP");
        signup.setBounds(290,300,200,30);
        signup.setFont(new Font("arial",Font.BOLD,15));
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);


        setSize(800,500);
        setVisible(true);
       setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if (ae.getSource() == signin) {
            conn con=new conn();
            String cardnumber=cardTextField.getText();
            String pinnumber=pinTextField.getText();
            String qurey="select * from login where cardnumber ='"+cardnumber+"' and pin='"+pinnumber+"'";
            try {
                ResultSet rs=con.s.executeQuery(qurey);
               if (rs.next()) {
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);// Transaction(pinnumber) forwading
               }
               else{
                JOptionPane.showMessageDialog(null, "Incorrect cardnumber and pin number ");
               }
            } catch (Exception e) {
                System.out.println(e);            
                }
        }
        else if (ae.getSource()==signup) {
           setVisible(false);
           new Signupone().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
    
}