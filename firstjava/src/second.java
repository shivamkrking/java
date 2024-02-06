//public class second{
//    public static void main(String[] args){
//        int[] x= new int[3];
//        System.out.println(x);
//        System.out.println(x[0]);
//    }
//}
//class A{
//    public static void main(String[] args){
//        System.out.println("Welcome in class A");
//    }
//}
//class B{
//    public static void main(String[] args){
//        System.out.println("Welcome in class B");
//    }
//}

//import java.util.Arrays;
//
//public class second{
//    public static void main(String[] args){
//        System.out.println("Hello world");
//        int[] arr = new int[4];
//         arr[0] = 23;
//         arr[1]='s';
//         arr[2]=21;
//        System.out.println(arr[3]);
//        Arrays.sort(arr);
//        System.out.println(arr[3]);
//
//    }
//}
import java.util.Scanner;
public class second{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<18){
            System.out.println("Your not adult");
        }
        else{
            System.out.println("You are men");
        }
    }
}