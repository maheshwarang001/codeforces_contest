package contest1851;

import java.util.Scanner;

public class ParitySort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0 ; i<n ;i++){
                nums[i] = sc.nextInt();
            }


            for(int i = 0 ; i<n-1 ;i++){
                for(int j = i+1 ; j<n ; j++){
                    if(nums[i]> nums[j]){
                        if(nums[i]%2 == 0){
                            if(nums[j]%2==0){
                                int temp = nums[i];
                                nums[i] = nums[j];
                                nums[j] = temp;
                            }
                        }
                        else if(nums[i]%2 == 0){
                            if(nums[j]%2==0){
                                int temp = nums[i];
                                nums[i] = nums[j];
                                nums[j] = temp;
                            }
                        }
                    }
                }
            }
            Boolean ans = true;

            for(int i = 0 ; i < n-1 ; i++){
                if(nums[i] > nums[i+1]){
                    ans = false;
                    break;
                }
            }
            if(ans == true) {
                System.out.println("YES");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
