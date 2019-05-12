package assignment_03;

import java.io.*;
import java.util.Scanner;

public class PhanSo {
    protected int ts, ms;

    PhanSo() {
    }

    PhanSo(int tu, int mau) {
        ts = tu;
        ms = mau;
    }

    static int nhapgt() throws IOException {
        String str;
        DataInputStream stream = new DataInputStream(System.in);
        str = stream.readLine();
        return Integer.valueOf(str).intValue();
    }

    PhanSo nhapps(int x) throws IOException {
        int tu, mau;
        System.out.println("Nhập phân số thứ " + x);
        System.out.println("Tử số: ");
        tu = nhapgt();
        System.out.println("Mẫu số: ");
        do {
            mau = nhapgt();
            if (mau == 0) System.out.println("Nhập lại");
        } while (mau == 0);
        PhanSo ps = new PhanSo(tu, mau);
        return ps;
    }

    static int UCLN(int a, int b) {
        while (a != b)
            if (a > b) a = a - b;
            else b = b - a;
        return a;
    }

    static PhanSo toigian(PhanSo ps) {
        PhanSo phanso = new PhanSo();
        phanso.ts = ps.ts / UCLN(Math.abs(ps.ts), Math.abs(ps.ms));
        phanso.ms = ps.ms / UCLN(Math.abs(ps.ts), Math.abs(ps.ms));
        return phanso;
    }

    static PhanSo add(PhanSo ps1, PhanSo ps2) {
        PhanSo phanso = new PhanSo();
        phanso.ts = ps1.ts * ps2.ms + ps2.ts * ps1.ms;
        phanso.ms = ps1.ms * ps2.ms;
        if (phanso.ts != 0)
            phanso = toigian(phanso);
        return phanso;
    }

    static PhanSo sub(PhanSo ps1, PhanSo ps2) {
        PhanSo phanso = new PhanSo();
        phanso.ts = ps1.ts * ps2.ms - ps2.ts * ps1.ms;
        phanso.ms = ps1.ms * ps2.ms;
        if (phanso.ts != 0)
            phanso = toigian(phanso);
        return phanso;
    }

    static PhanSo nghichdao(PhanSo ps1, PhanSo ps2) {
        PhanSo phanso1 = new PhanSo();
        PhanSo phanso2 = new PhanSo();
        phanso1.ts = ps1.ms;
        phanso1.ms = ps1.ts;
        if (phanso1.ts != 0)
            phanso1 = toigian(phanso1);
        return phanso1;

    }

    static PhanSo mul(PhanSo ps1, PhanSo ps2) {
        PhanSo phanso = new PhanSo();
        phanso.ts = ps1.ts * ps2.ts;
        phanso.ms = ps1.ms * ps2.ms;
        if (phanso.ts != 0)
            phanso = toigian(phanso);
        return phanso;
    }

    static PhanSo div(PhanSo ps1, PhanSo ps2) {
        PhanSo phanso = new PhanSo();
        phanso.ts = ps1.ts * ps2.ms;
        phanso.ms = ps1.ms * ps2.ts;
        if (phanso.ts != 0)
            phanso = toigian(phanso);
        return phanso;
    }

    static void hienthi(PhanSo ps) {
        if (ps.ms == 1 || ps.ts == 0)
            System.out.println(ps.ts);
        else System.out.println(ps.ts + "/" + ps.ms);
    }
}
