package ex02.controller;
//Criar uma fun��o recursiva que receba o dividendo e o divisor de uma opera��o de divis�o e, por
//subtra��es, exiba o resto da divis�o.
public class SubDivisao {
	public SubDivisao() {
		super();
	}
	
	public int Dividir(int dividendo, int divisor){
		if (dividendo < divisor) {
			return 0;
		}else {
			return 1+ Dividir(dividendo-divisor, divisor);
		}
	}
	
}
