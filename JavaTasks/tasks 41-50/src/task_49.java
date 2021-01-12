public class task_49 {
    public static String correctTitle(String a) {
        String[] words = a.toLowerCase().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < words.length; i++){
            if (words[i].equals("in") || words[i].equals("of") || words[i].equals("the") || words[i].equals("and"))
                ans.append(words[i]).append(" ");
            else {
                char[] numArr = words[i].toCharArray();
                ans.append(Character.toUpperCase(numArr[0])).append(words[i].substring(1)).append(" ");
            }
            if (i == words.length - 1)
                ans = new StringBuilder(ans.substring(0, ans.length() - 1));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(correctTitle("jOn SnoW, kINg IN thE noRth."));
        System.out.println(correctTitle("sansa stark, lady of winterfell."));
        System.out.println(correctTitle("TYRION LANNISTER, HAND OF THE QUEEN."));
    }
}
