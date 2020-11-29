package lab9.task3;

public class ArrayReverser implements ReverserString {

    @Override
    public String reverseString(String str) {
        char[] array = str.toCharArray();
        String result = "";
        for(int i = array.length-1; i >= 0 ; i--) {
            result = result + array[i];
        }
        return result;
    }
}
