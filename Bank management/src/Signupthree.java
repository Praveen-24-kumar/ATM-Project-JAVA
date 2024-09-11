

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
// import java.sql.Statement;
import java.util.*;//for random number

import javax.swing.*;
public class Signupthree extends JFrame implements ActionListener {
    JButton submit,cancle;
    JRadioButton saving,fixed,current,recurring;
    JCheckBox atmcard,internet,mobile,emailsms,cheque,e_statement,termcondition;
    String formno;

    Signupthree( String formno){
        this.formno=formno;
        getContentPane().setBackground(Color.WHITE);
        setTitle("Account Details");
        setLayout(null);

        JLabel accountdetail=new JLabel("Page 3:  Account Details");
        accountdetail.setBounds(200,40,400,40);
        accountdetail.setFont(new Font("Arial",Font.BOLD,30));

        add(accountdetail);

        JLabel accounttype=new JLabel("Account Type");
        accounttype.setBounds(100,140,400,30);
        accounttype.setFont(new Font("Arial",Font.BOLD,20));
        add(accounttype);

         saving=new JRadioButton("Saving Account");
        saving.setBounds(140,180,200,30);
        saving.setFont(new Font("Arial",Font.BOLD,15));
        saving.setBackground(Color.WHITE);
        add(saving);

         fixed=new JRadioButton("Fixed Deposite Account");
        fixed.setBounds(450,180,400,30);
        fixed.setFont(new Font("Arial",Font.BOLD,15));
        fixed.setBackground(Color.WHITE);

        add(fixed);

         current=new JRadioButton("Current Account");
        current.setBounds(140,220,200,30);
        current.setFont(new Font("Arial",Font.BOLD,15));
        current.setBackground(Color.WHITE);
        add(current);

         recurring=new JRadioButton("Recurring  Deposite Account");
        recurring.setBounds(450,220,400,30);
        recurring.setFont(new Font("Arial",Font.BOLD,15));
        recurring.setBackground(Color.WHITE);
        add(recurring);

        // ButtonGroup accounttypes=new ButtonGroup();
        // accounttypes.add(saving);
        // accounttypes.add(fixed);
        // accounttypes.add(current);
        // accounttypes.add(recurring);


        JLabel card=new JLabel("Card Number ");
        card.setBounds(100,270,400,30);
        card.setFont(new Font("Arial",Font.BOLD,18));
        add(card);
        JLabel number=new JLabel("xxxx - xxxx - xxxx - 4184 ");
        number.setBounds(300,270,400,30);
        number.setFont(new Font("Arial",Font.BOLD,18));
        add(number);
        JLabel digit=new JLabel("Your 16digit card number ");
        digit.setBounds(100,300,400,15);
        digit.setFont(new Font("Arial",Font.BOLD,10));
        add(digit);



        JLabel pin=new JLabel("PIN ");
        pin.setBounds(100,320,400,30);
        pin.setFont(new Font("Arial",Font.BOLD,18));
        add(pin);
        JLabel num=new JLabel("xxxx");
        num.setBounds(300,320,400,30);
        num.setFont(new Font("Arial",Font.BOLD,18));
        add(num);
        JLabel fdigit=new JLabel("Your 4digit password ");
        fdigit.setBounds(100,350,400,15);
        fdigit.setFont(new Font("Arial",Font.BOLD,10));
        add(fdigit);


        JLabel servicereqired=new JLabel("Service Required");
        servicereqired.setBounds(100,380,400,30);
        servicereqired.setFont(new Font("Arial",Font.BOLD,20));
        add(servicereqired);
         atmcard=new JCheckBox("ATM CARD");
        atmcard.setBounds(140,420,200,30);
        atmcard.setFont(new Font("Arial",Font.BOLD,15));
        atmcard.setBackground(Color.WHITE);
        add(atmcard);

         internet=new JCheckBox("Internet Banking");
        internet.setBounds(450,420,400,30);
        internet.setFont(new Font("Arial",Font.BOLD,15));
        internet.setBackground(Color.WHITE);
        add(internet);

         mobile=new JCheckBox("Mobile Banking");
        mobile.setBounds(140,450,200,30);
        mobile.setFont(new Font("Arial",Font.BOLD,15));
        mobile.setBackground(Color.WHITE);
        add(mobile);

         emailsms=new JCheckBox("EMAIL & SMS Alert");
        emailsms.setBounds(450,450,400,30);
        emailsms.setFont(new Font("Arial",Font.BOLD,15));
        emailsms.setBackground(Color.WHITE);
        add(emailsms);
        
         cheque=new JCheckBox("Cheque Book");
        cheque.setBounds(140,480,200,30);
        cheque.setFont(new Font("Arial",Font.BOLD,15));
        cheque.setBackground(Color.WHITE);
        add(cheque);

         e_statement=new JCheckBox("E-Statement");
        e_statement.setBounds(450,480,400,30);
        e_statement.setFont(new Font("Arial",Font.BOLD,15));
        e_statement.setBackground(Color.WHITE);
        add(e_statement);
        

         termcondition=new JCheckBox("I hereby declares that the above  enterd details are correct to the best knowledge");
        termcondition.setBounds(100,550,800,30);
        termcondition.setFont(new Font("Arial",Font.BOLD,12));
        termcondition.setBackground(Color.WHITE);
        add(termcondition);

        submit=new JButton("Sumbit");
        submit.setBounds(200,600,100,30);
        submit.setFont(new Font("Arial",Font.BOLD,15));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        cancle=new JButton("Cancle");
        cancle.setBounds(400,600,100,30);
        cancle.setFont(new Font("Arial",Font.BOLD,15));
        cancle.setBackground(Color.BLACK);
        cancle.setForeground(Color.WHITE);
        cancle.addActionListener(this);
        add(cancle);


    setVisible(true);
    setSize(800,700);
    setLocation(320,60);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accounttype=null;
            if(saving.isSelected()){
                accounttype="Saving Account";
            }else if (current.isSelected()) {
                accounttype="Fixed Deposite Account";
            }else if (current.isSelected()) {
                accounttype="current Account";
            }else if (recurring.isSelected()) {
                accounttype="Recurring Deposite Account";
            }
            
            //for card number
            Random random= new Random(); 
            String cardnumber=""+Math.abs((random.nextLong()%90000000L)+5040936000000000L);
            // for pin number
            String pinnumber=""+Math.abs((random.nextLong()%9000L) + 1000L);

            //    JCheckBox atmcard,internet,mobile,emailsms,cheque,e_statement,termcondition;

            String facility="";
            if(atmcard.isSelected()){
                facility="ATM CARD";
            }else if (internet.isSelected()) {
                facility="Internet Banking";
            }else if (mobile.isSelected()) {
                facility="Mobile Banking";
            }else if (emailsms.isSelected()) {
                facility="EMAIL & SMS Alert";
            }else if (cheque.isSelected()) {
                facility="Cheque Book";
            }else if (e_statement.isSelected()) {
                facility="E-Statement";
            }
            
            try {
                if(accounttype.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is Required");
                }else{
                    conn con= new conn();
                    String query5="insert into signupthree values('"+formno+"','"+accounttype+"',"+cardnumber+","+pinnumber+",'"+facility+"')";
                    
                    String query6="insert into login values('"+formno+"','"+cardnumber+"',"+pinnumber+")";
                    con.s.executeUpdate(query5);
                    con.s.executeUpdate(query6);

                    JOptionPane.showMessageDialog(null, "Card Number:  "+ cardnumber+ "\n Pin:  "+ pinnumber);

                    setVisible(false);
                    new Deposite(pinnumber).setVisible(false);
                }
            } catch (Exception e) {
                System.out.println(e);
            }


        }else if(ae.getSource()==cancle){
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    
   
    public static void main(String[] args) {
        new Signupthree("");
    }
}