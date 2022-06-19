package twoSum;



import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine().toString();
        String arr[]=str.split(" ");
        int nums[]=new int[arr.length];
        for(int j=0;j< nums.length;j++){
            nums[j]= Integer.parseInt(arr[j]);
        }
        System.out.println(nums);
    }
}
