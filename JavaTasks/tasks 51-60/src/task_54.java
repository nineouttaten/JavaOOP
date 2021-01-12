import java.util.*;
public class task_54 {
    public static String stripUrlParams(String url, String ... argsToDell) {
        String[] args = url.substring(url.indexOf("?") + 1).split("&");
        StringBuilder finalArgs = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (args[i].charAt(0) == args[j].charAt(0)) {
                    args[i] = " ";
                    break;
                }
            }
            for (String s : argsToDell) {
                if (args[i].charAt(0) == s.charAt(0)) {
                    args[i] = " ";
                    break;
                }
            }
        }
        Arrays.sort(args);
        for (int i = 0; i < args.length; i++) {
            if (!args[i].equals(" "))
                if (i != args.length - 1)
                    finalArgs.append(args[i]).append("&");
                else
                    finalArgs.append(args[i]);
        }
        return url.substring(0, url.indexOf("?")+1) + finalArgs;
    }
    public static void main(String[] args) {
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2") );
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2", "b"));
        System.out.println(stripUrlParams("https://edabit.com", "b"));
    }
}
