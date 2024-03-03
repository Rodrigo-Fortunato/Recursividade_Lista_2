package ex05.view;

import ex05.controller.Ex05_Controller;

public class Ex05_View {
    public static void main(String[] args) {
        Ex05_Controller MDC = new Ex05_Controller();
        int x =90;
        int y =108;

        System.out.println(MDC.Mdc(x,y));
    }
}
