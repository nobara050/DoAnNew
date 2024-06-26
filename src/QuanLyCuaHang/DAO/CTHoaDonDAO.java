package QuanLyCuaHang.DAO;

import QuanLyCuaHang.DTO.CTHoaDonDTO;
import doanquanlycuahang.MyConnect;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CTHoaDonDAO {
	//hàm trả về một đối tượng CTHoaDonDTO duy nhất hoặc null nếu không tìm thấy
    public CTHoaDonDTO getCTHoaDonTheoMaHD(int maHD) {
        CTHoaDonDTO cthd = null;
        try {
            String sql = "SELECT * FROM cthoadon WHERE MaHD="+maHD;
            Statement stmt = MyConnect.conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                cthd = new CTHoaDonDTO();
                cthd.setMaHD(rs.getInt(1));
                cthd.setMaSP(rs.getInt(2));
                cthd.setSoLuong(rs.getInt(3));
                cthd.setDonGia(rs.getInt(4));
                cthd.setThanhTien(rs.getInt(5));
            }
        } catch(SQLException ex) {
            return null;
        }
        return cthd;
    }
    //Viết được trigger bỏ cái này
//	  public boolean deleteCTHoaDon(int maHD, int maSP) {
//	  boolean result = false;
//	  try {
//	      String sql = "DELETE FROM cthoadon WHERE MaHD="+maHD+" AND MaSP="+maSP;
//	      Statement stmt = MyConnect.conn.createStatement();
//	      result = stmt.executeUpdate(sql) > 0;
//	  } catch(SQLException ex) {
//	      return false;
//	  }
//	  return result;
//	}
	
	public boolean deleteCTHoaDon(int maHD) {
	  boolean result = false;
	  try {
	      String sql = "DELETE FROM cthoadon WHERE MaHD="+maHD;
	      Statement stmt = MyConnect.conn.createStatement();
	      result = stmt.executeUpdate(sql) > 0;
	  } catch(SQLException ex) {
	      return false;
	  }
	  return result;
	}

}


	//
//    public ArrayList<CTHoaDonDTO> getListCTHoaDon() {
//        ArrayList<CTHoaDonDTO> dscthd = new ArrayList<>();
//        try {
//            String sql = "SELECT * FROM cthoadon";
//            Statement stmt = MyConnect.conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()) {
//                CTHoaDonDTO cthd = new CTHoaDonDTO();
//                cthd.setMaHD(rs.getInt(1));
//                cthd.setMaSP(rs.getInt(2));
//                cthd.setSoLuong(rs.getInt(3));
//                cthd.setDonGia(rs.getInt(4));
//                cthd.setThanhTien(rs.getInt(5));
//                dscthd.add(cthd);
//            }
//        } catch(SQLException ex) {
//        }
//        return dscthd;
//    }

//    public ArrayList<CTHoaDonDTO> getListCTHoaDonTheoMaHD(int maHD) {
//        ArrayList<CTHoaDonDTO> dscthd = new ArrayList<>();
//        try {
//            String sql = "SELECT * FROM cthoadon WHERE MaHD="+maHD;
//            Statement stmt = MyConnect.conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()) {
//                CTHoaDonDTO cthd = new CTHoaDonDTO();
//                cthd.setMaHD(rs.getInt(1));
//                cthd.setMaSP(rs.getInt(2));
//                cthd.setSoLuong(rs.getInt(3));
//                cthd.setDonGia(rs.getInt(4));
//                cthd.setThanhTien(rs.getInt(5));
//                dscthd.add(cthd);
//            }
//        } catch(SQLException ex) {
//            return null;
//        }
//        return dscthd;
//    }
    
    

//    public boolean addCTHoaDon(CTHoaDonDTO cthd) {
//        boolean result = false;
//        try {
//        	//
//        	// 
//            String sql = "INSERT INTO cthoadon VALUES(?,?,?,?,?)";
//            PreparedStatement prep = MyConnect.conn.prepareStatement(sql);
//            prep.setInt(1, cthd.getMaHD());
//            prep.setInt(2, cthd.getMaSP());
//            prep.setInt(3, cthd.getSoLuong());
//            prep.setInt(4, cthd.getDonGia());
//            prep.setInt(5, cthd.getThanhTien());
//            result = prep.executeUpdate() > 0;
//        } catch(SQLException ex) {
//            ex.printStackTrace();
//            return false;
//        }
//        return result;
//    }
//

//
//    public boolean updateCTHoaDon(int maHD, int maSP, CTHoaDonDTO cthd) {
//        boolean result = false;
//        try {
//            String sql = "UPDATE cthoadon SET MaHD=?, MaSP=?, SoLuong=?, DonGia=? ThanhTien=? "
//                    + "WHERE MaHD=? AND MaSP=?";
//            PreparedStatement prep = MyConnect.conn.prepareStatement(sql);
//            prep.setInt(1, cthd.getMaHD());
//            prep.setInt(2, cthd.getMaSP());
//            prep.setInt(3, cthd.getSoLuong());
//            prep.setInt(4, cthd.getDonGia());
//            prep.setInt(5, cthd.getThanhTien());
//            prep.setInt(6, maHD);
//            prep.setInt(7, maSP);
//            result = prep.executeUpdate() > 0;
//        } catch(SQLException ex) {
//            return false;
//        }
//        return result;
//    }
//}
