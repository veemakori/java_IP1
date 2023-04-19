package org.safmoringa;

public class Decode {
    private static final String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String decrypt(String msg, int shift) {
        StringBuilder decryptedMessage = new StringBuilder();
        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i);
            if (Character.isLetter(c)) {
                c = (char) ((c - 'a' - shift + 26) % 26 + 'a');
            }
            decryptedMessage.append(c);
        }
        return decryptedMessage.toString();
    }
}
