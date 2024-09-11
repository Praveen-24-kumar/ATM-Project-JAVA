
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Signuptwo extends JFrame implements ActionListener{

    JButton nextbtn;
    JTextField adhartextfield,pantextfield;
    JRadioButton yes,no,yes1,no1;
    JComboBox religion1,category,incomeBox,educationbox,occupationbox;
    String formno;// take globally
     

    Signuptwo(String formno){   
        this.formno=formno;
        getContentPane().setBackground(Color.WHITE);
        setTitle("Additional Detail");


        JLabel text=new JLabel("Page no 2:"+"Additional Details");
        text.setBounds(200,40,400,40);
        text.setFont(new Font("Algerian",Font.BOLD,25));
        add(text);

        JLabel religion=new JLabel("Religion :-");
        religion.setBounds(100,150,150,30);
        religion.setFont(new Font("Arial",Font.BOLD,20));
        add(religion);
        
    
        String valReligion[]={" ","Hindu","Muslim","Sikh","Christain","other"};
        religion1= new JComboBox(valReligion);
        religion1.setBounds(300,150,300,30);
        religion1.setBackground(Color.WHITE);
        add(religion1);

        JLabel catergory=new JLabel("Category :-");
        catergory.setBounds(100,200,250,30);
        catergory.setFont(new Font("Arial",Font.BOLD,20));
        add(catergory);
        String valcatergory[]={" ","General","OBC","SC","ST","Other"};
         category= new JComboBox(valcatergory);
        category.setBounds(300,200,300,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        

        JLabel income=new JLabel("Income:-");
        income.setBounds(100,250,300,30);
        income.setFont(new Font("Arial",Font.BOLD,20));
        add(income);
        String valincome[]={"Null ","<150000","<2500000","<3500000","<4500000","<5500000"};
         incomeBox= new JComboBox(valincome);
        incomeBox.setBounds(300,250,300,30);
        incomeBox.setBackground(Color.WHITE);
        add(incomeBox);

        JLabel education=new JLabel("Education");
        education.setBounds(100,300,300,30);
        education.setFont(new Font("Arial",Font.BOLD,20));
        add(education);
        
        JLabel qulification=new JLabel("Qlification:-");
        qulification.setBounds(100,330,300,30);
        qulification.setFont(new Font("Arial",Font.BOLD,20));
        add(qulification);
        String valQulification[]={"","10th ","12th","UG(Undergragutae)","PG(Postgragutae)"};
        educationbox= new JComboBox(valQulification);
        educationbox.setBounds(300,330,300,30);
        educationbox.setBackground(Color.WHITE);
        add(educationbox);
        

        JLabel occupation=new JLabel("Occupation:-");
        occupation.setBounds(100,380,250,30);
        occupation.setFont(new Font("Arial",Font.BOLD,20));
        add(occupation);
        String valoccupation[]={"","Salaried ","Self-Employed","Business","Student","Retired","Other"};
       occupationbox= new JComboBox(valoccupation);
        occupationbox.setBounds(300,380,300,30);
        occupationbox.setBackground(Color.WHITE);
        add(occupationbox);
         add(occupationbox);
        JLabel pan=new JLabel("PAN Number :-");
        pan.setBounds(100,430,300,30);
        pan.setFont(new Font("Arial",Font.BOLD,20));
        add(pan);
        pantextfield=new JTextField();
        pantextfield.setBounds(300,430,300,30);
        pantextfield.setFont(new Font("Arial Narrow",Font.BOLD,15));
        add(pantextfield);


        JLabel pincode=new JLabel("Aadhar Number :- ");
        pincode.setBounds(100,480,450,30);
        pincode.setFont(new Font("Arial",Font.BOLD,20));
        add(pincode);
        adhartextfield=new JTextField();
        adhartextfield.setBounds(300,480,300,30);
        adhartextfield.setFont(new Font("Arial Narrow",Font.BOLD,15));
        add(adhartextfield);


        JLabel senior=new JLabel("Senior Citizen:-");
        senior.setBounds(100,530,250,30);
        senior.setFont(new Font("Arial",Font.BOLD,20));
        add(senior);
         yes=new JRadioButton("yes");
         yes.setBounds(300,530,100,30);
         yes.setFont(new Font("Arial",Font.BOLD,20));
         yes.setBackground(Color.WHITE);
        add(yes);

        no=new JRadioButton("No");
        no.setBounds(450,530,100,30);
        no.setFont(new Font("Arial",Font.BOLD,20));
        no.setBackground(Color.WHITE);
        add(no);
        ButtonGroup yesno=new ButtonGroup();
        yesno.add(yes);
        yesno.add(no);

        JLabel exisiting=new JLabel("Existing Account:-");
        exisiting.setBounds(100,580,250,30);
        exisiting.setFont(new Font("Arial",Font.BOLD,20));
        add(exisiting);

         yes1=new JRadioButton("yes");
         yes1.setBounds(300,580,100,30);
         yes1.setFont(new Font("Arial",Font.BOLD,20));
         yes1.setBackground(Color.WHITE);
        add(yes1);

        no1=new JRadioButton("No");
        no1.setBounds(450,580,100,30);
        no1.setFont(new Font("Arial",Font.BOLD,20));
        no1.setBackground(Color.WHITE);
        add(no1); 
        ButtonGroup yesno1=new ButtonGroup();
        yesno1.add(yes);
        yesno1.add(no);




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
        
            
        String religion=(String)religion1.getSelectedItem();//string es liya use kiya kiu ki religion1 oo ek object hai
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)incomeBox.getSelectedItem();
        String education=(String)educationbox.getSelectedItem();
        String occupation=(String)occupationbox.getSelectedItem();
        String panno=pantextfield.getText();
        String adhar=adhartextfield.getText();



        String seniorcitizen=null;
        if(yes.isSelected()){
            seniorcitizen="Yes";
        }
        else if (no.isSelected()) {
            seniorcitizen="NO";
        }

        String exisitingaccount = null;
        if(yes1.isSelected()){
            exisitingaccount="yes";
        }
        else if(no.isSelected()){
            exisitingaccount="NO";
        }
       
        try{
           
            if(religion.equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                conn c1 = new conn();
                String query2 = "insert into signuptwo values('"+formno+"','"+religion+"','"+scategory+"','"+sincome+"','"+education+"','"+occupation+"','"+panno+"','"+adhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";
                c1.s.executeUpdate(query2);
                    
                        //Signupthree obj
                        setVisible(false);
                        new Signupthree(formno).setVisible(true);;
            }
            
        }catch(Exception e){
             e.printStackTrace();
        }

        
    }
    public static void main(String[] args) {
        new Signuptwo("");
    }
      
    
}





