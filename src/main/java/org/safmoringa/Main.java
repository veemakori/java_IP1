package org.safmoringa;
import java.util.Scanner;

public class Main {
    private String process;
    private String message;
    private int key;

    public void setProcess(String process) {
        this.process = process;
    }

    public String getProcess() {
        return process;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
    public static void main(String[] args) {
        Scanner userInputObject = new Scanner(System.in);
        Main mainObject = new Main();
        do {
            System.out.println("Select the Process either (e)to encode or (d)to decode): ");
            mainObject.setProcess(userInputObject.nextLine());

            System.out.println("Enter Your Message:for Encoding; ");
            mainObject.setMessage(userInputObject.nextLine());

            System.out.println("Enter Any key: From 0 - 25: ");
            mainObject.setKey(userInputObject.nextInt());

            if (mainObject.getProcess().startsWith("e")){

                String output = Encode.encrypt(mainObject.getMessage(), mainObject.getKey());
                System.out.println("Your encoded message is Processing...");
                System.out.println(output);
            } else if (mainObject.getProcess().startsWith("d")) {
//
                String output = Decode.decrypt(mainObject.getMessage(), mainObject.getKey());
                System.out.println("Your decoded message is Processing...");
                System.out.println(output);
            } else {
                System.out.println("The value entered is Invalid");
                continue;
            }
            System.out.println("Do you want to quit or continue the program");
            userInputObject.nextLine();
            String nextStep = userInputObject.nextLine();
            if (nextStep.startsWith("q")){
                break;
            }
        }while (true);
    }
}