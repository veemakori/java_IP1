package org.safmoringa;

public class Encode {
    private static final String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(String msg, int key){
        StringBuilder output = new StringBuilder();
        for (int i = 0; i< msg.length(); i++)
        { char c = msg.charAt(i);
            if( Character.isLetter(c))
            {
                c =(char) ((c - 'a'+ key + 26)% 26 + 'a');
            }
            output.append(c);
        }
        return output.toString();
    }

}
