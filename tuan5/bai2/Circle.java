package tuan5.bai2;

public class Circle extends Shape{
    private double radius=1.0;
    private final float Pi =(float) 3.14;
    /**
     * @return Pi
     */
    public float getPi() {
        return Pi;
    }
    /**
     * hàm khai báo không chứa tham số
     */
    public Circle(){
    }
    /**
     * @param radius thống số 1
     * @param color thông số 2
     * @param filled thông số 3
     * @since Shape
     */
    public Circle(double radius,String color, boolean filled){
        super(color, filled);
        this.radius= radius;
    }
    /**
     * @return radius
     */
    public double getRadius() {
        return radius;
    }
    /**
     * @param radius thông số 1
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     * @return diện tích của đối tượng hình tròn
     */
    public double getArea(){
        return (float)this.radius*this.radius*this.Pi;
    }
    /**
     * @return chuvi của đối tượng hình tròn
     */
    public double getPerimeter(){
        return (float)this.Pi*2*this.radius;
    }
    /**
     * hiện thị thông tin thuộc tính của đối tượng
     */
    public String toString(){
        return "Thong tin: \nMau: "+this.getColor()+"\n"+this.isFilled()+"\nBan kinh: "+this.radius+"\nS: "+this.getArea()+ "\nC: "+this.getPerimeter();
    }
}
