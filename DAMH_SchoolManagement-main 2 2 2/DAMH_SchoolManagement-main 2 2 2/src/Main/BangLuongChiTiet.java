package Main;
abstract public class BangLuongChiTiet {
    protected int MaBangLuong;
    protected int MaCB;
    protected int Thang;
    protected int Nam;
    protected double LuongCung;
    protected double PhuCapThamNien;
    protected double PhuCapChucVu;
    protected double TongLuong;
    protected double LuongCoSo;

    public double getLuongCoSo() {
        return LuongCoSo;
    }
    
    public void setLuongCoSo(double LuongCoSo){
        this.LuongCoSo = LuongCoSo;
    }



    public BangLuongChiTiet(){}


    public BangLuongChiTiet(int MaBangLuong,int MaCB,int Thang, int Nam,int LuongCoSo, int LuongCung,double PhuCapThamNien,double PhuCapChucVu,double TongLuong){
        this.MaBangLuong = MaBangLuong;
        this.MaCB = MaCB;
        this.Thang = Thang;
        this.Nam = Nam;
        this.LuongCoSo = LuongCoSo;
        this.LuongCung = LuongCung;
        this.PhuCapChucVu = PhuCapChucVu;
        this.PhuCapThamNien = PhuCapThamNien;
        this.TongLuong = TongLuong;
    }

    public int getMaBangLuong() {
        return MaBangLuong;
    }

    public int getMaCB() {
        return MaCB;
    }

    public int getThang() {
        return Thang;
    }

    public int getNam() {
        return Nam;
    }

    public double getLuongCung() {
        return LuongCung;
    }

    public double getPhuCapThamNien() {
        return PhuCapThamNien;
    }

    public double getPhuCapChucVu() {
        return PhuCapChucVu;
    }

    public double getTongLuong() {
        return TongLuong;
    }

    public void setMaBangLuong(int MaBangLuong) {
        this.MaBangLuong = MaBangLuong;
    }

    public void setMaCB(int MaCB) {
        this.MaCB = MaCB;
    }

    public void setThang(int Thang) {
        this.Thang = Thang;
    }

    public void setNam(int Nam) {
        this.Nam = Nam;
    }

    public void setLuongCung(double LuongCung) {
        this.LuongCung = LuongCung;
    }

    public void setPhuCapThamNien(double PhuCapThamNien) {
        this.PhuCapThamNien = PhuCapThamNien;
    }

    public void setPhuCapChucVu(double PhuCapChucVu) {
        this.PhuCapChucVu = PhuCapChucVu;
    }

    public void setTongLuong(double TongLuong) {
        this.TongLuong = TongLuong;
    }

   
        
}


