// import java.util.*;
// public class Calculator{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the first number ");
//         int num1=sc.nextInt();
//         System.out.println("Enter the Second number ");
//         int num2=sc.nextInt();
//         char ch = sc.nextLine().trim().charAt(0);
//         int ans=0;
        
//             switch(ch){
//                 case '+':
//                 ans = num1+num2;
                
//                 break;
//                 case '-':
//                 ans=num1-num2;
          
//                 break;

//                 default:
//                 System.out.println("sorry wrong operator");
//                 break;
//             }
        
        
//     }
// }


import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number ");
        int num2 = sc.nextInt();
        System.out.println("Enter a operator");        
        char ch = sc.next().trim().charAt(0); // Corrected line
        int ans = 0;
        switch (ch) {
            case '+':
                ans = num1 + num2;
                System.out.println(ans);
                break;
            case '-':
                ans = num1 - num2;
                System.out.println(ans);
                break;
            default:
                System.out.println("sorry wrong operator");
                break;
        }
    }
}
