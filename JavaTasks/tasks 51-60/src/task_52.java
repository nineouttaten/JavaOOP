public class task_52 {
    public static String translateWord(String s){
        String res = "";
        boolean ifLetterUp = false;
        if (s.equals(" ") || s.equals("")) {
            return res;
        }
        char l = s.charAt(0);
        if (l >= 'A' && l <= 'Z')
            ifLetterUp = true;
        if ((l == 'a') || (l == 'e') || (l == 'i') || (l == 'o') || (l == 'u') || (l == 'y') ||
                (l == 'A') || (l == 'E') || (l == 'I') || (l == 'O') || (l == 'U') || (l == 'Y')) {
            res = s + "yay";
        }
        else {
            for (int i = 1; i <= s.length()-1; i++) {
                char r = s.charAt(i);
                if ((r=='a') || (r=='e') || (r=='i') || (r=='o') || (r=='u') || (r=='y')) {
                    String end = s.substring(0, i);
                    res = s.substring(i) + end + "ay";
                    break;
                }
            }
        }
        if (ifLetterUp)
            res = Character.toUpperCase(res.charAt(0)) + res.toLowerCase().substring(1, res.length());
        return res;
    }

    public static String translateSentence(String s) {
        StringBuilder res = new StringBuilder();
        new StringBuilder();
        StringBuilder letters;
        new StringBuilder();
        StringBuilder symbols;
        if (s.equals(" ")) {
            return res + " ";
        }
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            letters = new StringBuilder();
            symbols = new StringBuilder();
            for (char l : words[i].toCharArray()) {
                if (l >= 'A' && l <= 'z') {
                    letters.append(l);
                }
                else {
                    symbols.append(l);
                }
            }
            if (i == words.length - 1)
                res.append(translateWord(letters.toString())).append(symbols);
            else
                res.append(translateWord(letters.toString())).append(symbols).append(" ");
        }
        return res.toString();
    }
    public static void main(String[] args) {
        System.out.println(translateWord("flag"));
        System.out.println(translateWord("apple"));
        System.out.println(translateWord("button"));
        System.out.println(translateWord(""));
        System.out.println(translateSentence("I like to eat honey waffles.") );
    }
}
