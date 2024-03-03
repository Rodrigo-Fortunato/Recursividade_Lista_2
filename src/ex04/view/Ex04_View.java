package ex04.view;

import ex04.controller.Ex04_Controller;

import java.util.Scanner;

public class Ex04_View {
    public static void main(String[] args) {
        int num =0;
        int fatoralDuplo =0;
        boolean impar = false;
        Scanner scan = new Scanner(System.in);
        Ex04_Controller fat = new Ex04_Controller();

        //(A entrada deve ser validada fora da função recursiva).
        while (!impar){
            System.out.println("Digite um número Impar: ");
            num = scan.nextInt();

            if (num % 2 != 0){
                impar = true;
            }else{
                System.out.println("Número invalido");
            }

        }
        fatoralDuplo = fat.DuploFat(num);
        System.out.println(fatoralDuplo);
    }
}

