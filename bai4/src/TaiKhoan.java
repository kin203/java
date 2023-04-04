public class TaiKhoan extends KhachHang{
    private int soTaiKhoan;
    private int soTien;

    public TaiKhoan() {

    }
    public TaiKhoan(int soTaiKhoan,int soTien) {
    this.soTaiKhoan=soTaiKhoan;
    this.soTien=soTien;
    }

    public int getSoTaiKhoan() {
        return soTaiKhoan;
    }

//    public void setSoTaiKhoan(int soTaiKhoan) {
//        this.soTaiKhoan = soTaiKhoan;
//    }

    public int getSoTien() {
        return soTien;
    }

//    public void setSoTien(int soTien) {
//        this.soTien = soTien;
//    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "soTaiKhoan=" + soTaiKhoan +
                ", soTien=" + soTien +
                '}';
    }
}
