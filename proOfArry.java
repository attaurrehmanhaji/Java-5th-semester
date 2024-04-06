
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];

        // Calculate the product of all elements to the left of each element
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            leftProducts[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Calculate the product of all elements to the right of each element
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            rightProducts[i] = rightProduct;
            rightProduct *= nums[i];
        }

        // Multiply the left and right products to get the final result
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    }
}

public class proOfArry {
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = { 2, 2, 3 };
        // int[] nums2 = { -1, 1, 0, -3, 3 };
        int[] result1 = solution.productExceptSelf(nums1);
        // int[] result2 = solution.productExceptSelf(nums2);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        // System.out.println();
        // for (int num : result2) {
        // System.out.print(num + " ");
        // }
    }
}
