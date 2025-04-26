
package javahw;

public class MaxElementIndex {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; 
        int max = arr[0]; 
        int maxIndex = 0; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) { 
                max = arr[i];
                maxIndex = i; 
            }
        }
        System.out.println("The maximum element is: " + max);
        System.out.println("The index of the maximum element is: " + maxIndex);
    }
}

//output
//The maximum element is: 35
//The index of the maximum element is: 1