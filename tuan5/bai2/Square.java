package tuan5.bai2;

public class Square extends Rectangle {


    /**
     * ham khoi tao khong tham so
     */
    public Square(){
    }
    /**
     * @param side thông số 1
     */
    public Square(double side) {
        setLength(side);
        setWidth(side);
    }
    /**
     * @param side thong so thu 1
     * @param color thông số thứ 2
     * @param filled thông số thứ 3
     * @since Rectangle
     */
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    /**
     * @return side
     */
    public double getSide() {
        return super.getLength();
    }
    /**
     * @param side thông số 1
     */
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
    /**
     * @since Shape
     */
    public void setWidth() {
        super.setWidth(super.getWidth());
    }
    /**
     * @since Shape
     */
    public void setLength(){
        super.setLength(super.getLength());
    }
    /**
     * @return xâu thong tin cua hình vuông
     */
    @Override
    public String toString() {
        return "Square{ "+"side: "+super.getWidth()
                + ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter()+" }";
    }
}
