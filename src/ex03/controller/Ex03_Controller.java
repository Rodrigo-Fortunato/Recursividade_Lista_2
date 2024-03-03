package ex03.controller;

/*Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quantidade de
    números pares existentes no vetor. Considere que a entrada deve ser, apenas de números naturais
    diferentes de zero.*/

public class Ex03_Controller {

    public Ex03_Controller(){
        super();
    }

    public int VetorPar(int[] vetor, int tamanho){
        if (tamanho < 0){
            return 0;
        }else{

            if (vetor[tamanho] % 2 == 0){
                return 1+VetorPar(vetor,tamanho-1);
            }
            return VetorPar(vetor,tamanho-1);

        }
    }


}
