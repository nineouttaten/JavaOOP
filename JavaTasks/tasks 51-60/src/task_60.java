public class task_60 {
    public static int numReverse(int a) {
        int res = 0;
        while (a != 0) {
            int digit = a % 10;
            res = res * 10 + digit;
            a /= 10;
        }
        return res;
    }
    public static boolean palindromeDescendant(int a) { // 6.10
        boolean res = false;
        int aLength = Integer.toString(a).length();
        String[] arrayOfNumbers = Integer.toString(a).split("");
        StringBuilder workNum = new StringBuilder(Integer.toString(a));
        while ((aLength > 1) && (Integer.parseInt(workNum.toString()) != numReverse(Integer.parseInt(workNum.toString())))) {
            workNum = new StringBuilder();
            for (int i = 0; i < arrayOfNumbers.length; i++) {
                if (i % 2 != 0)
                    workNum.append(Integer.parseInt(arrayOfNumbers[i - 1]) + Integer.parseInt(arrayOfNumbers[i]));
            }
            aLength = workNum.length();
            arrayOfNumbers = workNum.toString().split("");
        }
        if ((Integer.parseInt(workNum.toString()) == numReverse(Integer.parseInt(workNum.toString()))) && (aLength > 1))
            res = true;
        return res;
    }
    public static void main(String[] args) {
        System.out.println(palindromeDescendant(11211230) );
        System.out.println(palindromeDescendant(13001120)  );
        System.out.println(palindromeDescendant(23336014) );
    }
}
