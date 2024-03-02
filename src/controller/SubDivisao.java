package controller;
//Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e, por
//subtrações, exiba o resto da divisão.
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
