import java.util.*;
public class task_45 {
    public static ArrayList<String> sameVowelGroup(String[] a) {
        ArrayList<String> AnsWords = new ArrayList<>(Collections.singletonList(a[0]));
        ArrayList<Character> usedVowelsDefault = new ArrayList<>();
        for (char symFromMainWord: a[0].toLowerCase().toCharArray()) {
            if (!usedVowelsDefault.contains(symFromMainWord)) {
                switch (symFromMainWord) {
                    case 'a' -> usedVowelsDefault.add('a');
                    case 'e' -> usedVowelsDefault.add('e');
                    case 'i' -> usedVowelsDefault.add('i');
                    case 'o' -> usedVowelsDefault.add('o');
                    case 'u' -> usedVowelsDefault.add('u');
                }
            }
        }
        for (int i = 1; i < a.length; i++) {
            ArrayList<Character> usedVowelsCur = new ArrayList<>();
            for (char checkSym: a[i].toLowerCase().toCharArray()) {
                if (!usedVowelsCur.contains(checkSym)) {
                    switch (checkSym) {
                        case 'a' -> usedVowelsCur.add('a');
                        case 'e' -> usedVowelsCur.add('e');
                        case 'i' -> usedVowelsCur.add('i');
                        case 'o' -> usedVowelsCur.add('o');
                        case 'u' -> usedVowelsCur.add('u');
                    }
                }
            }
            if (usedVowelsDefault.containsAll(usedVowelsCur) && usedVowelsCur.containsAll(usedVowelsDefault))
                AnsWords.add(a[i]);
        }
        return AnsWords;
    }
    public static void main(String[] args) {
        System.out.println(sameVowelGroup(new String[]{"toe", "ocelot", "maniac"}));
        System.out.println(sameVowelGroup(new String[]{"many", "carriage", "emit", "apricot", "animal"} ));
        System.out.println(sameVowelGroup(new String[]{"hoops", "chuff", "bot", "bottom" }));
    }
}
