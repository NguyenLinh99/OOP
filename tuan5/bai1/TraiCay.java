package tuan5.bai1;

public class TraiCay {

    public static void main(String args[]){
        QuaCam qc= new QuaCam("hong", "20/10", 20000, 30,"con tot");
        System.out.println(qc.Tonggiathanh());
        qc.print();
        QuaTao qt= new QuaTao(310, "quang chau", "24/12", 20000,30);
        System.out.println(qt.Tonggiathanh());
        qt.print();
        CamSanh cs= new CamSanh("day", "vietNam", "5/10", 20000,30);
        System.out.println(cs.Tonggiathanh());
        cs.print();
        CamCaoPhong ccp= new CamCaoPhong("Nguyen Linh", "phap", "5/10", 20000,30);
        System.out.println(ccp.Tonggiathanh());
        ccp.print();
    }
}
