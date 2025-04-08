package com.arrays.smvitm;

// Half Reverse the array - Method 1
public class ArrayHalfrev {
    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5};
        
        int left = n.length / 2; // 2
        int right = n.length - 1; // 4
        
        // Correct the loop to decrement right, not increment
        while (left < right) {
            // Swap elements
            int temp = n[left];
            n[left] = n[right];
            n[right] = temp;
            
            left++;
            right--; // Decrement right to move towards the middle
        }
        
        // Print the array after the half reverse
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
