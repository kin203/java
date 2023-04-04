import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TaiKhoan tk = new TaiKhoan(01257, 100);
        KhachHang kh = new KhachHang();
        System.out.print("Nhap ten khach hang");
        kh.setTenKH(sc.nextLine());
        System.out.print("Nhap dia chi khach hang");
        kh.setDiaChi(sc.nextLine());
        System.out.print("so tai khoan :"+tk.getSoTaiKhoan());
        System.out.print("so tien :"+tk.getSoTien());
        System.out.print("ma kh"+kh.getMaKH());
    }
}