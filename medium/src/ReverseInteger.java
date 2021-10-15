/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * https://leetcode.com/problems/reverse-integer/
 */

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-12));
    }

    /**
     * Solution using Strings
     * @param x
     * @return
     */
    public static int reverse2(int x) {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
        int num = Integer.parseInt(reversed);
        try{
            return (x<0) ? num * -1 : num;
        }
        catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Solution using math
     * @param x
     * @return
     */
    public static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x *= -1;
        }
        long num = 0;
        while (x > 0) {
            num = (num * 10) + x % 10;
            x /= 10;
        }
        if (num > Integer.MAX_VALUE) {
            return 0;
        }
        return isNegative ? (int) (-1 * num) : (int) num;
    }
}
//        StringBuilder builder = new StringBuilder();
//        builder.append(String.valueOf(x));
//        builder.reverse();
//        if (builder.charAt(builder.length() - 1) == '-') {
//            builder.insert(0, "-");
//            builder.deleteCharAt(builder.length() - 1);
//        }
//        long num = Long.parseLong(builder.toString());
//        return num >= Integer.MAX_VALUE ? 0 : (int) num;



