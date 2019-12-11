package tuan8.bai1;

import tuan8.bai1.Expression;

public class Square extends Expression {
    protected Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    public String toString(){
        return expression.evaluate() + "^2";
    }

    public int evaluate() {
        return expression.evaluate()*expression.evaluate();
    }
}
