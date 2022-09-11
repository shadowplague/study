package jax;

public class 罗马数转整数 {public int romanToInt(String s) {
    int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
int num = 0;
    while (s.length() > 0) {
        for (int i = 0; i < romans.length; i++) {
            if (s.startsWith(romans[i])) {
                num += nums[i];
                s = s.substring(romans[i].length());
                break;
            }
        }
    }
    return num;
}
}
   


