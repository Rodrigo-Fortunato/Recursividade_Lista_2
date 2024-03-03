package ex05.controller;
//Fazer uma função recursiva que receba 2 números inteiros posi�vos e apresente o MDC desses números.

public class Ex05_Controller {
    public Ex05_Controller(){
        super();
    }
    public int Mdc(int x, int y){
        if (x == y){
            return x;
        }else if (x> y){
            return Mdc(x-y,y);
        }else{
            return Mdc(y,x);
        }
    }

}
