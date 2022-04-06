package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.NhanVien_DAO;

public class TK_NhanVien_Test {

	private boolean testTimkiem(String kw) {
		NhanVien_DAO nvDAO= new NhanVien_DAO();
		int number = 0;
		if (kw.matches("^[0-9]+$")) {
			number=Integer.parseInt(kw);
		}
		if (nvDAO.TimKiemCM(number)!=null || !nvDAO.TimKiemDC2(kw).isEmpty() || nvDAO.TimKiemTen(kw)!=null || !nvDAO.TimKiemTen1(kw).isEmpty()){
			return true;
		}
		return false;
	}
	
	//Tìm kiếm đúng tên
	@Test
	public void testcase1() {
		String kw="Lê Thạc Đạt";
		boolean expRs=true;
		assertEquals(expRs, testTimkiem(kw));
	}
	
	//Tìm kiếm gần đúng
	@Test
	public void testcase2() {
		String kw="Lê";
		boolean expRs=true;
		assertEquals(expRs, testTimkiem(kw));
	}
	//Bỏ trống
	@Test
	public void testcase3() {
		String kw="";
		boolean expRs=true;
		assertEquals(expRs, testTimkiem(kw));
	}
	
	//Tìm kiếm đúng địa chỉ
		@Test
		public void testcase4() {
			String kw="Tp.Hồ Chí Minh";
			boolean expRs=true;
			assertEquals(expRs, testTimkiem(kw));
		}
		
		//Tìm kiếm gần đúng
		@Test
		public void testcase5() {
			String kw="Tp";
			boolean expRs=true;
			assertEquals(expRs, testTimkiem(kw));
		}
		//Bỏ trống
		@Test
		public void testcase6() {
			String kw="";
			boolean expRs=true;
			assertEquals(expRs, testTimkiem(kw));
		}

}
