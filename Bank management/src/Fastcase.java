

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;
public class Fastcase extends JFrame implements ActionListener {
    String pinnumber;//local varibal
    JButton deposit,withdraw,fastcase,mini,PinChange,balance,exit;
    
    Fastcase(String pinnumber){ // from login forword pinnumber
        this.pinnumber=pinnumber; // local to global
        setLayout(null);
        setTitle("Transactions Details");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text=new JLabel("SELECT WITHDRAW AMOUNT");
        text.setBounds(215,300,700,35);
        text.setFont(new Font("arial",Font.BOLD,16));
        text.setForeground(Color.white);
        image.add(text);

         deposit=new JButton("Rs 100");
        deposit.setBounds(170,415,120,30);
        deposit.setFont(new Font("Arial",Font.BOLD,15));
        deposit.addActionListener(this);
        image.add(deposit);

        withdraw=new JButton("Rs 500 ");
        withdraw.setBounds(350,415,150,30);
        withdraw.setFont(new Font("Arial",Font.BOLD,15));
        withdraw.addActionListener(this);
        image.add(withdraw);

         fastcase=new JButton("Rs 1000");
        fastcase.setBounds(170,450,120,30);
        fastcase.setFont(new Font("Arial",Font.BOLD,15));
        fastcase.addActionListener(this);
        image.add(fastcase);

         mini=new JButton("Rs 2000");
        mini.setBounds(350,450,150,30);
        mini.setFont(new Font("Arial",Font.BOLD,15));
        mini.addActionListener(this);
        image.add(mini);

         PinChange=new JButton("Rs 3000");
        PinChange.setBounds(170,485,120,30);
        PinChange.setFont(new Font("Arial",Font.BOLD,15));
        PinChange.addActionListener(this);
        image.add(PinChange);

         balance=new JButton("Rs 5000");
        balance.setBounds(350,485,150,30);
        balance.setFont(new Font("Arial",Font.BOLD,13));
        balance.addActionListener(this);
        image.add(balance);

         exit=new JButton("Back ");
        exit.setBounds(350,520,150,30);
        exit.setFont(new Font("Arial",Font.BOLD,15));
        exit.addActionListener(this);
        image.add(exit);



        setSize(900,900);
        setLocation(300,0);
        // setUndecorated(true); //tile bar hidden
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==exit){
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }else 
            {
                String amount =((JButton)ae.getSource()).getText().substring(3);//Rs 500
                conn c=new conn();
                String q="Select * from bank where pinnumber ='"+pinnumber+"'";
                // String totalBalance="";
                try{
                    ResultSet rs=c.s.executeQuery(q);
                    int balance=0;
                    while(rs.next()){
                        while (rs.next()) {
                            if (rs.getString("mode").equals("Deposit")) {
                                balance += Integer.parseInt(rs.getString("amount"));
                            } else {
                                balance -= Integer.parseInt(rs.getString("amount"));
                            }
                        
                        }
                    }
                        if(ae.getSource()!= exit && balance <Integer.parseInt(amount)){
                            JOptionPane.showMessageDialog(null,"Insufficient Balance");
                        return;
                        }
                    Date date=new Date();
                    String query="insert into bank(pinnumber,date,type,amount,remaning balance) values('"+pinnumber+"','"+date+"','Withdraw','"+amount+"')";
        
                     // String query="insert into bank values( '"+pinnumber+"','"+date+"','Withdraw','"+number+"')";
    

                    c.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs" + amount+ "Debited Successfully");

                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
               }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
       

    
    
    public static void main(String[] args) {
        new Fastcase("");
    }
}




