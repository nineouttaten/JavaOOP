public class task_36 {
    public static int bugger(int a) { // 4.6
        int count = 0;
        while (a >= 10) {
            int mlt = 1, mod;
            while (a != 0) {
                mod = a % 10;
                mlt *= mod;
                a = a / 10;
            }
            a = mlt;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(bugger(39));
        System.out.println(bugger(999));
        System.out.println(bugger(4));
    }
}
