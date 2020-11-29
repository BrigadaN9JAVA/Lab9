package lab9.task3;

public class StringBuilderReverser implements ReverserString{

    @Override
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
