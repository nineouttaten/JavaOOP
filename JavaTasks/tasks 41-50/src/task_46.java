public class task_46 {
    public static boolean validateCard(long a) {
        String cardNum = Long.toString(a);
        int cardNumLength = cardNum.length();
        if((cardNumLength > 13) && (cardNumLength < 20)) {
            int contralNum = cardNum.charAt(cardNumLength-1) - '0';
            int sumOfNums = 0;
            for (int i = cardNumLength-2; i > -1; i--) {
                int curNum;
                if (i % 2 == 0) {
                    curNum = (cardNum.charAt(i) - '0') * 2;
                    if (curNum > 9) sumOfNums += curNum - 9;
                    else sumOfNums += curNum;
                }
                else sumOfNums += cardNum.charAt(i) - '0';
            }
            return (10 - (sumOfNums % 10)) == contralNum;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(validateCard( 1234567890123456L));
        System.out.println(validateCard( 1234567890123452L));
    }
}
