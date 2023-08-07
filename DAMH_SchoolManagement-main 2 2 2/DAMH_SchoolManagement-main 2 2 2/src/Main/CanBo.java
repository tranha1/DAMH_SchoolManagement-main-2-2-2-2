package Main;

abstract public class CanBo {
    protected int MaCB;
    protected String HoTen;
    protected String SoDT;
    protected String DiaChi;
    protected String NamSinh;
    protected String ChucVu;
    protected String SoTaiKhoan;
    protected int Bac;

    public CanBo(int MaCB, String HoTen, String SoDT, String DiaChi, String NamSinh, String ChucVu, String SoTaiKhoan, int Bac) {
        this.MaCB = MaCB;
        this.HoTen = HoTen;
        this.SoDT = SoDT;
        this.DiaChi = DiaChi;
        this.NamSinh = NamSinh;
        this.ChucVu = ChucVu;
        this.SoTaiKhoan = SoTaiKhoan;
        this.Bac = Bac;
    }


    
    public CanBo (){
    }

    public int getMaCB() {
        return MaCB;
    }

    public void setMaCB(int MaCB) {
        this.MaCB = MaCB;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSoDT() {
        return SoDT;
    }
    
    public int getBac(){
        return Bac;
    }
    
    public void setBac(int Bac){
        this.Bac = Bac;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    
    
}
