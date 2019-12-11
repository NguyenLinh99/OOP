package tuan3.bai3;

public class Women {

    private double weight, hight;
    private int birth;
    private String giadinh;

    Women() {
        this.hight = 150;
        this.weight = 50;
        this.birth = 1999;
        this.giadinh = "chua";
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public int getBirth() {
        return birth;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getHight() {
        return hight;
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

    public double BMI() {

        return this.hight / (this.weight * this.weight);
    }

    public boolean ssBMI(double n) {
        if (n >= 30.0) return true;
        return false;
    }

    public boolean ketHon() {
        if (giadinh.equals("Chua"))
            return true;
        else
            return false;
    }

    public void output() {

        System.out.println("Nguoi nay: " + this.age(this.birth) + " tuoi.");
        System.out.println("Chi so BMI cua nguoi nay la: " + this.BMI());
        System.out.println("Nguoi nay bi beo phi: " + this.ssBMI(this.BMI()));
        System.out.println("Tinh trang hon nhan: " + this.ketHon());

    }
}