package tuan3.bai3;

public class Cat {
    private float cao, nang;
    private String name, chu, gioitinh;

    public Cat(float cao, float nang, String name, String chu){
        this.cao =cao; this.nang=nang; this.name=name; this.chu=chu;
    }
    public void setcao(float cao){
        this.cao=cao;
    }
    public float getCao(){
        return cao;
    }

    public void setnang(float nang){
        this.nang=nang;
    }
    public float getnang(){
        return nang;
    }

    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }

    public void setchu(String chu){
        this.chu= chu;
    }
    public String getchu(){
        return chu;
    }

    public void setGioitinh(String gioitinh){
        this.gioitinh = gioitinh;
    }

    public void sameChu(Cat other){
        if(chu.equals(other.getchu())){
            System.out.print("cung chu");
        }
        else {
            System.out.print("khac chu");
        }
    }

    public void sameGioitinh(Cat other){
        if(gioitinh.equals(other.gioitinh)){
            System.out.print("cung la"+gioitinh);
        }
        else {
            System.out.print("khac gioi tinh");
        }
    }

    public float BMI(){
        return nang/(cao*cao/10000);
    }

    public boolean sameBMI(Cat other){
        if(BMI() == other.BMI())
            return true;
        else
            return false;
    }

    public void print_(){
        System.out.println("thong tin :\nTen meo: "+ name+ "\nChu: "+chu+"\nCan nang: "+ nang+"Chieu cao: "+cao+"Gioi tinh:"+gioitinh);
    }



}
