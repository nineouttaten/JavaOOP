public class task_34 {
    public static String overTime(double[] mass){
        double sum = 0;
        if(mass[1] > 17){
            sum += (17 - mass[0]) * mass[2];
            sum += (mass[1] - 17) * mass[2] * mass[3];
        }
        else{
            sum += (mass[1] - mass[0]) * mass[2];
        }
        String double_sum = Double.toString(sum);
        String line = "$" + double_sum;
        return line;
    }
    public static void main(String[] args){
        System.out.println(overTime(new double[]{9, 17, 30, 1.5}));
        System.out.println(overTime(new double[]{16, 18, 30, 1.8}));
        System.out.println(overTime(new double[]{13.25, 15, 30, 1.5}));
    }
}
