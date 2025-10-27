class Solution {

    // Method to calculate the product of all elements except self
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

    //     // Step 1: Fill answer with the product of all elements to the left of each index
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        // Step 2: Calculate the product of all elements to the right of each index
        // and multiply with the current value in answer array
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return answer;
    
    }
}

