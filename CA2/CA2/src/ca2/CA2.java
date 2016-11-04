package ca2;

/**
 *
 * @author X00136103 + X00137811
 */
import java.util.Scanner;
public class CA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        final int Fee_paid_all=;
        final int Fee_paid_majority=;
        final int Fee_paid_half=;
        final int Fee_paid_none=;
        String Username1, Password1, Student_Name,Student_Number;
        int Attempts,Selection, SDev_Reuslt,Maths_Reuslt,L2L_Reuslt,
            CompArch_Reuslt,Average_Reuslt,Overall_Average_Reuslt, 
            Student_Amount_Paid,Number_Of_Students_Proccessed;
        
            
        System.out.println("Please enter your username");
        username1= key.nextLine();
        
        System.out.println("Please enter your password");
        password1= key.nextLine();
        
        System.out.println("Please confirm your password");
        attempts=0
        while ( attempts!= 3)
         if (input.nextLine().equals(password1)) {
         System.out.println("Password accepted");
        
        }
         else {
         System.out.println("Password or Username is incorrect");
         attempts++;
        }
        if (Attempts = 3){
        System.exit(0);
        }
        int Selection = 0
            
             while(Selection != 5){
 +            System.out.printf("Student Finance System%n"
 +                    + "1. Calculate Student Grant%n"
 +                    + "2. Current Overall Student Average%n"
 +                    + "3. Fee Data%n"
 +                    + "4. Grant Category Information%n"
 +                    + "5. Exit");
 +            System.out.println("Select option");
 +            Selection = input.nextInt();
 +            switch(Selection){
 +                case 1:
 +                    System.out.println("You have selected "+"Calculate Student Grant");
 +                    String Student_Name;
 +                    String Student_Number;
 +                    System.out.println("Enter your name");
 +                    input.nextLine();
 +                    Student_Name = input.nextLine();
 +                    System.out.println("Enter your student number.");
 +                    Student_Number = input.nextLine();
 +                    while(Student_Number.charAt(0) != 'X'){
 +                        System.out.println("Invalid Student Number format. Number must begin with uppercase 'X'. Please re-enter.");
 +                        Student_Number = input.nextLine();
 +                    }
 +                    break;
 +                case 2:
 +                    System.out.println("Option 2");
 +                    break;
 +                case 3:
 +                    System.out.println("Option 3");
 +                    break;
 +                case 4:
 +                    System.out.println("Option 4");
 +                    break;
 +                case 5:
 +                    System.exit(0);
 +                    break;
 +                default:
 +                    System.out.println("Invalid selection. Please re-enter");
 +                    break;
            
       
        
    }
    
}
