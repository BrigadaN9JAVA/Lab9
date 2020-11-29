package lab9.task3;

public class CharAtReverser implements ReverserString{
    @Override
    public String reverseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }
}
