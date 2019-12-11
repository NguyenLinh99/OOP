package tuan5.bai1;

public class QuaCam extends HoaQua{

    private String chatLuong;
    public QuaCam(){

    }
    public QuaCam(String xuatXu, String ngayNhap, int gia, float soLuong, String chatLuong){
        super(xuatXu, ngayNhap, gia, soLuong);
        this.chatLuong = chatLuong;
    }

    public String getChatluong() {
        return chatLuong;
    }
    public void setChatluong(String chatluong) {
        this.chatLuong = chatluong;
    }

    public void kiemtra(){
        if(chatLuong.equals("hong")==true) System.out.println("can tieu huy");
        else if(chatLuong.equals("chin")==true) System.out.println("can som tieu huy");
        else System.out.println("con tot");
    }

    public float Tonggiathanh(){
        return this.getGia()*this.getSoluong();
    }

    public void print(){
        System.out.println("Thong tin: " + this.chatLuong+ "\n"+ this.getXuatxu()+ "\n"+ this.getNgaynhap()+ "\n"+ this.getGia()+"\n"+ this.getSoluong());
    }
}
