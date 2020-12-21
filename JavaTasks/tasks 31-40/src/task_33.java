public class task_33 {
    public static String toCamelCase(String line){
        char[] line_array = line.toCharArray();
        for (int i = 0; i != line.length(); i++){
            if (line_array[i] == '_'){
                line_array[i + 1] = Character.toUpperCase(line_array[i + 1]);

            }
        }
        line = new String(line_array);
        line = line.replaceAll("_", "");
        return line;
    }
    public static String toSnakeCase(String line){
        line = line.replaceAll("([A-Z])", "_$1").toLowerCase();
        return line;
    }
    public static void main(String[] args){
        System.out.println(toSnakeCase("toSnakeCase"));
        System.out.println(toCamelCase("to_camel_case"));
    }
}
