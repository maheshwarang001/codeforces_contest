package contest1851;

import java.util.Scanner;

public class escalato_conv {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int H = sc.nextInt();
            int count = 0;

            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {

                if (nums[i] > H) {
                    int diff = nums[i] - H;
                    if (diff % k == 0) {
                        int steps = diff / k;
                        if (steps < m) {
                            count++;
                        }
                    }
                } else if (H > nums[i]) {
                    int diff = H - nums[i];
                    if (diff % k == 0) {
                        int steps = diff / k;
                        if (steps < m) {
                            count++;
                        }
                    }
                }


            }
            System.out.println(count);

        }
        sc.close();
    }
}
