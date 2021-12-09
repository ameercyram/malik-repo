package coding_questions;

public class FindLargestNumberInArray {

    public static void main(String[] args) {
        int[] numbers = {3,1,6,2,6,100,40,20};
        int largest = numbers[0];
        for(int i = 1; i < numbers.length; i++){
           if(numbers[i] > largest){
               largest= numbers[i];
           }
        }
        System.out.println(largest);
    }
}
