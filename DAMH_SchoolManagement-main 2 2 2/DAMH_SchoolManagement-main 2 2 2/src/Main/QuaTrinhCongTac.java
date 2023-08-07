package Main;

abstract public class QuaTrinhCongTac {
    protected int MaCB;
    protected int MaQTLuong;
    protected String MaCV;
    protected int ThoiGianBatDau;
    protected int ThoiGianKetThuc;
    
    
    public QuaTrinhCongTac(int MaCB ,int MaQTLuong, String MaCV, int tgBatDau, int tgKetThuc){
        this.MaCB = MaCB;
        this.MaQTLuong = MaQTLuong;
        this.MaCV = MaCV;
        this.ThoiGianBatDau = tgBatDau;
        this.ThoiGianKetThuc = tgKetThuc;
    }
    
    public QuaTrinhCongTac(){}

    public int getMaCB() {
        return MaCB;
    }

    public int getMaQTLuong() {
        return MaQTLuong;
    }
    
    public String getMaCV(){
        return MaCV;
    }

    public int getThoiGianBatDau() {
        return ThoiGianBatDau;
    }

    public int getThoiGianKetThuc() {
        return ThoiGianKetThuc;
    }

    public void setMaCB(int MaCB) {
        this.MaCB = MaCB;
    }

    public void setMaQTLuong(int MaQTLuong) {
        this.MaQTLuong = MaQTLuong;
    }
    
    public void setMaCV(String MaCV){
        this.MaCV = MaCV;
    }


    public void setThoiGianBatDau(int tgBatDau) {
        this.ThoiGianBatDau = tgBatDau;
    }

    public void setThoiGianKetThuc(int tgKetThuc) {
        this.ThoiGianKetThuc = tgKetThuc;
    }
    
    
    
}
