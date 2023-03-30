public class KhachHang {
    private int maKH;
    private String tenKH;
    private String diaChi;

    public KhachHang() {

    }
    public KhachHang(int maKH,String tenKH,String diaChi){
        this.maKH=maKH;
        this.tenKH=tenKH;
        this.diaChi=diaChi;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKH=" + maKH +
                ", tenKH='" + tenKH + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}

