package tuan3;

public class PhanSo {
    private int tu, mau;

    public PhanSo(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getTu() {
        return tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int getMau() {
        return mau;
    }

    public String output(){
        if(mau == 0)
            return "false";
        else if(mau == 1)
            return String.valueOf(tu);
        else
            return tu + "/" +mau;

    }

    public int ucln(int tu, int mau){
        int a = Math.abs(tu);
        int b = Math.abs(mau);
        while (a != b){
            if(a < b)
                b = b - a;
            else
                a = a - b;
        }
        return a;
    }

    public PhanSo rutGon(){
        int x = ucln(this.tu, this.mau);
        return new PhanSo(tu/x, mau/x);
    }

    public PhanSo congPhanSo(PhanSo ps){
        int a=(this.getTu()*ps.getMau()) + (ps.getTu()*this.getMau());
        int b=ps.getMau()*this.getMau();

        return new PhanSo(a, b).rutGon();
    }

    public PhanSo truPhanSo(PhanSo ps){
        int a=(this.getTu()*ps.getMau()) - (ps.getTu()*this.getMau());
        int b=ps.getMau()*this.getMau();

        return new PhanSo(a, b).rutGon();
    }

    public PhanSo tichPhanSo(PhanSo ps){
        int a=this.getTu()*ps.getTu();
        int b=this.getMau()*ps.getMau();

        return new PhanSo(a, b).rutGon();

    }

    public PhanSo thuongPhanSo(PhanSo ps){
        int a=(this.getTu()*ps.getMau());
        int b=ps.getTu()*this.getMau();

        return new PhanSo(a, b).rutGon();
    }

    public boolean equals(PhanSo ps){
        int ps1Tu = this.getTu() * ps.getMau();
        int ps2Tu = this.getMau() * ps.getTu();
        if(ps1Tu == ps2Tu)
            return true;
        else
            return false;
    }


}
