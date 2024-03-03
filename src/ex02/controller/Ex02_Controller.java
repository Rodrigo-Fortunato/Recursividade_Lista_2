package ex02.controller;
/*Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e,
 por subtrações, exiba o resto da divisão.*/
public class Ex02_Controller {
	public Ex02_Controller() {
		super();
	}

	//função que simula a operação de divisão a partir da subtração
	public int dividir(int dividendo, int divisor) {

		/*Condição de parada para quando o dividendo se tornar maior que o divisor
		oque torna impossivel subtrair mais, e simboliza o fim da divisão*/
		if (dividendo < divisor) {
			return 0;
		} else {
			//retorna mais 1 para cada vez que foi possivel realizar a subtração
			dividendo = dividendo - divisor;
			return 1 + dividir(dividendo, divisor);
			
		}
	}
}