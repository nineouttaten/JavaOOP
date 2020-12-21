import java.util.*;
public class task_40 {
    public static int countUniqueBooks(String a, char b) {
        String partA = a;
        String[] parts = new String[0];
        while (partA.length() != 0) {
            int beginPart = partA.indexOf(b);
            if (beginPart == -1) {
                break;
            }
            partA = partA.substring(beginPart + 1);
            int endPart = partA.indexOf(b);
            parts = Arrays.copyOf(parts, parts.length + 1);
            parts[parts.length - 1] = partA.substring(0, endPart);
            partA = partA.substring(endPart + 1);
        }
        String resStr = "";
        for (String i: parts) {
            resStr += i;
        }
        String lowerRes = resStr.toLowerCase();
        boolean[] isItThere = new boolean[Character.MAX_VALUE];
        for (int i = 0; i < lowerRes.length(); i++) {
            isItThere[lowerRes.charAt(i)] = true;
        }
        int count = 0;
        for (boolean value: isItThere) {
            if (value) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countUniqueBooks("AZYWABBCATTTA", 'A') );
        System.out.println(countUniqueBooks("$AA$BBCATT$C$$B$", '$')  );
        System.out.println(countUniqueBooks("ZZABCDEF", 'Z') );
    }
}
