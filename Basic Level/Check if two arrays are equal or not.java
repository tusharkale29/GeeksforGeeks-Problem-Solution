//Check if two arrays are equal or not

// Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. 
// Two arrays are said to be equal if both of them contain same set of elements, 
// arrangements (or permutation) of elements may be different though.
// Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.

// Example 1:

// Input:
// N = 5
// A[] = {1,2,5,4,0}
// B[] = {2,4,5,0,1}
// Output: 1
// Explanation: Both the array can be 
// rearranged to {0,1,2,4,5}

// Solution by tushar kale:

class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        // If sizes of arrays are different, they can't be equal
        if (A.length != B.length) {
            return false;
        }
        
        // Create HashMap to store the count of each element in A
        Map<Long, Integer> countMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            countMap.put(A[i], countMap.getOrDefault(A[i], 0) + 1);
        }
        
        // Iterate through B and decrement count in HashMap for each element
        // If count becomes negative, it means B has an extra element or a different count of an element
        for (int i = 0; i < N; i++) {
            if (countMap.containsKey(B[i]) && countMap.get(B[i]) > 0) {
                countMap.put(B[i], countMap.get(B[i]) - 1);
            } else {
                return false;
            }
        }
        
        return true;
    }
}
