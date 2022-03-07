package LAB3;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.println("Enter 3 integers");
        for (int i = 0; i < 3; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println(sevenSum(nums));
    }
    static int sevenSum(int[] arr){
        int product = 1;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if(arr[i]==7){
                count++;
                product=1;
                continue;
            }
            else product*=arr[i];
        }
        if(count>=2) {
            System.out.println("Only one of the three values can be 7.");
            return -1;
        }
        else if (arr[2]==7) return -1;
        return product;
    }
}
