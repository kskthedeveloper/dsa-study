package org.me.twopointers;

public class TwoPointers {
    public static int[] pairSumSorted(int[] list, int target) {
        int left = 0;
        int right = list.length-1;

        while (left < right) {
            int sum = list[left] + list[right];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[]{left, right};
            }
        }

        return new int[]{left, right};
    }

    public static void main(String[] args) {
        int[] list = {-5, -2, 3, 4, 6};
        int target = 7;

        int[] result = TwoPointers.pairSumSorted(list, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(list[result[0]]);
        System.out.println(list[result[1]]);
    }
}
