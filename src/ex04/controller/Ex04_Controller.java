package ex04.controller;
/*Faça uma função recursiva que receba um número inteiro positivo ímpar N e retorne o fatorial duplo
        desse número (A entrada deve ser validada fora da função recursiva). O fatorial duplo é definido como o
        produto de todos os números naturais ímpares de 1 até algum número natural ímpar N. */
public class Ex04_Controller {
    public Ex04_Controller(){
        super();
    }

    //função que realiza o fatorial duplo, começando do ultimo número até chegar a 1, enquanto verifica se o número é impar
    public int DuploFat(int num){
        //condicional de saida, verifica se o fatorial ja chegou ao número 1
        if (num == 1){
            return 1;
        }else{
            //condicional que verifica se o número é impar
            if (num % 2 != 0){
                return num * DuploFat(num-1);
            }
            //chamada da função caso o número não seja impar
            return  DuploFat(num-1);
        }

    }


}
