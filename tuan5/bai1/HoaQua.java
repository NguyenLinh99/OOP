package tuan5.bai1;

public class HoaQua {
    private String xuatXu, ngayNhap;
    private int gia;
    private float soLuong;

    public HoaQua(){

    }

    public HoaQua(String xuatXu, String ngayNhap, int gia, float soLuong){
        this.xuatXu = xuatXu;
        this.ngayNhap = ngayNhap;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getXuatxu() {
        return xuatXu;
    }
    public void setXuatxu(String xuatxu) {
        this.xuatXu = xuatxu;
    }

    public String getNgaynhap() {
        return ngayNhap;
    }
    public void setNgaynhap(String ngaynhap) {
        this.ngayNhap = ngaynhap;
    }

    public int getGia() {
        return gia;
    }
    public void setGia(int gia) {
        this.gia = gia;
    }

    public float getSoluong() {
        return soLuong;
    }
    public void setSoluong(float soluong) {
        this.soLuong = soluong;
    }

    public float Tonggiathanh(){
        return this.getGia()*this.getSoluong();
    }




}
