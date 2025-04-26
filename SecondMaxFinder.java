
package javahw;

public class SecondMaxFinder {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        if (arr.length < 2) {
           System.out.println("Array must contain at least two elements.");
            return;
          
            
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second maximum element (all elements may be equal).");
        } else {
            System.out.println("The second maximum element is: " + secondMax);
        }
    }
}
//output

//The second maximum element is: 3