public class task_58 {
    public static String convertToRoman(int a) {
        StringBuilder ans = new StringBuilder();
        if (a / 1000 != 0) {
            for (int i = a; i / 1000 != 0; i -= 1000) {
                ans.append("M");
            }
            a %= 1000;
        }
        if (a / 100 != 0) {
            int hundred = a / 100;
            if (hundred <= 3)
                ans.append("C".repeat(Math.max(0, hundred)));
            else if (hundred == 4)
                ans.append("CD");
            else if (hundred <= 8) {
                ans.append("D");
                ans.append("C".repeat(hundred - 5));
            } else if (hundred == 9)
                ans.append("CM");
            a %= 100;
        }
        if (a / 10 != 0) {
            int ten = a / 10;
            if (ten <= 3)
                ans.append("X".repeat(Math.max(0, ten)));
            else if (ten == 4)
                ans.append("XL");
            else if (ten <= 8) {
                ans.append("L");
                ans.append("X".repeat(ten - 5));
            } else if (ten == 9)
                ans.append("XC");
            a %= 10;
        }
        if (a % 10 != 0) {
            int num = a % 10;
            if (num <= 3)
                ans.append("I".repeat(Math.max(0, num)));
            else if (num == 4)
                ans.append("IV");
            else if (num <= 8) {
                ans.append("V");
                ans.append("I".repeat(num - 5));
            } else ans.append("IX");
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(convertToRoman(2) );
        System.out.println(convertToRoman(12) );
        System.out.println(convertToRoman(16) );
    }
}
