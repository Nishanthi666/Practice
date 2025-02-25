//Practice 1
// Arithmetic operator
// import java.util.Scanner;
// public class Operators{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter the first value:");
//         int a = scan.nextInt();
//         System.out.println("Enter the second value:");
//         int b = scan.nextInt();
//         int total = a+b;
//         int sub = a-b;
//         int mul = a*b;
//         int div = a/b;
//         int mod = a%b;
//         System.out.println("Total:"+total);
//         System.out.println("Subtraction:"+sub);
//         System.out.println("Multiplication:"+mul);
//         System.out.println("Division:"+div);
//         System.out.println("Modulus:"+mod);
//     }
// }

//Unary Operators
// public class Operators{
//     public static void main(String args[]){
//         int c = 5;
//         int d = 10;
//         System.out.println("c++ value:"+c++);
//         System.out.println("++c value:"+ ++c);

//         System.out.println("c-- value:"+c--);
//         System.out.println("--c value:"+ --c);

//         System.out.println("d++ value:"+d++);
//         System.out.println("++d value:"+ ++d);

//         System.out.println("d-- value:"+d--);
//         System.out.println("--d value:"+ --d);


//     }
// }

// Relational Operators
//import java.util.Scanner;
// public class Operators{
// 	public static void main(String args[]){
// 	    Scanner scan = new Scanner(System.in);
// 	    System.out.println("Enter the first value:");
// 	    int x = scan.nextInt();
// 	    System.out.println("Enter the second value:");
// 	    int y = scan.nextInt();
// 	    System.out.println("(x==y)"+(x==y));
// 	    System.out.println("(x!=y)"+(x!=y));
// 	    System.out.println("(x<=y)"+(x<=y));
// 	    System.out.println("(x>=y)"+(x>=y));
// 	    System.out.println("(x>y)"+(x>y));
// 	    System.out.println("(x<y)"+(x<y));
	    
// 	}
// }

//Assignment Operators
// import java.util.Scanner;
// public class Operators{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int a,b,c;
//         System.out.println("Enter the first number:");
//         a = scan.nextInt();
//         System.out.println("Enter the second number:");
//         b = scan.nextInt();
//         c = a+b;
//         System.out.println("c=a+b:"+c);
//         c+=a;
//         System.out.println("c=c+a:"+c);
//         c-=a;
//         System.out.println("c=c-a:"+c);
//         c*=a;
//         System.out.println("c=c*a:"+c);
//         c/=a;
//         System.out.println("c=c/a:"+c);
//         c%=a;
//         System.out.println("c%a:"+c);
        
//     }
// }

//Logical Operators
// import java.util.Scanner;
// public class Operators{
//     public static void main(String args[]){
//     Scanner scan = new Scanner(System.in);
//     System.out.println("Enter the first value:");
//     int g = scan.nextInt();
//     System.out.println("Enter the second value:");
//     int h = scan.nextInt();
//     if((g==h)&&(g!=h)){
//         System.out.println("True");
//     }
//     else{
//         System.out.println("False");
//     }
//     if((g==h)||(g!=h)){
//         System.out.println("True");
//     }
//     else{
//         System.out.println("False");
//     }
//     }
// }

//Conditional or Ternary Operators
// public class Operators{
//     public static void main(String args[]){
//         int a = 15;
//         String result;
//         result = (a==1)?"True":"False";
//         System.out.println("Output:"+result);
//         result = (a==15)?"true":"false";
//         System.out.println("Output:"+result);
//     }
// }

//Bitwise Operators
public class Operators{
    public static void main(String args[]){
        int a = 3;
        int b = 5;
        int c;
        c=a&b;
        System.out.println("a&b:"+c);
        c=a|b;
        System.out.println("a|b:"+c);
        c=a^b;
        System.out.println("a^b:"+c);
        c=~a;
        System.out.println("~a:"+c);
        int x = 24;
        int y = 3;
        c = x<<y;
        System.out.println("x<<y:"+c);
        int r = 38;
        int s  = 4;
        c = x>>y;
        System.out.println("r>>s:"+c);
        
        
    }
}




