

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Transactions extends JFrame implements ActionListener {
    String pinnumber;//local varibal
    JButton deposit,withdraw,fastcase,mini,PinChange,balance,exit;
    
    Transactions(String pinnumber){ // from login forword pinnumber
        this.pinnumber=pinnumber; // local to global
        setLayout(null);
        setTitle("Transactions Details");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text=new JLabel("Please select your Transaction");
        text.setBounds(215,300,700,35);
        text.setFont(new Font("arial",Font.BOLD,16));
        text.setForeground(Color.white);
        image.add(text);

         deposit=new JButton("Deposit");
        deposit.setBounds(170,415,120,30);
        deposit.setFont(new Font("Arial",Font.BOLD,15));
        deposit.addActionListener(this);
        image.add(deposit);

        withdraw=new JButton("Cash Withdraw");
        withdraw.setBounds(350,415,150,30);
        withdraw.setFont(new Font("Arial",Font.BOLD,15));
        withdraw.addActionListener(this);
        image.add(withdraw);

         fastcase=new JButton("Fast Case");
        fastcase.setBounds(170,450,120,30);
        fastcase.setFont(new Font("Arial",Font.BOLD,15));
        fastcase.addActionListener(this);
        image.add(fastcase);

         mini=new JButton("Mini Statement");
        mini.setBounds(350,450,150,30);
        mini.setFont(new Font("Arial",Font.BOLD,15));
        mini.addActionListener(this);
        image.add(mini);

         PinChange=new JButton("Pin Change");
        PinChange.setBounds(170,485,120,30);
        PinChange.setFont(new Font("Arial",Font.BOLD,15));
        PinChange.addActionListener(this);
        image.add(PinChange);

         balance=new JButton("Balance Enquirey");
        balance.setBounds(350,485,150,30);
        balance.setFont(new Font("Arial",Font.BOLD,13));
        balance.addActionListener(this);
        image.add(balance);

         exit=new JButton("Exit ");
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
            System.exit(0);
        }else if(ae.getSource()== deposit){//deposite karne time pin number lena ke liya or transaction jump to depostie
            setVisible(false);
            new Deposite(pinnumber).setVisible(true);
        }
        else if (ae.getSource() == withdraw) {
            setVisible(false);
            new Withdraw(pinnumber).setVisible(true);
        }else if (ae.getSource()==fastcase) {
            setVisible(false);
            new Fastcase(pinnumber).setVisible(true);
        }
        else if (ae.getSource()==PinChange) {
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if(ae.getSource()==balance){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);

        }else if (ae.getSource()==mini) {
            // setVisible(false);
            new MiniStatement(pinnumber).setVisible(true);
        }

    }
 
    public static void main(String[] args) {
        new Transactions("");
    }
}
