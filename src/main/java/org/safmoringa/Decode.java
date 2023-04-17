package org.safmoringa;

public class Decode {
    private static final String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        public static String decrypt(String msg, int key){
        StringBuilder output = new StringBuilder();
        for(char c: msg.toCharArray()){
            int charPos = alphabets.indexOf(c);
            if (charPos == -1){
                output.append(c);
                continue;
            }
            int tempNewPos = charPos - key;
            int newPos = tempNewPos < 0 ? 26 + tempNewPos : tempNewPos;
            char replacement = alphabets.charAt(newPos);
            output.append(replacement);
        }
        return output.toString();
    }
}
