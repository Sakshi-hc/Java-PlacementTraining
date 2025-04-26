
package javahw;

public class MinElementIndex {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; 
        int min = arr[0]; 
        int minIndex = 0; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) { 
                min = arr[i];
                minIndex = i; 
            }
        }
        System.out.println("The minimum element is: " + min);
        System.out.println("The index of the minimum element is: " + minIndex);
    }
}

//output
//The minimum element is: 1
//The index of the minimum element is: 2