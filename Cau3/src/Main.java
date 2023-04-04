import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TaiKhoan tk=new TaiKhoan();
        int  b = 0;
        boolean flag = true;
        System.out.println("Nhap so tai khoan: ");
        tk.setSotk(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten tai khoan: ");
        tk.setTentk(sc.nextLine());
        System.out.print("Nhap so tien dang co trong tai khoan: ");
        tk.setSotien(sc.nextDouble());
        do {
            System.out.print("Chon chuc nang ban can :\n");
            System.out.println("===================================\n"+
                    "1.Nap tien\n"
                    + "2.Rut tien\n" + "3.Chuyen Khoan\n" + "So khac de thoat"+"\n===================================");
            b = sc.nextInt();
            switch (b) {
                case 1:
                    tk.napTien();
                    break;
                case 2:
                    tk.rutTien();
                    break;
                case 3:
                    tk.chuyenKhoan();
                    break;
                default:
                    System.out.println("Bye!!");
                    flag = false;
                    break;
            }
        }while(flag);
    }
}