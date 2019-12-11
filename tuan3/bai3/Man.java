package tuan3.bai3;

public class Man {

    private String job;
    private int birth;
    private String giadinh;

    public Man() {
        this.job = "giao vien";
        this.birth = 1999;
        this.giadinh = "chua";
    }

    public void setJob(String job){
        this.job = job;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getBirth() {
        return birth;
    }


    public void setGiadinh(String gd) {
        giadinh = gd;
    }
    public String getGiadinh() {
        return giadinh;
    }

    public int age(int a) {
        return 2018 - a;
    }

    public boolean ketHon() {
        if (giadinh.equals("Chua"))
            return true;
        else
            return false;
    }

    public String marryWithWomen(){
        Women wm = new Women();
        if(this.giadinh.equals(wm.getGiadinh()))
            return "Co the lay nhau";
        else
            return "Cung co the lay nhau";
    }

    public boolean sameAge(Women wm){
        if(this.age(birth) == wm.age(wm.getBirth()))
            return true;
        else
            return false;
    }

    public void output() {

        System.out.println("Nguoi nay: " + this.age(this.birth) + " tuoi." + this.job);
        System.out.println("Tinh trang hon nhan: " + this.ketHon());

    }

}
