
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
// import com.toedter.calendar.JDateChooser;

public class Signupone extends JFrame implements ActionListener{
    
    long random;
    JButton nextbtn;
    JTextField nametextfield,fnametextfield,emailtextfield,addresstextfield,citytextfield,pintextfield,statetextfield;
    JRadioButton male,female,married,unmarried,other;
    String formno;
    JDateChooser dateChooser;
    Signupone(){   
        getContentPane().setBackground(Color.WHITE);
        setTitle("Personal Detail");
        Random ran=new Random();
        random =Math.abs((ran.nextLong()%9000L)+1000L);
        JLabel formno= new JLabel("Form no:-"+random);
        formno.setFont(new Font("Arial",Font.BOLD,15));
        formno.setBounds(650,20,150,30); 
        add(formno);

        JLabel head=new JLabel("APPLICATION FORM");
        head.setBounds(200,60,400,30);
        head.setFont(new Font("Algerian",Font.BOLD,40));
        add(head);

        JLabel text=new JLabel("Page no 1:  "+"Personal Details");
        text.setBounds(250,100,400,30);
        text.setFont(new Font("Arail",Font.BOLD,18));
        add(text);

        JLabel name=new JLabel("Name :-");
        name.setBounds(100,150,150,30);
        name.setFont(new Font("Arial",Font.BOLD,20));
        add(name);
        nametextfield=new JTextField();
        nametextfield.setBounds(300,150,300,30);
        nametextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(nametextfield);

        JLabel fname=new JLabel("Father's Name :-");
        fname.setBounds(100,200,250,30);
        fname.setFont(new Font("Arial",Font.BOLD,20));
        add(fname);
        fnametextfield=new JTextField();
        fnametextfield.setBounds(300,200,300,30);
        fnametextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(fnametextfield);

        // JLabel dob=new JLabel("Date of Birth :-");
        // dob.setBounds(100,250,300,30);
        // dob.setFont(new Font("Arial",Font.BOLD,20));
        // add(dob);
        // dateChooser=new JDateChooser();
        // dateChooser.setBounds(300,250,300,30);
        // dateChooser.setFont(new Font("Arial",Font.BOLD,15));
        // add(dateChooser);
        


        JLabel gender=new JLabel("Gender");
        gender.setBounds(100,300,250,30);
        gender.setFont(new Font("Arial",Font.BOLD,20));
        add(gender);
         male=new JRadioButton("Male");
        male.setBounds(300,300,100,30);
        male.setFont(new Font("Arial",Font.BOLD,20));
        male.setBackground(Color.WHITE);

        add(male);
        female=new JRadioButton("Female");
        female.setBounds(450,300,100,30);
        female.setFont(new Font("Arial",Font.BOLD,20));
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup group=new ButtonGroup();
        group.add(male);
        group.add(female);


        JLabel email=new JLabel("Email Id :-");
        email.setBounds(100,350,250,30);
        email.setFont(new Font("Arial",Font.BOLD,20));
        add(email);

        emailtextfield=new JTextField();
        emailtextfield.setBounds(300,350,300,30);
        emailtextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(emailtextfield);


        JLabel marital=new JLabel("Marital Status :-");
        marital.setBounds(100,400,250,30);
        marital.setFont(new Font("Arial",Font.BOLD,20));
        add(marital);
         married=new JRadioButton("Married");
        married.setBounds(300,400,100,30);
        married.setFont(new Font("Arial",Font.BOLD,20));
        married.setBackground(Color.WHITE);
        add(married);

         unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(400,400,130,30);
        unmarried.setFont(new Font("Arial",Font.BOLD,20));
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

         other=new JRadioButton("Other");
        other.setBounds(530,400,100,30);
        other.setFont(new Font("Arial",Font.BOLD,20));
        other.setBackground(Color.WHITE);
        add(other);
        ButtonGroup maritalgroup=new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        JLabel address=new JLabel("Address :-");
        address.setBounds(100,450,250,30);
        address.setFont(new Font("Arial",Font.BOLD,20));
        add(address);
         addresstextfield=new JTextField();
        addresstextfield.setBounds(300,450,300,30);
        addresstextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(addresstextfield);

        JLabel city=new JLabel("City :-");
        city.setBounds(100,500,250,30);
        city.setFont(new Font("Arial",Font.BOLD,20));
        add(city);
        citytextfield=new JTextField();
        citytextfield.setBounds(300,500,300,30);
        citytextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(citytextfield);


        JLabel pincode=new JLabel("Pincode :- ");
        pincode.setBounds(100,550,250,30);
        pincode.setFont(new Font("Arial",Font.BOLD,20));
        add(pincode);
        pintextfield=new JTextField();
        pintextfield.setBounds(300,550,300,30);
        pintextfield.setFont(new Font(" Arial ",Font.BOLD,15));
        add(pintextfield);


        JLabel state=new JLabel("State");
        state.setBounds(100,600,250,30);
        state.setFont(new Font("Arial ",Font.BOLD,20));
        add(state);
        statetextfield=new JTextField();
        statetextfield.setBounds(300,600,300,30);
        statetextfield.setFont(new Font("Arial",Font.BOLD,15));
        add(statetextfield);

        nextbtn=new JButton("Next");
        nextbtn.setBounds(650,650,100,40);
        nextbtn.setFont(new Font("Arial",Font.BOLD,20));
        nextbtn.setBackground(Color.BLACK);
        nextbtn.setForeground(Color.white);
        nextbtn.addActionListener(this);
        add(nextbtn);



        setLayout(null);
        setSize(800,750);
        setVisible(true);
        setLocation(200,50);


    }
    public void actionPerformed(ActionEvent ae){
        
        String formno=""+random;  
        String name=nametextfield.getText();
        String fname=fnametextfield.getText();
        // String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }
        else if (female.isSelected()) {
            gender="Female";
        }

        String email=emailtextfield.getText();
        String marital = null;
        if(married.isSelected()){
            marital="Maried";
        }
        else if(unmarried.isSelected()){
            marital="Ummarried";
        }
        else if(other.isSelected()){
            marital="Other";
        }
        String address=addresstextfield.getText();
        String city=citytextfield.getText();
        String pincode=citytextfield.getText();
        String state=statetextfield.getText();  

        try{
           
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                conn c = new conn();
                String query2 = "insert into signupone values('"+formno+"','"+name+"','"+fname+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c.s.executeUpdate(query2);
                
                setVisible(false);
                new Signuptwo(formno).setVisible(true);
            }
            
        }catch(Exception e){
             e.printStackTrace();
        }
            

    }
      
    public static void main(String[] args) {
        new Signupone();
    }
}

