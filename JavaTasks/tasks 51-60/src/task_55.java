public class task_55 {
    public static String[] getHashTags(String a) {
        String[] wordsArr = a.toLowerCase().split("[\\s,]+");
        int highLength = wordsArr[0].length();
        for (int i = 1; i < wordsArr.length; i++) {
            if (wordsArr[i].length() > highLength)
                highLength = wordsArr[i].length();
        }
        int tagsSize = 3;
        if (wordsArr.length < 3)
            tagsSize = wordsArr.length;
        String[] tagsArr = new String[tagsSize];
        int tagsLeft = tagsSize;
        int tagsPosCounter = 0;
        for (int i = 0; (tagsLeft > 0)&&(highLength > 0); i++) {
            if (wordsArr[i].length() == highLength) {
                tagsArr[tagsPosCounter] = "#" + wordsArr[i];
                tagsLeft--;
                tagsPosCounter++;
            }
            if (i == wordsArr.length-1){
                i = -1;
                highLength--;
            }
        }
        return tagsArr;
    }
    public static void main(String[] args) {
        String[] a = new String[]{"","",""};
        a = getHashTags("How the Avocado Became the Fruit of the Global Trade");
        for (int i = 0; i < 3; i++){
            System.out.print(a[i] + " ");
        }
    }
}
