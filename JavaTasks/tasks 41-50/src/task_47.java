public class task_47 {
    public static String oneNumber(int a) {
        return switch (a) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> " ";
        };
    }

    public static String twoNumber(int a) {
        String res = " ";
        String juu = " ";
        if (a < 20){
            switch (a) {
                case 10 -> res = "ten";
                case 11 -> res = "eleven";
                case 12 -> res = "twelve";
                case 13 -> res = "thirteen";
                case 14 -> res = "fourteen";
                case 15 -> res = "fifteen";
                case 16 -> res = "sixteen";
                case 17 -> res = "seventeen";
                case 18 -> res = "eighteen";
                case 19 -> res = "nineteen";
            }
        }
        else {
            int b = a / 10;
            a %= 10;
            switch (b) {
                case 2 -> juu = "twenty ";
                case 3 -> juu = "thirty ";
                case 4 -> juu = "fourty ";
                case 5 -> juu = "fifty ";
                case 6 -> juu = "sixty ";
                case 7 -> juu = "seventy ";
                case 8 -> juu = "eighty ";
                case 9 -> juu = "ninety ";
            }
            res = juu + oneNumber(a);
            if (a == 0){
                res = juu;
            }
        }
        return res;
    }

    public static String threeNumber(int a) {
        String res = " ";
        int c = a % 100;
        a = a / 100;
        res = oneNumber(a) + " hundred " + twoNumber(c);
        return res;
    }
    public static String numToEng(int a) {
        String s = Integer.toString(a);
        if (s.length() == 1) {
            return oneNumber(a);
        }
        else if (s.length() == 2) {
            return twoNumber(a);
        }
        else {
            return threeNumber(a);
        }
    }
    public static void main(String[] args) {
        System.out.println(numToEng(0));
        System.out.println(numToEng(18));
        System.out.println(numToEng(126));
        System.out.println(numToEng(900));
    }
}
