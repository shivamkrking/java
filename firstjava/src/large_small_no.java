public class large_small_no {

    public static int largest(int number[]){
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(number[i] > large){
                large = number[i];
            }
            if (number[i]< small){
                small = number[i];
            }
        }
        System.out.println("The smallest number is "+ small);
        return large;
    }

    public static void main(String[] args){
        int number[] = {1,4,5,34,65,45};

        System.out.println("The largest number is : "+ largest(number));
    }
}
