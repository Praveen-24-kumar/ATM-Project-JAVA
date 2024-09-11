import javax.swing.*;
import java.awt.*;// for image
import java.awt.event.*;
import java.util.*;
public class Deposite extends JFrame implements ActionListener{
    JButton deposit,back;
    String pinnumber;//global variable
    JTextField amount;

     public Deposite(String pinnumber){
    setLayout(null);
    setTitle("Deposite");

    this.pinnumber=pinnumber;//take value from global

    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(0,0,900,900);
    add(image);
    
    JLabel text =new JLabel("Enter the amount you want to deposite");
    text.setForeground(Color.white);
    text.setBounds(180,300,400,20);
    text.setFont(new Font("arial",Font.BOLD,16));
    image.add(text);
    
     amount=new JTextField("");
    amount.setBounds(170,350,320,25);
    amount.setFont(new Font("Raleway",Font.BOLD,22));
    image.add(amount);

     deposit =new JButton("Deposit"); 
    deposit.setBounds(355,485,150,30);
    deposit.addActionListener(this);
    image.add(deposit);
    

     back =new JButton("Back");
    back.setBounds(355,520,150,30);
    back.addActionListener(this);
    image.add(back);







    setSize(900,900);
    setLocation(300,0);
    setVisible(true);
}
public void actionPerformed(ActionEvent ae){
    if (ae.getSource()== deposit) {
        String number=amount.getText();
        Date date=new Date();
        if(number.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
        }
        else{
            try{
                conn con=new conn();
                String query="insert into bank values( '"+pinnumber+"','"+date+"','Deposite','"+number+"')";

                con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs"+number+"Deposite Successfully");
                // setVisible(false);
                // new Transactions(pinnumber).setVisible(true);


            }catch(Exception e){
                System.out.println(e);
            }
                
                

        }
    }else if (ae.getSource()== back) { ///deposit to transaction
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    }
}
    public static void main(String[] args) {
        new Deposite("");
    }
    
}
