// GeeksForGeeks problem:
// Basic Level:
// Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

// Note: If at any instance, there are no more subarrays of size greater than or equal to K, 
// then reverse the last subarray (irrespective of its size). 
// You shouldn't return any array, modify the given array in-place.

// Example 1:

// Input:
// N = 5, K = 3
// arr[] = {1,2,3,4,5}
// Output: 3 2 1 5 4
// Explanation: First group consists of elements
// 1, 2, 3. Second group consists of 4,5.

// Solution by tushar kale:

class Solution {
    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int i = 0;
        while (i < n) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            while (left < right) {
                int temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
            i += k;
        }
    }
}
