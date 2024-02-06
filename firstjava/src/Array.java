
public class Array {

    public static int linSear(int number[] ,int  key){
        for(int i=0;i<number.length;i++){
            if(key==number[i]){
                return i;
            }

        }
        return -1;
    }


    public static void main(String[] args){
        int number [] = {2 ,4 , 6 , 8 , 10, 12 , 14};
        int key = 10;
        int index = linSear(number ,key);

        if(index==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found : "+ index);
        }
    }
}
