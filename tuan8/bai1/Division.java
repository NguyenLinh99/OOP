package tuan8.bai1;

public class Division {
    private Expression left;
    private Expression right;

    public Division(){}

    public Division(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public Expression left(){
        return left;
    }

    public Expression right(){
        return right;
    }

    public String toString(){
        return left.toString() + " : " + right.toString();
    }

    public int evaluate(){
        return left.evaluate() / right.evaluate();
    }
}
