package tuan3.bai3;

public class Benhnhan {

    private String name, phong, benh, tinh_trang;
    private int tuoi;

    public Benhnhan(String name,String phong, String benh,String tinh_trang, int tuoi){
        this.name=name;
        this.phong=phong;
        this.benh=benh;
        this.tinh_trang=tinh_trang;
        this.tuoi=tuoi;
    }

    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }

    public void setbenh(String benh){
        this.benh=benh;
    }
    public String getbenh(){
        return benh;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }
    public String getPhong(){
        return phong;
    }

    public void settinh_trang(String tinh_trang){
        this.tinh_trang=tinh_trang;
    }
    public String gettinh_trang(){
        return tinh_trang;
    }

    public void settuoi(int tuoi){
        this.tuoi=tuoi;
    }
    public int gettuoi(){
        return tuoi;
    }

    public void getInf(){
        System.out.println("Thong tin benh nhan :\nTen: "+name+"Tuoi: "+tuoi+"Phong: "+ phong+"\nBenh: "+ benh+ "Tinh trang suc khoe: "+ tinh_trang);

    }

    public void uu_tien(){
        if (tinh_trang.equals("yeu")==true){
            System.out.println("Gap");
        }
        else if(tinh_trang.equals("hoi phuc")==true){
            System.out.println("Xep lich ra vien");
        }
        else if(tinh_trang.equals("khoe")==true){
            System.out.println("Ra vien");
        }
        else if(tinh_trang.equals("nguy kich")==true){
            System.out.println("Can cap cuu gap");
        }
    }

    public void samebenh(Benhnhan other){
        if(benh.equals(other.getbenh())==true){
            System.out.println("xep cung phong");
        }
    }

    public boolean samePhong(Benhnhan other){
        if(phong.equals(other.getPhong())==true)
            return true;

        else
            return false;
    }
}




