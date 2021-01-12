public class task_53 {
    public static boolean validColor(String a) {
        a = a.toLowerCase();
        if (a.contains("rgba")) {
            String[] arrOfRGBA = a.substring(5).split("[\\D&&[^.]]");
            if (arrOfRGBA.length == 4) {
                try {
                    for (int i = 0; i < 3; i++){
                        if (!(Integer.parseInt(arrOfRGBA[i]) >= 0 && Integer.parseInt(arrOfRGBA[i]) <= 255))
                            return false;
                    }
                    return Float.parseFloat(arrOfRGBA[3]) >= 0 && Float.parseFloat(arrOfRGBA[3]) <= 1;
                } catch (Exception e) {
                    return false;
                }
            }
            else return false;
        }
        else if (a.contains("rgb")) {
            String[] arrOfRGBA = a.substring(4).split("[\\D&&[^.]]");
            if (arrOfRGBA.length == 3) {
                try{
                    for (int i = 0; i < 3; i++) {
                        if (!(Integer.parseInt(arrOfRGBA[i]) >= 0 && Integer.parseInt(arrOfRGBA[i]) <= 255))
                            return false;
                    }
                    return true;
                }
                catch (Exception e){
                    return false;
                }
            }
            else return false;
        }
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(validColor("rgb(0,0,0)") );
        System.out.println(validColor("rgb(0,,0)")  );
        System.out.println(validColor("rgb(255,256,255)")  );
        System.out.println(validColor("rgba(0,0,0,0.123456789)"));
    }
}
