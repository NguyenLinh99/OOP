package tuan5.bai2;

public class Rectangle extends Shape{
    private double width=1.0, length=1.0;
    /**
     * hàm khai báo không chứa tham số
     */
    public Rectangle(){}
    /**
     * @param width thông số 1
     * @param length thông số 2
     */
    public Rectangle(double width, double length){
        this.length=length;
        this.width=width;
    }
    /**
     * @param width thông số 1
     * @param length thông số 2
     * @param color thông số 3
     * @param filled thông số 4
     * @since Shape
     */
    public Rectangle(double width, double length,String color, boolean filled){
        super( color, filled);
        this.length=length;
        this.width=width;
    }
    /**
     * @return width
     */
    public double getWidth() {
        return width;
    }
    /**
     * @param width thông số 1
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * @return length
     */
    public double getLength() {
        return length;
    }
    /**
     * @param length thông số 2
     */
    public void setLength(double length) {
        this.length = length;
    }
    /**
     * @return diện tích đối tượng chữ nhật
     */
    public double getArea(){
        return this.length*this.width;
    }
    /**
     * @return chu vi đối tượng chữ nhật
     */
    public double getPerimeter(){
        return 2*(this.length+this.width);
    }
    /**
     * hiện thị thông tin thuộc tính đối tượng
     */
    public String toString(){
        return "thong tin:\nMau: "+ this.getColor()+"\n"+ this.isFilled()+"\nChieu dai: "+ this.length+"\nChieu rong: "+ this.width+"\nS: "+ this.getArea()+"\nC: "+ this.getPerimeter();
    }
}
