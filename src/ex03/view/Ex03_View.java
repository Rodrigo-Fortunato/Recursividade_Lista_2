package ex03.view;

import ex03.controller.Ex03_Controller;

public class Ex03_View {
    public static void main(String[] args) {

        Ex03_Controller VetPar = new Ex03_Controller();
        int[] Vetor = {1,2,9,6,7,3,7,5,8,2,6,4,96,6,4,5,65,12,89,9,36,4,6,5,5,96}; //14 Par
        int Tamanho = Vetor.length -1;

        int QuantPar = VetPar.VetorPar(Vetor,Tamanho);
        System.out.println(QuantPar);
    }
}
