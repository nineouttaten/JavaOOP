public class task_50 {
    public static String hexLattice(int a) {
        int pointInFirstLine = 0;
        int workedNum = a;
        int subNum = 1;
        while (workedNum > 0) {
            pointInFirstLine++;
            workedNum -= subNum;
            subNum = pointInFirstLine * 6;
        }
        if ((((a - 1) % 6 == 0) || (a == 1)) && (workedNum == 0)) {
            StringBuilder ans = new StringBuilder();
            int dotsInLine = pointInFirstLine;
            for (int i = pointInFirstLine; i > 0; i--){
                ans.append(" ".repeat(i - 1));
                ans.append(" o".repeat(Math.max(0, dotsInLine)));
                dotsInLine++;
                ans.append("\n");
            }
            for (int i = dotsInLine-1; i > pointInFirstLine; i--){
                ans.append(" ".repeat(Math.max(0, (dotsInLine) - i)));
                ans.append(" o".repeat(Math.max(0, i - 1)));
                ans.append("\n");
            }
            return ans.toString();
        }
        else
            return "Invalid";
    }
    public static void main(String[] args) {
        System.out.println(hexLattice(1) );
        System.out.println(hexLattice(7) );
        System.out.println(hexLattice(19) );
        System.out.println(hexLattice(21) );
    }
}
