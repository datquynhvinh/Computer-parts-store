package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import BUS.CheckingMethod;
import dao.ChucVu_DAO;
import dao.NhaSanXuat_DAO;
import entity.ChucVu;
import entity.NhaSanXuat;

public class ChucVuTest {
	
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
	
	//Nhập tên đúng
	@Test
	public void testcase1() {
		String tenChucvu="Nhân Viên Thu Ngân";
		ChucVu chucvu=new ChucVu();
		chucvu.setTenChucVu(tenChucvu);
		boolean tenChucvu_expRs=true;
		boolean addChucvu_expRs=true;
		assertEquals(tenChucvu_expRs, CheckingMethod.checkTen(tenChucvu));
		assertEquals(addChucvu_expRs, new ChucVu_DAO().addChucVu(chucvu));
	}
	
	//Nhập sai định dạng
	@Test
	public void testcase2() {
		String tenChucvu="123";
		ChucVu chucvu=new ChucVu();
		chucvu.setTenChucVu(tenChucvu);
		boolean tenChucvu_expRs=true;
		boolean addChucvu_expRs=false;
		assertEquals(tenChucvu_expRs, CheckingMethod.checkTen(tenChucvu));
		assertEquals(addChucvu_expRs, new ChucVu_DAO().addChucVu(chucvu));
	}
	
	//Bỏ trống
	@Test
	public void testcase3() { 
		String tenChucvu="";
		ChucVu chucvu=new ChucVu();
		chucvu.setTenChucVu(tenChucvu);
		boolean tenChucvu_expRs=false;
		boolean addChucvu_expRs=false;
		assertEquals(tenChucvu_expRs, CheckingMethod.checkTen(tenChucvu));
		assertEquals(addChucvu_expRs, new ChucVu_DAO().addChucVu(chucvu));
	}
	
	//Nhập đúng
	@Test
	public void testcase4() {
		String maChucvu="CV012";
		String tenChucvu="Nhân Viên Bán Hàng";
		ChucVu chucvu=new ChucVu();
		chucvu.setTenChucVu(tenChucvu);
		boolean tenChucvu_expRs=true; 
		boolean updateChucvu_expRs=true;
		assertEquals(tenChucvu_expRs, CheckingMethod.checkTen(tenChucvu));
		assertEquals(updateChucvu_expRs, new ChucVu_DAO().updateChucVu(maChucvu, chucvu));
	}
	
	//Nhập sai định dạng
	@Test
	public void testcase5() {
		String maChucvu="CV012";
		String tenChucvu="123";
		ChucVu chucvu=new ChucVu();
		chucvu.setTenChucVu(tenChucvu);
		boolean tenChucvu_expRs=false;
		boolean updateChucvu_expRs=false;
		assertEquals(tenChucvu_expRs, CheckingMethod.checkTen(tenChucvu));
		assertEquals(updateChucvu_expRs, new ChucVu_DAO().updateChucVu(maChucvu, chucvu));
	}
	
	//Bỏ trống
	@Test
	public void testcase6() {
		String maChucvu="CV012";
		String tenChucvu="";
		ChucVu chucvu=new ChucVu();
		chucvu.setTenChucVu(tenChucvu);
		boolean tenChucvu_expRs=false;
		boolean updateChucvu_expRs=false;
		assertEquals(tenChucvu_expRs, CheckingMethod.checkTen(tenChucvu));
		assertEquals(updateChucvu_expRs, new ChucVu_DAO().updateChucVu(maChucvu, chucvu));
	}
	
	//Xóa
	@Test
	public void testcase7() {
		String maChucvu="CV008";
		boolean deleteChucvu_expRs=true;
		assertEquals(deleteChucvu_expRs, new ChucVu_DAO().deleteCV(maChucvu));
	}
}