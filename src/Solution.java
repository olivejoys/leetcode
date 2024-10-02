//import java.util.HashMap;
//import java.util.Hashtable;
//
//class Solution {
//
//    public static int romanToInt(String s) {
//        HashMap<Character, Integer> RomanTable  = new HashMap<>();
//        RomanTable.put('I',1);
//        RomanTable.put('V',5);
//        RomanTable.put('X',10);
//        RomanTable.put('L',50);
//        RomanTable.put('C',100);
//        RomanTable.put('D',500);
//        RomanTable.put('M',1000);
//
//        int total = 0; // acumulates the values +  the final and converted number into an integer goes HERE
//        int length = s.length();
//
//        // iterate through from left to right
//        for (int i = 0; i < length; i ++) {
//            // let's check for conditions now:
//            // 1stly get the current value
//            int currentValue = RomanTable.get(s.charAt(i));
//
//            //2ndly check if it is less than and do substraction
//
//            if (i < length - 1 && currentValue < RomanTable.get(s.charAt(i + 1))) { // checking if it suits on the length
//                //&& if the current is less than next RomanTable numeral
//                //(s.charAt(i + 1) checking the current + 1 in the RomanTable. (next one following the current)
//                //then subtract
//                total -= currentValue; //if it is less than will subtract from total
//            } else {
//                total += currentValue;
//            }
//        }
//
//        return total;
//        }
//
//        public static void main(String[] args){
//            System.out.println(romanToInt("MCMXCIV"));
//            System.out.println(romanToInt("LVIII"));
//            System.out.println(romanToInt("III"));
//
//        }
//    }
//
//
//


import java.util.HashMap;

class Solution {


    public static int[] TwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndex = new HashMap<>(); // creating a new hash

        int i;
        for (i = 0; i < nums.length; i++) {
            int complement = target - i;

            if (numIndex.containsKey(complement)) {
                return new int[]{numIndex.get(complement), i};
            }

        numIndex.put(nums[i], i);
    }
            throw new IllegalArgumentException("No two sums found");

        }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.TwoSum(nums, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");

    }


}
