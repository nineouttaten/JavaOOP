public class task_38 {
    public static boolean doesRhyme(String s, String s2) {
        String c = "";
        String k = "";
        int a = s.lastIndexOf(" ");
        int b = s2.lastIndexOf(" ");
        String subs = s.substring(a);
        String subs2 = s2.substring(b);
        for (char l:subs.toCharArray()) {
            if ((l=='a')||(l=='e')||(l=='i')||(l=='o')||(l=='u')||(l=='y')||(l=='A')||(l=='E')||(l=='I')||(l=='O')||(l=='U')||(l=='Y')){
                c += l;
            }
        }
        for (char l:subs2.toCharArray()){
            if ((l=='a')||(l=='e')||(l=='i')||(l=='o')||(l=='u')||(l=='y')||(l=='A')||(l=='E')||(l=='I')||(l=='O')||(l=='U')||(l=='Y')){
                k += l;
            }
        }
        return c.equalsIgnoreCase(k);
    }
    public static void main(String[] args) {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham.") );
        System.out.println(doesRhyme("Sam I am!", "Green eggs and HAM.")  );
        System.out.println(doesRhyme("You are off to the races", "a splendid day.")  );
        System.out.println(doesRhyme("and frequently do?", "you gotta move.")  );
    }
}
