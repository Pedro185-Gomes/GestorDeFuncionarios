package util;

import java.util.Scanner;

public class InputHandler {
    private final Scanner sc;

    public InputHandler() {
        this.sc = new Scanner(System.in);
    }

    public String lerTexto(String msg) {
        System.out.print(msg);
        return sc.next();
    }

    public int lerInt(String msg) {
        System.out.print(msg);
        return sc.nextInt();
    }
}
