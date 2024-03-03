package ex05.controller;
//Fazer uma função recursiva que receba 2 números inteiros posi�vos e apresente o MDC desses números.

public class Ex05_Controller {
    public Ex05_Controller(){
        super();
    }
    //Função que verifica o MDC(máximo divisor comum).
    public int Mdc(int x, int y){

        if (x == y){ //MDC(x,x) = x
            return x;

        }else if (x> y){ //MDC(x, y) = MDC(x − y, y),
            return Mdc(x-y,y);

        }else{ //MDC(x,y) = MDC(y,x)
            return Mdc(y,x);
        }
    }

}
