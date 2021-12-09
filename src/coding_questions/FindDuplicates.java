package coding_questions;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] num = {3, 6, 1, 2, 3, 7, 9, 2};
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[i]);
                }
            }
        }
    }
}


