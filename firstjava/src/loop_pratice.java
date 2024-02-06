//import java.util.Scanner;
//public class loop_pratice {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//
//        //ques 1 positive or negative.
////        if(a>0)
////            System.out.println("Postive number");
////        else
////            System.out.println("Negative number");
//
//        switch (a){
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Satursday");
//                break;
//            case 7:
//                System.out.println("Tuesday");
//                break;
//            default:
//                System.out.println("Sorry");
//        }
//      }
//}
//import java.util.Scanner;
//
//public class loop_pratice{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int lastdigit=0;
//        while(n>0){
//            lastdigit = n%10;
//            n=n/10;
//        }
//        System.out.println("");
//    }
//}

//import java.util.Scanner;
//public class loop_pratice{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int a = sc.nextInt();
//        double sum =  3.14 * a * a;
//        System.out.println("Area = " + sum);
//    }
//}

//public class loop_pratice{
//    public static void main(String[] args){
//        int n =4;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.print("\n");
//        }
//    }
//}

public class loop_pratice{
    public static void main(String[] args){
        int n=5;
        int a =1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a +" ");
                a++;
            }
            System.out.println();
        }
    }
}