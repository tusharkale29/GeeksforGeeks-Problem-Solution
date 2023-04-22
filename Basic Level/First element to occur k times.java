// First element to occur k times

// Given an array of N integers. Find the first element that occurs at least K number of times.
 

// Example 1:

// Input :
// N = 7, K = 2
// A[] = {1, 7, 4, 3, 4, 8, 7}
// Output :
// 4
// Explanation:
// Both 7 and 4 occur 2 times. 
// But 4 is first that occurs 2 times
// As at index = 4, 4 has occurred 
// atleast 2 times whereas at index = 6,
// 7 has occurred atleast 2 times.

// Solution by tushar kale:

class Solution {
    public int firstElementKTime(int[] a, int n, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Iterate through the array and store the count of each element in a HashMap
        for (int i = 0; i < n; i++) {
            countMap.put(a[i], countMap.getOrDefault(a[i], 0) + 1);
        }
        
        // Iterate through the array and return the first element that occurs at least K times
        for (int i = 0; i < n; i++) {
            if (countMap.get(a[i]) >= k) {
                return a[i];
            }
        }
        
        // If no element occurs at least K times, return -1
        return -1;
    }
}
