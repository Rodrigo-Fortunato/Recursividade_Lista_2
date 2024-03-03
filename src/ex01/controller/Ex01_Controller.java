package ex01.controller;
/*Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da
		mul�plicação de A por B.*/
public class Ex01_Controller {
	public Ex01_Controller() {
		super();
	}

	//Classe que simula a multiplicação a partir da soma
	public int Mult(int A, int B) {
		/*Condicional que retorna o próprio número A,
		simulando a operação do número multiplicado por 1 e encerrando a recursividade*/
		if (B == 1) {
			return A;
		}else {
			//Realiza a soma X vezes, utilizando o número B como contador de vezes
			return A+ Mult(A, B-1);
			
		}
	}
	
	

}
