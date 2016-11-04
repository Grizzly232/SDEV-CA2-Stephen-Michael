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
        final int FEE_PAID_MAJORITY=750;
        final int FEE_PAID_HALF=1500;
        final int FEE_PAID_NONE=3000;
        String username1, password1;
        int attempts, overallAverageResult,  
            totalFee, totalPaidByGrant, totalPaidByStudent, 
            studentsProcessed, studentsWithGrant;
        
            
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
                      int selection, sDevResult, mathsResult, L2LResult,
                          compArchResult, averageResult;
 +                    System.out.println("You have selected "+"Calculate Student Grant");
 +                    String studentName;
 +                    String studentNumber;
 +                    System.out.println("Enter your name");
 +                    input.nextLine();
 +                    studentName = input.nextLine();
 +                    System.out.println("Enter your student number.");
 +                    studentNumber = input.nextLine();
 +                    while(Student_Number.charAt(0) != 'X'){
 +                        System.out.println("Invalid Student Number format. Number must begin with uppercase 'X'. Please re-enter.");
 +                        Student_Number = input.nextLine();
 +                    }
                      System.out.printf("%nCredentials accepted%nPlease enter your results for the following subjects:%nSoftware Development: %n");
                      sDevResult = input.nextInt();
                      System.out.println("Mathematics: ");
                      mathsResult = input.nextInt();
                      System.out.println("Learning to Learn: ");
                      L2LResult = input.nextInt();
                      System.out.println("Computer Architecture: ");
                      compArchResult = input.nextInt();
                      averageResult = (sDevResult + mathsResult + L2LResult + compArchResult) / 4;
                      (overallAverageResult += averageResult) / 2;
                      System.out.printf("%nStudent Name: %s%nStudent Number: %s%nYour average result is %d.%n", studentName, studentNumber, averageResult);
                      if(averageResult >= 90 && <= 100) {
                        totalFee = 0;
                        System.out.printf("Your total fee comes to %d. Your grant covers 100% of your fees.", totalFee);
                        studentsWithGrant++;
                        studentsProcessed++;
                        totalPaidByGrant += FEE_PAID_NONE;
                      }
                      if else(averageResult >= 75) {
                        totalFee = FEE_PAID_MAJORITY;
                        System.out.printf("Your total fee comes to %d. Your grant covers 75% of your fees.", totalFee);
                        studentsWithGrant++;
                        studentsProcessed++;
                        totalPaidByGrant += FEE_PAID_MAJORITY;
                        totalPaidByStudent += FEE_PAID_MAJORITY;
                      }
                      if else(averageResult >= 50) {
                        totalFee = FEE_PAID_HALF;
                        System.out.printf("Your total fee comes to %d. Your grant covers 50% of your fees.", totalFee);
                        studentsWithGrant++;
                        studentsProcessed++;
                        totalPaidByGrant += FEE_PAID_HALF;
                        totalPaidByStudent += FEE_PAID_HALF;
                      }
                      if else(averageResult < 50 {
                        totalFee = FEE_PAID_NONE;
                        System.out.printf("Your total fee comes to %d. Your grant covers 0% of your fees.", totalFee);
                        studentsProcessed++;
                        totalPaidByStudent += FEE_PAID_NONE;
                      }
                      else {
                        System.out.println("Invalid results.);
                      }
 +                    break;
 +                case 2:
 +                    System.out.println("Overall Average Result: " + overallAverageResult);
 +                    break;
 +                case 3:
 +                    System.out.println("You have selected"+"Fee Data");
                      System.out.printf("%nOverall fees paid by grant: %d%nOverall fees paid by student: %d%nStudents Processed: %d%nTotal number of students who recieved a grant: %d%n);                                       
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
