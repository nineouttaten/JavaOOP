public class task_39 {
    public static boolean trouble(int a, int b) {
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        char[] aChar = aStr.toCharArray();
        char[] bChar = bStr.toCharArray();
        boolean result = false;
        int[] num1 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 1; i < aChar.length; i++) {
            if (aChar[i] == aChar[i-1]) {
                num1[Character.getNumericValue(aChar[i])] += 1;
            }
        }
        for (int i = 1; i < bChar.length; i++) {
            if (bChar[i] == bChar[i-1]) {
                num2[Character.getNumericValue(bChar[i])] += 1;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (num1[i] == 2 && num2[i] == 1) {
                result = true;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(trouble(451999277, 411772299));
        System.out.println(trouble(1222345, 12345) );
        System.out.println(trouble(666789, 12345667) );
    }
}
