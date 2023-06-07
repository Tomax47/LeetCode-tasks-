import java.util.ArrayList;
import java.util.Arrays;


/**
             Contains Duplicate

 Given an integer array nums, return true if any value appears at least twice in the array,
 and return false if every element is distinct.



 Example 1:

 Input: nums = [1,2,3,1]
 Output: true
 Example 2:

 Input: nums = [1,2,3,4]
 Output: false
 Example 3:

 Input: nums = [1,1,1,3,3,4,3,2,4,2]
 Output: true
 */

public class ContainsDuplicate {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,9,8,1,2));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1,1000,9,100000,10000,100));
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(100,20000,2000,1000000,20,1000000));

        System.out.println("Isn't distinct : "+isNotDistinct(numbers));
        System.out.println("Isn't distinct : "+isNotDistinct(numbers2));
        System.out.println("Isn't distinct : "+isNotDistinct(numbers3));
    }



    private static boolean isNotDistinct(ArrayList<Integer> arrayList) {
        ArrayList<Integer> newArrayList = new ArrayList<>();

        for (Integer n : arrayList) {
            if (newArrayList.contains(n)) {
                return true;
            } else {
                newArrayList.add(n);
            }
        }
        return false;
    }
}
