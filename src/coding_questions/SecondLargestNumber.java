package coding_questions;

import java.util.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {3,1,6,2,6,100,40,20};
        Arrays.sort((numbers));
        int largest = 0;
        int secondLargest = 0;
        for(int i = 0 ; i < numbers.length; i++){
            if(numbers[i] > largest){
                secondLargest = largest;
                largest = numbers[i];
            }
        }
        System.out.println(secondLargest);
    }
}
