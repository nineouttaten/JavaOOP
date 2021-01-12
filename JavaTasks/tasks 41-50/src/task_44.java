public class task_44 {
    public static int sumDigProd(int[] arrOfNums) {
        int sum = 0;
        for (int num: arrOfNums) {
            sum += num;
        }
        while (sum / 10 != 0){
            int allNumProd = 1;
            String temp = Integer.toString(sum);
            for (int i = 0; i < temp.length(); i++) {
                allNumProd = Character.getNumericValue(temp.charAt(i)) * allNumProd;
            }
            sum = allNumProd;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigProd(new int[]{16, 28} ));
        System.out.println(sumDigProd(new int[]{0} ));
        System.out.println(sumDigProd(new int[]{1, 2, 3, 4, 5, 6} ));
    }
}
