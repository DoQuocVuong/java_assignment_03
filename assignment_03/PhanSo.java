package assignment_03;

import java.util.Scanner;

public class PhanSo {
//    public int tuSo1;
//    public int mauSo1;
//    public int tuSo2;
//    public int mauSo2;
    public int tuSo;
    public int mauSo;

    public PhanSo(int tuSo, int mauSo) {

        this.tuSo = tuSo;

        this.mauSo = mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int getMauSo() {
        return mauSo;
    }

//    public void checkPhanSo() {
//        if (mauSo != 0) {
//            System.out.println("Mẫu sô phải khác không. Hãy nhập lại");
//            nhapPhanSo();
//        }
//    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void rutGonPhanSo() {
        int i = timUSCLN(this.getTuSo(), this.getMauSo());
        this.setTuSo(this.getTuSo() / i);
        this.setMauSo(this.getMauSo() / i);
    }

//    public void nhapPhanSo() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hãy nhập tử số 1: ");
//        tuSo1 = scanner.nextInt();
//        System.out.println("Hãy nhập mẫu số 1: ");
//         mauSo1 = scanner.nextInt();
//        System.out.println("Hãy nhập tử số 2: ");
//         tuSo2 = scanner.nextInt();
//        System.out.println("Hãy nhập mẫu số 2: ");
//         mauSo2 = scanner.nextInt();
//
//        checkPhanSo();
//    }

    public void inPhanSo() {

        System.out.println("Phân số là: " + tuSo + "/" + mauSo);
    }

    public void nghichDaoPhanSo() {
        int ts = this.getMauSo();
        int ms = this.getTuSo();
        PhanSo phanSoNgichDao = new PhanSo(ts, ms);
        phanSoNgichDao.rutGonPhanSo();
        System.out.println("Nghịch đảo phân số = " + phanSoNgichDao.tuSo + "/" + phanSoNgichDao.mauSo);
    }

    public void add(PhanSo ps) {
        int ts = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.rutGonPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.tuSo + "/" + phanSoTong.mauSo);
    }

    public void sub(PhanSo ps) {
        int ts = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        phanSoHieu.rutGonPhanSo();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tuSo + "/" + phanSoHieu.mauSo);
    }

    public void mul(PhanSo ps) {
        int ts = this.getTuSo() * ps.getTuSo();
        int ms = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoTich = new PhanSo(ts, ms);
        phanSoTich.rutGonPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.tuSo + "/" + phanSoTich.mauSo);
    }

    public void div(PhanSo ps) {
        int ts = this.getTuSo() * ps.getMauSo();
        int ms = this.getMauSo() * ps.getTuSo();
        PhanSo phanSoThuong = new PhanSo(ts, ms);
        phanSoThuong.rutGonPhanSo();
        System.out.println("Thương hai phân số = " + phanSoThuong.tuSo + "/" + phanSoThuong.mauSo);
    }
}
