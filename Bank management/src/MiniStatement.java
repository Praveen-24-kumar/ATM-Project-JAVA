import java.awt.*;

import javax.swing.*;

// import com.mysql.cj.protocol.Resultset;

import java.sql.*;

public class MiniStatement extends JFrame{
    public  MiniStatement(String pinnumber){
        setLayout(null);

      JLabel mini=new JLabel();
      mini.setBounds(20,140,400,200);
      add(mini);

        JLabel bank=new JLabel("State Bank");
        bank.setBounds(150,20,100,20);
        add(bank);

        JLabel card=new JLabel();
        card.setBounds(20,80,300,20);
        add(card);

        JLabel balance=new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);


        try{
            conn c=new conn();
          ResultSet rs = c.s.executeQuery("select * from login where pin='"+pinnumber+"'");

          while (rs.next()) {
            card.setText("Card Number:"+rs.getString("Cardnumber").substring(0,4)+"xxxxxxxx"+rs.getString("cardnumber").substring(12));
          }
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            conn c=new conn();
            int bal=0;
            ResultSet rs=c.s.executeQuery("select * from bank where pin ='"+pinnumber+"'");
            while(rs.next()){
                mini.setText(mini.getText()+"<html>" + rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");

                if(rs.getString("type").equals("Deposite")){
                    bal += Integer.parseInt(rs.getString("amount"));
                }
                else{
                    bal -=Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your current balance is Rs "+bal);
        }catch(Exception e){
            System.out.println(e);
        }

        setSize(400,600);
        setLocation(20,20);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MiniStatement("");
    }
}
