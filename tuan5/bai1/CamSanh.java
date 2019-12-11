package tuan5.bai1;

public class CamSanh extends HoaQua{
    private String tinhTrangkho;

    public CamSanh(){}

    public CamSanh(String tinhTrangkho,String xuatXu, String ngayNhap, int gia, float soLuong){
        super(xuatXu,ngayNhap,gia,soLuong);
        this.tinhTrangkho= tinhTrangkho;
    }

    public String getTinhtrang() {
        return tinhTrangkho;
    }
    public void setTinhtrang(String tinhtrangkho) {
        this.tinhTrangkho = tinhtrangkho;
    }

    public String kiemtra( ){
        if(this.tinhTrangkho.equals("day")==true) return "khong the nhap them";
        else if(this.tinhTrangkho.equals("chua day")==true) return "co the nhap them";
        else return "can nhap them gap"  ;
    }

    public float Tonggiathanh(){
        return this.getGia()*this.getSoluong();
    }

    public void print(){
        System.out.println("Thong tin: " + this.tinhTrangkho+ "\n"+ this.getXuatxu()+ "\n"+ this.getNgaynhap()+ "\n"+ this.getGia()+"\n"+ this.getSoluong());
    }
}
