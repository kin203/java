public class HoaDon {
    private int maHD;
    private String moTa;
    private int soLuong;
    private double donGia;
    public HoaDon() {

    }
    public HoaDon(int maHD, String moTa, int soLuong, double donGia) {
    super();
    this.maHD=maHD;
    this.moTa=moTa;
    this.soLuong=soLuong;
    this.donGia=donGia;
    }

    public int getMaHD() {
        return maHD;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHD=" + maHD +
                ", moTa='" + moTa + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
    public double tongTien(){return this.donGia*soLuong;};
}


