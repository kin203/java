public class KhachHang {
    private String maKH;
    private String tenKH;
    private String diaChi;
    public static int KH_NUMBER=0;

    public KhachHang() {
    KH_NUMBER++;
    this.maKH="KH"+KH_NUMBER;
    }
    public KhachHang(String tenKH,String diaChi){
        KH_NUMBER++;
        this.maKH="KH"+KH_NUMBER;
        this.tenKH=tenKH;
        this.diaChi=diaChi;
    }

    //get/set

    public String getMaKH() {
        return maKH;
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

