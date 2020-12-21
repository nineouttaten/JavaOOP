public class task_32 {
    public static String split(String line){
        int count = 0;
        String cluster = "";
        String new_line = "";
        char[] line_array = line.toCharArray();
        for(int i = 0; i != line.length(); i++) {
            if (line_array[i] == '('){
                count ++;
                cluster += line_array[i];
            }
            else{
                count--;
                cluster += line_array[i];
                if (count == 0){
                    new_line += cluster + "  ";
                    cluster = "";
                }
            }
        }
        return new_line;
    }
    public static void main(String[] args) {
        System.out.println(split("()()()"));
        System.out.println(split("((()))"));
        System.out.println(split("((()))(())()()(()())"));
        System.out.println(split("((())())(()(()()))"));
    }
}
