import java.util.Scanner;

/*
Given an array of integers num and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice

Example 1:

Input: num = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because num[0] + num[1] == 9, we return [0, 1].
Example 2:

Input: num = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: num = [3,3], target = 6
Output: [0,1]
*/
public class Two_Sum {
    public static void two(int[] num,int x) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] + num[j] == x) {
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int length=sc.nextInt();
        System.out.println("Enter an Array: ");
        int[] arr=new int[length];
        for (int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the Target: ");
        int target=sc.nextInt();
        two(arr,target);
    }
}
