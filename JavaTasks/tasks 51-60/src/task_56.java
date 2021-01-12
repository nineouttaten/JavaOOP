public class task_56 {
    public static int ulam(int a) {
        int[] ulamPeriod = new int[a];
        for (int i = 0; i < ulamPeriod.length; i++) {
            switch (i) {
                case 0 -> ulamPeriod[i] = 1;
                case 1 -> ulamPeriod[i] = 2;
                default -> {
                    int waysOfSolve = 0;
                    int rightNumber = ulamPeriod[i - 1] + 1;
                    while (waysOfSolve != 2) {
                        waysOfSolve = 0;
                        for (int j = 0; j < i; j++) {
                            for (int k = 0; k < i; k++) {
                                if ((ulamPeriod[j] != ulamPeriod[k]) && (ulamPeriod[j] + ulamPeriod[k] == rightNumber))
                                    waysOfSolve++;
                            }
                        }
                        if (waysOfSolve != 2)
                            rightNumber++;
                        else
                            ulamPeriod[i] = rightNumber;
                    }
                }
            }
        }
        return ulamPeriod[a-1];
    }
    public static void main(String[] args) {
        System.out.println(ulam(4));
        System.out.println(ulam(9));
        System.out.println(ulam(206));
    }
}
