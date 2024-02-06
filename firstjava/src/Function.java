//public class Function {
//    public static void hello(){
//        System.out.println("Hello wolrd");
//    }
//
//    public static void main(String[] args){
//        hello();
//    }
//}

public class Function{
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){

             fact =i *fact;
        }
        return fact;
    }

    public static void main(String[] args){
        int a =factorial(5);
        System.out.println(a);

    }
}