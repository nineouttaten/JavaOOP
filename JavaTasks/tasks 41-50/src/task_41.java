public class task_41 {
    public static int[] encrypt(String a) {
        int[] res = new int[a.length()];
        int lastChar = 0;
        char[] charArray = a.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int charSym = charArray[i];
            res[i] = charSym - lastChar;
            lastChar = charSym;
        }
        return res;
    }

    public static String decrypt(int[] a) {
        StringBuilder res = new StringBuilder();
        int lastCode = 0;
        for (int j: a) {
            char newAscii = (char) (lastCode + j);
            lastCode = lastCode + j;
            res.append(newAscii);
        }
        return res.toString();
    }
    public static void main(String[] args) {
        System.out.println(encrypt("Hello"));
        System.out.println(decrypt(new int[] {72, 33, -73, 84, -12, -3, 13, -13, -68}));
    }
}
