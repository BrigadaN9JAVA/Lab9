package lab9.task10;

public class Task10 {
    public static void main(String[] args) {
        printResult("The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago");
        printResult("% ^ %");
        printResult("     ");
    }

    private static String toUpperCaseWords(String str){
        String[] subStr;
        boolean isWord = true;
        String result = "";
        subStr = str.trim().split(" ");
        for (int i = 0; i < subStr.length; i++) {
            for (int j = 0; j < subStr[i].length(); j++) {
                if(Character.isDigit(subStr[i].charAt(j))){
                    isWord = false;
                    break;
                }
            }
            if(isWord){
                subStr[i] = subStr[i].toUpperCase();
            }
            isWord = true;
            result = result + subStr[i] + " ";
        }
        return result.trim();
    }

    public static void printResult(String str){
        try{
            System.out.println("Аргумент: " + str + "\nРезультат: " + toUpperCaseWords(str));
        } catch (Exception err){
            System.out.println(err.getMessage());
        }
    }
}
