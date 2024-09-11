import java.sql.*;

public class main {
    
    public static void main(String[] args) {
        System.out.println("hello");
try{
    Class.forName("com.mysql.jdbc.Driver");

    
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","12241");
    System.out.println("sssssssssssssssssss = "+con);

}catch(Exception e){
    System.out.println(e);
}

       /*  Connection c;
        // Statement s;
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","12241");    
        //   s =c.createStatement(); 
          System.out.println(c);
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  */
    
    }
}
