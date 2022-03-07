package LAB5;

import java.util.Arrays;
import java.util.Scanner;

class Adder {
    Scanner input = new Scanner(System.in);
    private int[] arr;
    private int targetSum;
    public int arrayLength;

    public Adder(int arrayLength){
        this.arr = new int[arrayLength];
        this.arrayLength = arrayLength;
    }

    public String getData() {
        System.out.print("Enter Elements of Array : ");
        for (int i = 0; i < arrayLength; i++) {
            this.arr[i] = input.nextInt();
        }
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if (i != j && this.arr[i] == this.arr[j]) return "Wrong Input";
            }
        }
        System.out.print("Enter target sum : ");
        this.targetSum = input.nextInt();
        return "Input Accepted";
    }

    public int[] numSum(int[] arr, int targetSum) {
        int[] ans = new int[2];
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    ans[0] = arr[i];
                    ans[1] = arr[j];
                    return ans;
                }
            }
        }
        return ans;
    }

    public void output() {
        if (getData().equals("Input Accepted")){
            System.out.println(Arrays.toString(numSum(arr, targetSum)));
        }else{
            System.out.println("Wrong Input");
        }
    }
}

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int arrayLength = in.nextInt();
        Adder obj1 = new Adder(arrayLength);
        obj1.output();
    }
}
