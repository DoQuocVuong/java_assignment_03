package assignment_03;

public class Main {
    public static void main(String arg[]){
//        PhanSo ps = new PhanSo();
        PhanSo ps1 = new PhanSo(12,36);
        PhanSo ps2 = new PhanSo(12,24);
        ps1.add(ps2);
        ps1.sub(ps2);
        ps1.mul(ps2);
        ps1.div(ps2);
        ps1.nghichDaoPhanSo();

//        ps.nhapPhanSo();
//        ps.inPhanSo();
//        ps.nghichDaoPhanSo();
//        ps.add(ps);

    }
}
