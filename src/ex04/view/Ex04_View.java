package ex04.view;

import ex04.controller.Ex04_Controller;

import java.util.Scanner;

public class Ex04_View {
    public static void main(String[] args) {
        int num =0;
        int fatorialDuplo;
        boolean impar = false;
        Scanner scan = new Scanner(System.in);
        Ex04_Controller fat = new Ex04_Controller();

        //Recebe e verifica se o número digitando pelo usuario é impar,
        while (!impar){
            System.out.println("Digite um número Impar: ");
            num = scan.nextInt();

            if (num % 2 != 0){
                impar = true;
            }else{
                System.out.println("Número invalido");
            }

        }

        fatorialDuplo = fat.DuploFat(num);
        System.out.println(fatorialDuplo);
    }
}

