 //print numbers 1 to 10
public class Loops{
    public static void main(String args[]){
        for(int i = 1;i<=10;i++){
            System.out.println(i);
        }
        
    }
}

//Printing reverse number using for loop
public class Loops{
    public static void main(String args[]){
        for(int i = 10;i>=1;i--){
            System.out.println(i);
        }
        
    }
}

// simple star pattern in nested for Loop
public class Loops{
    public static void main(String args[]){
        for(int j=1;j<=3;j=j+1){
            for(int i=1;i<=3;i=i+1){
            System.out.print("*");
        }
        System.out.println();
            
        }
        
    }
}

//triangle star pattern in nested for loop
public class Loops{
    public static void main(String args[]){
        for(int j= 1;j<=3;j=j+1){
            for(int i=1;i<=j;i=i+1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//WHile Loops
//Generating random numbers

import java.util.Random;

public class Loops{
    public static void main(String args[]){
        Random rand = new Random();
        int num = rand.nextInt(15); 
        System.out.println(num);
    }
}

//Random numbers using while Loops
import java.util.Random;
public class Loops{
    public static void main(String args[]){
        Random rand = new Random();
        int newnum = 0;
        while(newnum!=8){
            newnum = rand.nextInt(10);
            System.out.println(newnum);
        }
        
    }
}

//DO-While Loops
public class Loops{
    public static void main(String args[]){
        int num = 0;
        do{
            System.out.println("Java");
            num = num+1;
            
        }while(num<=2);
    }
}

//Get input for variable a.Input should be greater than 10,If input is not 
//greater than 10 ask the user to re enter until he types the right input.
import java.util.Scanner;
public class Loops{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a;
        do{
            System.out.println("Enter the value:");
            a = scan.nextInt();
            
        }while(a<=10);
       
        }
}






