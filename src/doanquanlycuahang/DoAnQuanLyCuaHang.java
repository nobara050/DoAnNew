package doanquanlycuahang;
import QuanLyCuaHang.GUI.KhachHangGUI;
import java.sql.*;
public class DoAnQuanLyCuaHang {
   public static void main(String[] args) {
        new MyConnect();
        KhachHangGUI khgui = new KhachHangGUI();
        khgui.setVisible(true);
   }    
}


