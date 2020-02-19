import java.util.Scanner;

public class BookStoreCredit {
    public static void main(String[] args){
           //vars & constns
            double gpa;  
            int mltplyr = 10;    
            String stuName;
        //scanner obj for userInput
        Scanner txt = new Scanner(System.in);

            //input phase -- start of interface for the app
            System.out.println("Enter your Name >>>");
            stuName = txt.nextLine();

            System.out.print("Enter your GPA >>>");
            gpa = txt.nextDouble();
            // calc phase -- calls seperate Method below (lines ###)-- passing stuName, bkCred & GPA
            // bkCred = calcCred(currGPA, mltplyr);
            System.out.println(" -- Hello " + stuName + ", \nbased on your GPA of: " + gpa + " your current bookstore credit is: $" + gpa * mltplyr);
  }
    //    // seperate method to calc bkCred on line 27

    //    public static double calcCred(double gpa, int mltplyr) {
    //     int result = curr + yrs;
    //     return result;
    //  }
}