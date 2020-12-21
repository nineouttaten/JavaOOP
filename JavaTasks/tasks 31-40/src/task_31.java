public class task_31 {
    public static String bessie(int n, int k, String essay){
        char[] essay_char = essay.toCharArray();
        String essay_new = "";
        String word = "";
        int line = 0;
        for(int i = 0; i != essay.length(); i++){
            if(essay_char[i] >= 'A' & essay_char[i] <= 'Z' || essay_char[i] >= 'a' & essay_char[i] <= 'z'){
                word += essay_char[i];
            }
            else{
                if (line + word.length() > k){
                    essay_new += "\n" + word + " ";
                    line = word.length();
                }
                else{
                    essay_new += word + " ";
                    line += word.length();
                }
                word = "";
            }
        }
        if (line + word.length() > k){
            essay_new += "\n" + word + " ";
        }
        else{
            essay_new += word + " ";
        }
        return essay_new;
    }
    public static void main(String[] args) {
        System.out.println(bessie(10,7,"hello my name is Bessie and this is my essay"));
    }
}
