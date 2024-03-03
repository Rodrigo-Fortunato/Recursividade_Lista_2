package ex03.controller;

/*Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quantidade de
    números pares existentes no vetor. Considere que a entrada deve ser, apenas de números naturais
    diferentes de zero.*/

public class Ex03_Controller {

    public Ex03_Controller(){
        super();
    }
    //função recursiva que conta a quantidade de números pares em um vetor
    public int VetorPar(int[] vetor, int tamanho){
        //condição de saida que ocorre quando o vetor chega a sua ultima posição (0).
        if (tamanho < 0){
            return 0;
        }else{
            //condicional que verifica se o número na posição atual é par
            if (vetor[tamanho] % 2 == 0){
                return 1+VetorPar(vetor,tamanho-1); //retorna mais 1 para cada número par encontrado.
            }
            //faz a chamada da função caso o número não seja par.
            return VetorPar(vetor,tamanho-1);

        }
    }


}
