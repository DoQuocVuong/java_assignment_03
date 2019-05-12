package assignment_03;

import java.io.IOException;

public class Main {
    public static void main(String arg[]) throws IOException {
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        ps1 = ps1.nhapps(1);
        ps2 = ps2.nhapps(2);
        if (ps1.ts != 0)
            ps1 = PhanSo.toigian(ps1);
        if (ps2.ts != 0)
            ps2 = PhanSo.toigian(ps2);
        System.out.println("Phân sô nghịch đảo: ");
        PhanSo.hienthi(PhanSo.nghichdao(ps1,ps2));
        System.out.println("Phân số 1 ở dạng tối giản: ");
        PhanSo.hienthi(ps1);
        System.out.println("Phân số 2 ở dạng tối giản: ");
        PhanSo.hienthi(ps2);
        System.out.println("Phân số tổng: ");
        PhanSo.hienthi(PhanSo.add(ps1, ps2));
        System.out.println("Phân sô hiệu; ");
        PhanSo.hienthi(PhanSo.sub(ps1, ps2));
        System.out.println("Phân số tích");
        PhanSo.hienthi(PhanSo.mul(ps1, ps2));
        if (ps2.ts != 0) {
            System.out.println("Phân số thương: ");
            PhanSo.hienthi(PhanSo.div(ps1, ps2));
        } else System.out.println("Không thể thực hiện phép chia. Số bị chia bằng 0");
    }
}
