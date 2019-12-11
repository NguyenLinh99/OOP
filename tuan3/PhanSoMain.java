package tuan3;

import tuan3.*;

public class PhanSoMain {
    public static void main(String[] args) {
        PhanSo ps = new PhanSo(15, 9);
        ps = ps.rutGon();
        System.out.println(ps.output());
        PhanSo psm = new PhanSo(9, 6);

        PhanSo ps1 = ps.congPhanSo(psm);
        System.out.println(ps1.output());

        PhanSo ps2 = ps.truPhanSo(psm);
        System.out.println(ps2.output());

        PhanSo ps3 = ps.tichPhanSo(psm);
        System.out.println(ps3.output());

        PhanSo ps4 = ps.thuongPhanSo(psm);
        System.out.println(ps4.output());

        if (ps.equals(psm))
            System.out.println("true");
        else
            System.out.println("false");

    }
}
