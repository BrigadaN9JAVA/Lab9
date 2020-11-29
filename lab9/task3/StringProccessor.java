package lab9.task3;

import com.sun.jdi.StringReference;

public class StringProccessor {
    private ReverserString reverser;

    public StringProccessor(){
        reverser = new StringBuilderReverser();
    }

    public StringProccessor(ReverserString reverser){
        this.reverser = reverser;
    }

    public void setReverser(ReverserString reverser) {
        this.reverser = reverser;
    }

    private String intToOctString(int i) {
        int copyI = i;
        int octI;
        String result = "";

        while(copyI != 0){
            octI = copyI % 8;

            if(octI < 0)
                octI = Math.abs(octI);

            result += String.valueOf(octI);
            copyI /= 8;
        }

        if(i < 0)
            return "-"+reverser.reverseString(result);

        else
            return reverser.reverseString(result);
    }

    public void printResult(int i){
        try{
            System.out.println("Аргумент: " + i + "\nРезультат: \"" + intToOctString(i)+ "\"");
        } catch (Exception err){
            System.out.println(err.getMessage());
        }
    }
}
