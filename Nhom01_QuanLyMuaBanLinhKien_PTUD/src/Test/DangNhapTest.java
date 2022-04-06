package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import BUS.CheckingMethod;
import dao.ChucVu_DAO;
import dao.TaiKhoan_DAO;
import entity.TaiKhoan;

public class DangNhapTest {
	
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
	private boolean checkDN(String username,String pw,String chucvu) {
		TaiKhoan tk=null;
		tk=new TaiKhoan_DAO().TimKiemTen(username);
		if (tk!=null) {
			if (tk.getMatKhau().trim().equals(pw)) {
				if (tk.getQuyen().trim().equalsIgnoreCase(chucvu)) {
					return true;
				}
			}
		}
		return false;
	}
	@Test
	public void testcase1() {
		String username="hoanghuy";
		String pw="12345";
		String chucvu="Khach Hang";
		boolean username_expRs=true;
		boolean pw_expRs=true;
		boolean dangnhap_expRs=true;
		assertEquals(username_expRs, CheckingMethod.checkTaikhoan(username));
		assertEquals(pw_expRs, CheckingMethod.checkMatkhau(pw));
		assertEquals(dangnhap_expRs, checkDN(username, pw, chucvu));
	}
	
	@Test
	public void testcase2() {
		String username="hoanghuy";
		String pw="abc";
		String chucvu="Khach Hang";
		boolean username_expRs=true;
		boolean pw_expRs=false;
		boolean dangnhap_expRs=true;
		assertEquals(username_expRs, CheckingMethod.checkTaikhoan(username));
		assertEquals(pw_expRs, CheckingMethod.checkMatkhau(pw));
		assertEquals(dangnhap_expRs, checkDN(username, pw, chucvu));
	}
	
	@Test
	public void testcase3() {
		String username="huyhoang";
		String pw="12345";
		String chucvu="Khach Hang";
		boolean username_expRs=false;
		boolean pw_expRs=true;
		boolean dangnhap_expRs=true;
		assertEquals(username_expRs, CheckingMethod.checkTaikhoan(username));
		assertEquals(pw_expRs, CheckingMethod.checkMatkhau(pw));
		assertEquals(dangnhap_expRs, checkDN(username, pw, chucvu));
	}
	
	@Test
	public void testcase4() {
		String username="huyhoang";
		String pw="abc";
		String chucvu="Khach Hang";
		boolean username_expRs=false;
		boolean pw_expRs=false;
		boolean dangnhap_expRs=true;
		assertEquals(username_expRs, CheckingMethod.checkTaikhoan(username));
		assertEquals(pw_expRs, CheckingMethod.checkMatkhau(pw));
		assertEquals(dangnhap_expRs, checkDN(username, pw, chucvu));
	}
	
	@Test
	public void testcase5() {
		String username="";
		String pw="";
		String chucvu="Khach Hang";
		boolean username_expRs=false;
		boolean pw_expRs=false;
		boolean dangnhap_expRs=true;
		assertEquals(username_expRs, CheckingMethod.checkTaikhoan(username));
		assertEquals(pw_expRs, CheckingMethod.checkMatkhau(pw));
		assertEquals(dangnhap_expRs, checkDN(username, pw, chucvu));
	}
}