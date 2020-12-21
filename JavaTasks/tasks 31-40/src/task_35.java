public class task_35 {
    public static String BMI(String height, String weight){
        int index = 0;
        double number1;
        double number2;
        if(height.indexOf("pounds") != -1){
            index = height.indexOf("pounds");
            number1 = Double.parseDouble(height.substring(0, index));
            number1 *= 0.453592;
        }
        else{
            index = height.indexOf("kilos");
            number1 = Double.parseDouble(height.substring(0, index));
        }
        if(weight.indexOf("inches") != -1){
            index = weight.indexOf("inches");
            number2 = Double.parseDouble(weight.substring(0, index));
            number2 /= 39.37;
        }
        else{
            index = weight.indexOf("meters");
            number2 = Double.parseDouble(weight.substring(0, index));
        }
        number1 = number1 / (number2 * number2);
        number1 = Math.round(number1 * 100.0) / 100.0;
        if(number1 < 18.5){
            return String.valueOf(number1) + " Underweight";
        }
        else if(number1 <= 24.9){
            return String.valueOf(number1) + " Normal weight";
        }
        else{
            return String.valueOf(number1) + " Overweight";
        }

    }
    public static void main(String[] args){
        System.out.println(BMI("205 pounds", "73 inches") );
        System.out.println(BMI("55 kilos", "1.65 meters")  );
        System.out.println(BMI("154 pounds", "2 meters")  );
    }
}
