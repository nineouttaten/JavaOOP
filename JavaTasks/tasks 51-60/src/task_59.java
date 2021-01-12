public class task_59 {
    public static boolean formula(String a) { // 6.9
        boolean res = false;
        int equalsPos = a.indexOf("=");
        if ((equalsPos > -1) && (a.lastIndexOf("=") == equalsPos)) {
            int mathAns = Integer.parseInt(a.substring(equalsPos+1).trim());
            String mathExpress = a.substring(0, equalsPos);
            if ((a.contains("+")) && (a.indexOf("+") < equalsPos)) {
                String[] mathVars = mathExpress.trim().split(" \\+ ");
                if (Integer.parseInt(mathVars[0]) + Integer.parseInt(mathVars[1]) == mathAns)
                    res = true;
            }
            else if ((a.contains("*")) && (a.indexOf("*") < equalsPos)) {
                String[] mathVars = mathExpress.trim().split(" \\* ");
                if (Integer.parseInt(mathVars[0]) * Integer.parseInt(mathVars[1]) == mathAns)
                    res = true;
            }
            else if ((a.contains("/")) && (a.indexOf("/") < equalsPos)) {
                String[] mathVars = mathExpress.trim().split(" \\/ ");
                if (Integer.parseInt(mathVars[0]) / Integer.parseInt(mathVars[1]) == mathAns)
                    res = true;
            }
            else if ((a.contains("-")) && (a.indexOf("-") < equalsPos)) {
                String[] mathVars = mathExpress.trim().split(" \\- ");
                if (Integer.parseInt(mathVars[0]) - Integer.parseInt(mathVars[1]) == mathAns)
                    res = true;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(formula("6 * 4 = 24") );
        System.out.println(formula("18 / 17 = 2") );
        System.out.println(formula("16 * 10 = 160 = 14 + 120")  );
    }
}
