package tuan5.bai1;

public class CamCaoPhong extends HoaQua{
    private String nguoiQuanli;

    public CamCaoPhong(){}

    public CamCaoPhong(String nguoiQuanli,String xuatXu, String ngayNhap, int gia, float soLuong){
        super(xuatXu,ngayNhap,gia,soLuong);
        this.nguoiQuanli= nguoiQuanli;
    }

    public String getNguoiquan() {
        return nguoiQuanli;
    }
    public void setNguoiquan(String nguoiquanli) {
        this.nguoiQuanli = nguoiquanli;
    }

    public float Tonggiathanh(){
        return this.getGia()*this.getSoluong();
    }

    public void print(){
        System.out.println("Thong tin: " + this.nguoiQuanli+ "\n"+ this.getXuatxu()+ "\n"+ this.getNgaynhap()+ "\n"+ this.getGia()+"\n"+ this.getSoluong());
    }

}
