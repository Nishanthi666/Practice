//Prin using else-if
// import java.util.Scanner;
// public class Conditional{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the Score:");
//         int score = scan.nextInt();
//         if(score<50){
//             System.out.println("Need to Improve");
//         }
//         else if(score>=50 && score<=70){
//             System.out.println("Good Job");
//         }
//         else if(score>70){
//             System.out.println("Excellent Performance");
//         }
        
//     }
// }

//Get input for 5 subjects find average and make conditions baesd on the marks secured
// import java.util.Scanner;
// public class Conditional{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the mark 1:");
//         int mark1 = scan.nextInt();
//         System.out.println("Enter the mark 2:");
//         int mark2 = scan.nextInt();
//         System.out.println("Enter the mark 3:");
//         int mark3 = scan.nextInt();
//         System.out.println("Enter the mark 4:");
//         int mark4 = scan.nextInt();
//         System.out.println("Enter the mark 5:");
//         int mark5 = scan.nextInt();
//         int total = mark1+mark2+mark3+mark4+mark5;
//         int average = total/5;
//         System.out.println("Average is:"+average);
//         if(average<35){
//             System.out.println("Additional class is required");
            
//         }
//         else{
//             System.out.println("You are good to go");
//         }
        
//     }
// }

//Traffic light signals
// import java.util.Scanner;
// public class Conditional{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the color:");
//         String color = scan.nextLine().toLowerCase();
//         if(color.equals("red")){
//             System.out.println("Stop");
//         }
//         else if(color.equals("yellow")){
//             System.out.println("Get Ready");
            
//         }
//         else if(color.equals("green")){
//             System.out.println("Go");
//         }
//         scan.close();
        
//     }
// }

//Input for salary,age and loan and process using conditional statements
import java.util.Scanner;
public class Conditional{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Salary:");
        int salary = scan.nextInt();
        System.out.print("Enter the age:");
        int age = scan.nextInt();
        if(salary>=20000 && age<=25){
            System.out.print("ENter the loan amount:");
            int loan = scan.nextInt();
            if(loan<=50000){
                System.out.println("You are eligible for loan");
        
            }
            else{
                System.out.println("MAximum loan amount is 50,000");
            }
            
        }
        else{
            System.out.println("You are not eligible for loan");
        }
        
    }
}