package Main;

import Login.DangNhapJDialog;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        //new CanBoJFrame().setVisible(true);
        DangNhapJDialog dialog = new DangNhapJDialog(null, true);
        dialog.setTitle("Đăng Nhập Hệ Thống");
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
}
