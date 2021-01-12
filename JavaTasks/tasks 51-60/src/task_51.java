public class task_51 {
    static int bell(int a) {
        int[][] bell = new int[a+1][a+1];
        bell[0][0] = 1;
        for (int i = 1; i <= a; i++) {
            bell[i][0] = bell[i-1][i-1];
            for (int j=1; j<=i; j++) {
                bell[i][j] = bell[i - 1][j - 1] + bell[i][j - 1];
            }
        }
        return bell[a][0];
    }
    public static void main(String[] args) {
        System.out.println(bell(1));
        System.out.println(bell(2));
        System.out.println(bell(3));
    }
}
