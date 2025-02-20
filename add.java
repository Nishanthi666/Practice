class add{
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = a + b + c;
        System.out.println(d);
    }
}

import java.util.Scanner;

class add{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a + b;
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println(c);
        System.out.println(s);
        }
}

//PRACTICE 1
// Get input name,age and address from user and print it
import java.util.Scanner;
class add{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String str = scan.nextLine();
        System.out.println("Enter your Age:");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your Address:");
        String str1 = scan.nextLine();
        System.out.println(str);
        System.out.println(age);
        System.out.println(str1);

    }
}

// PRACTICE 2
// Get three integer values a,b and c, multiply all and store in d, add all and store in e, now divide d by e.
import java.util.Scanner;
class add{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer a:");
        int a = scan.nextInt();
        System.out.println("Enter the integer b:");
        int b = scan.nextInt();
        System.out.println("Enter the integer c:");
        int c = scan.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        int f = d/e;
        System.out.println(d); 
        System.out.println(e); 
        System.out.println(f); 

    }
}

//PRACTICE 3
//Get name, score and department. Let the user enter the mark for 100 and we convert to 10 and print it.
import java.util.Scanner;
class add{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = scan.nextLine();
        System.out.println("Enter your Score:");
        double score = scan.nextDouble();
        System.out.println("Enter your Department:");
        scan.nextLine();
        String dept = scan.nextLine();
        double score1 = score/10;
        System.out.println("My name is: " +name);
        System.out.println("My score is: " +score1 + "/10");
        System.out.println("My department is: " +dept);
    }
}

//Compare using If-else
class add{
    public static void main(String args[]){
        int num1 = 50;
        int num2 = 55;
        if(num1>num2){
            System.out.println( num1+ " is greater");
        }
        else{
            System.out.println( num2+ " is greater");
        }
    }
}

//Check if the numbers are equal using If-else
class add{
    public static void main(String args[]){
        int num1 = 55;
        int num2 = 55;
        if(num1==num2){
            System.out.println("Both are Equal");
        }
        else{
            System.out.println( "Numbers are not equal");
        }
    }
}

//Check if the numbers are equal using If-else from user 

import java.util.Scanner;
class add{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1==num2){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}

//Comparing two Strings
class add{
    public static void main(String args[]){
        String a = "one";
        String b = "one";
        String c = b;
        System.out.println(a==c);
    }
}

class add{
    public static void main(String args[]){
        String a = "one";
        String b = new String("one");
        String c = b;
        System.out.println(a==c);
        System.out.println(a.equals(c));
    }
}

class add{
    public static void main(String args[]){
        String meghna = "alive";
        if(meghna == "dead"){
            System.out.println("Surya meets Ramya");
        }
        else{
            System.out.println("Surya meets Meghna");
        }
    }
}

//GEt input for mark. if mark > 35 print pass else fail

import java.util.Scanner;
class add{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if(mark>35){
            System.out.println("pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}

//Get input for annual income if less than 7000 scholorship available or else no scholarship
import java.util.Scanner;
class add{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        long income = scan.nextInt();
        if(income>7000){
            System.out.println("Scholarship Available");
        }
        else{
            System.out.println("No Scholarship");
        }
    }
}
