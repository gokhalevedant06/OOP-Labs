package LAB3;
// Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.
//
//Note: Only one of the three values can be 7.
//Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.
//
//Note: Only one of the three values can be 7.
import java.util.Scanner;

public class SevenProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[3];
        int count=0;
        for (int i = 0; i < 3; i++) {
            nums[i]= input.nextInt();
            if(nums[i]==7) count++;
        }
        System.out.println(sevenProduct(nums,count));
    }

    private static int sevenProduct(int[] nums,int count) {
        int product=1;
        if(count>=2) {
            System.out.println("Only one of the three values can be 7");
            return -1;
        }
        int i=0;
        if(nums[0]==7) i=1;
        else if (nums[1]==7) i=2;
        else if (nums[2]==7) return -1;
        for (int j = i; j <3; j++) {
            product*=nums[i];
        }
        return product;
    }
}
