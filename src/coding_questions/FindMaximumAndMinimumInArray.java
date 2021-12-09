package coding_questions;

public class FindMaximumAndMinimumInArray {

    public static void main(String[] args) {
        int[] numbers = {3,1,6,2,6,100,40,20};
        int max = 0;
        int min = numbers[0];
        for(int i = 0; i<numbers.length;i++){
            if(numbers[i] > max){
                max= numbers[i];
            } else if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
