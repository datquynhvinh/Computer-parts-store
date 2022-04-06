package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import BUS.CheckingMethod;
import dao.ChucVu_DAO;
import dao.KhachHang_DAO;

public class TimkiemKHTest {
	
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
	private boolean testTimkiem(String kw) {
		KhachHang_DAO khDAO= new KhachHang_DAO();
		int number = 0;
		if (kw.matches("^[0-9]+$")) {
			number=Integer.parseInt(kw);
		}
		if (khDAO.TimKiemCM(number)!=null || !khDAO.TimKiemDC2(kw).isEmpty() || khDAO.TimKiemTen(kw)!=null || !khDAO.TimKiemTen1(kw).isEmpty()){
			return true;
		}
		return false;
	}
	
	//Tìm kiếm đúng tên
	@Test
	public void testcase1() {
		String kw="Nguyễn Hoàng Huy";
		boolean expRs=true;
		assertEquals(expRs, testTimkiem(kw));
	}
	
	//Tìm kiếm gần đúng
	@Test
	public void testcase2() {
		String kw="Hoàng Huy";
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
			String kw="Quận 1, Tp.HCM";
			boolean expRs=true;
			assertEquals(expRs, testTimkiem(kw));
		}
		
		//Tìm kiếm gần đúng
		@Test
		public void testcase5() {
			String kw="Tp.HCM";
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