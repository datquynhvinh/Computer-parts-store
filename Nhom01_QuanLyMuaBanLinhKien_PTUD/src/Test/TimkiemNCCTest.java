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
import dao.NhaCungCap_DAO;

public class TimkiemNCCTest {
	
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
		NhaCungCap_DAO nccDAO= new NhaCungCap_DAO();
		if (!nccDAO.TimKiemDC2(kw).isEmpty() || !nccDAO.TimKiemTen1(kw).isEmpty() || !nccDAO.TimKiemSDT1(kw).isEmpty()){
			return true;
		}
		return false;
	}
	
	//Tìm kiếm đúng tên
	@Test
	public void testcase1() {
		String kw="Phong Vũ";
		boolean expRs=true;
		assertEquals(expRs, testTimkiem(kw));
	}
	
	//Tìm kiếm gần đúng
	@Test
	public void testcase2() {
		String kw="Phong";
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
		String kw="Quận 7, TpHcm";
		boolean expRs=true;
		assertEquals(expRs, testTimkiem(kw));
	}
	
	//Tìm kiếm gần đúng
	@Test
	public void testcase5() {
		String kw="TpHcm";
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

	
	//Tìm kiếm đúng số điện thoại
	@Test
	public void testcase7() {
		String kw="0123456789";
		boolean expRs=true;
		assertEquals(expRs, testTimkiem(kw));
	}
	
	//Tìm kiếm gần đúng
	@Test
	public void testcase8() {
		String kw="0123";
		boolean expRs=true;
		assertEquals(expRs, testTimkiem(kw));
	}
	//Bỏ trống
	@Test
	public void testcase9() {
		String kw="";
		boolean expRs=true;
		assertEquals(expRs, testTimkiem(kw));
	}
	
}