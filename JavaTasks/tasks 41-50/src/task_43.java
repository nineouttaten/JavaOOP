public class task_43 {
    public static boolean canComplete(String a, String b) {
        for (char let: a.toCharArray()) {
            int curSymPos = b.indexOf(let);
            if ((curSymPos != -1)) {
                b = b.substring(curSymPos+1);
            }
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(canComplete("butl", "beautiful") );
        System.out.println(canComplete("butlz", "beautiful")  );
        System.out.println(canComplete("tulb", "beautiful")  );
        System.out.println(canComplete("bbutl", "beautiful")  );
    }
}
