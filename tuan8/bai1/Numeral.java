package tuan8.bai1;

import tuan8.bai1.Expression;

public class Numeral extends Expression {
    private int value;
    public Numeral(){

    }

    public Numeral(int value){
        this.value = value;
    }

    public String toString(){
        return Integer.toString(value);
    }

    public int evaluate(){
        return value;
    }
}
