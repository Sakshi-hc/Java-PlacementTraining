
package javahw;

public class SecondMinFinder {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("There is no second minimum element (all elements may be equal).");
        } else {
            System.out.println("The second minimum element is: " + secondMin);
        }
    }
}

//output
//The second minimum element is: 10