package tuan5.bai1;

public class QuaTao extends HoaQua{
    private int soKho;

    public QuaTao(){}

    public QuaTao(int soKho,String xuatXu, String ngayNhap, int gia, float soLuong){
        super(xuatXu,ngayNhap,gia,soLuong);
        this.soKho= soKho;
    }

    public int getSokho() {
        return soKho;
    }
    public void setSokho(int sokho) {
        this.soKho = sokho;
    }

    public float Tonggiathanh(){
        return this.getGia()*this.getSoluong();
    }

    public void print(){
        System.out.println("Thong tin: " + this.soKho+ "\n"+ this.getXuatxu()+ "\n"+ this.getNgaynhap()+ "\n"+ this.getGia()+"\n"+ this.getSoluong());
    }
}
