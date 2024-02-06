//import java.util.Scanner;
//
//public class if_else {
//    public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the age : ");
//        int age = sc.nextInt();
//        switch (age){
//            case 18:
//                System.out.println("Your are now adult");
//                break;
//            case 24:
//                System.out.println("Your are now in job");
//                break;
//            case 60:
//                System.out.println("You are now reaited");
//                break;
//            default:
//                System.out.println("Enjoy your life");
//        }
//
//    }
//}
//import java.util.Scanner;
//
//public class if_else{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the 1st subject marks: ");
//        int a = sc.nextInt();
//        System.out.print("Enter the 1st subject marks: ");
//        int b = sc.nextInt();
//        System.out.print("Enter the 1st subject marks: ");
//        int c = sc.nextInt();
//        int per = ((a+b+c)*100)/300;
//        System.out.println(per);
//
//    }
//}

//import java.util.Scanner;
//public class if_else{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if(a>b){
//            if(a>c) {
//                System.out.println("A is greater than b and c");
//            }
//        } else if (b>a) {
//            if(b>c){
//                System.out.println("B is greater than a and c");
//            }
//        }
//        else {
//            System.out.println("C is greater than a and b");
//        }
//    }
//}
import java.util.Scanner;
public class if_else{
    public static void main(String[] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}








