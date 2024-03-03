package ex04.controller;
/*Faça uma função recursiva que receba um número inteiro positivo ímpar N e retorne o fatorial duplo
        desse número (A entrada deve ser validada fora da função recursiva). O fatorial duplo é definido como o
        produto de todos os números naturais ímpares de 1 até algum número natural ímpar N. Assim, o fatorial
        duplo de 5 é:*/
public class Ex04_Controller {
    public Ex04_Controller(){
        super();
    }

    public int DuploFat(int num){
        if (num == 0){
            return 1;
        }else{
            if (num % 2 != 0){
                return num * DuploFat(num-1);
            }
            return  DuploFat(num-1);
        }

    }


}
