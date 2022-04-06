package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import BUS.CheckingMethod;
import dao.NhaSanXuat_DAO;
import dao.NhaSanXuat_DAO;
import entity.NhaSanXuat;
import entity.NhaSanXuat;

public class NSXTest {
	
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
		String tenNSX="Dell";
		String diachi="TP.Hồ Chí Minh";
		NhaSanXuat NhaSanXuat=new NhaSanXuat();
		NhaSanXuat.setTenNhaSX(tenNSX);;
		NhaSanXuat.setDiaChi(diachi);
		boolean tenNSX_expRs=true;
		boolean diachi_expRs=true;
		boolean addNhaSanXuat_expRs=true;
		assertEquals(tenNSX_expRs, CheckingMethod.checkTen(tenNSX));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addNhaSanXuat_expRs, new NhaSanXuat_DAO().addNhaSanXuat(NhaSanXuat));
	}
	
	@Test
	public void testcase2() {
		String tenNSX="123";
		String diachi="TP.Hồ Chí Minh";
		NhaSanXuat NhaSanXuat=new NhaSanXuat();
		NhaSanXuat.setTenNhaSX(tenNSX);;
		NhaSanXuat.setDiaChi(diachi);
		boolean tenNSX_expRs=false;
		boolean diachi_expRs=true;
		boolean addNhaSanXuat_expRs=true;
		assertEquals(tenNSX_expRs, CheckingMethod.checkTen(tenNSX));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addNhaSanXuat_expRs, new NhaSanXuat_DAO().addNhaSanXuat(NhaSanXuat));
	}
	
	@Test
	public void testcase3() {
		String tenNSX="Dell";
		String diachi="123";
		NhaSanXuat NhaSanXuat=new NhaSanXuat();
		NhaSanXuat.setTenNhaSX(tenNSX);;
		NhaSanXuat.setDiaChi(diachi);
		boolean tenNSX_expRs=true;
		boolean diachi_expRs=false;
		boolean addNhaSanXuat_expRs=true;
		assertEquals(tenNSX_expRs, CheckingMethod.checkTen(tenNSX));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addNhaSanXuat_expRs, new NhaSanXuat_DAO().addNhaSanXuat(NhaSanXuat));
	}
	
	@Test
	public void testcase4() {
		String tenNSX="123";
		String diachi="123";
		NhaSanXuat NhaSanXuat=new NhaSanXuat();
		NhaSanXuat.setTenNhaSX(tenNSX);;
		NhaSanXuat.setDiaChi(diachi);
		boolean tenNSX_expRs=false;
		boolean diachi_expRs=false;
		boolean addNhaSanXuat_expRs=true;
		assertEquals(tenNSX_expRs, CheckingMethod.checkTen(tenNSX));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addNhaSanXuat_expRs, new NhaSanXuat_DAO().addNhaSanXuat(NhaSanXuat));
	}
	
	@Test
	public void testcase5() {
		String tenNSX="";
		String diachi="";
		NhaSanXuat NhaSanXuat=new NhaSanXuat();
		NhaSanXuat.setTenNhaSX(tenNSX);;
		NhaSanXuat.setDiaChi(diachi);
		boolean tenNSX_expRs=false;
		boolean diachi_expRs=false;
		boolean addNhaSanXuat_expRs=true;
		assertEquals(tenNSX_expRs, CheckingMethod.checkTen(tenNSX));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addNhaSanXuat_expRs, new NhaSanXuat_DAO().addNhaSanXuat(NhaSanXuat));
	}
	
	@Test
	public void testcase6() {
		String maNSX="NSX003";
		String tenNSX="";
		String diachi="";
		NhaSanXuat NhaSanXuat=new NhaSanXuat();
		NhaSanXuat.setTenNhaSX(tenNSX);;
		NhaSanXuat.setDiaChi(diachi);
		boolean tenNSX_expRs=false;
		boolean diachi_expRs=false;
		boolean updateNhaSanXuat_expRs=true;
		assertEquals(tenNSX_expRs, CheckingMethod.checkTen(tenNSX));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateNhaSanXuat_expRs, new NhaSanXuat_DAO().updateNhaSX(maNSX, NhaSanXuat));
	}
	
	@Test
	public void testcase7() {
		String maNSX="NSX003";
		String tenNSX="Dell";
		String diachi="Hà Nội";
		NhaSanXuat NhaSanXuat=new NhaSanXuat();
		NhaSanXuat.setTenNhaSX(tenNSX);;
		NhaSanXuat.setDiaChi(diachi);
		boolean tenNSX_expRs=true;
		boolean diachi_expRs=true;
		boolean updateNhaSanXuat_expRs=true;
		assertEquals(tenNSX_expRs, CheckingMethod.checkTen(tenNSX));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateNhaSanXuat_expRs, new NhaSanXuat_DAO().updateNhaSX(maNSX, NhaSanXuat));
	}
	
	@Test
	public void testcase8() {
		String maNSX="NSX003";
		String tenNSX="Dell";
		String diachi="123";
		NhaSanXuat NhaSanXuat=new NhaSanXuat();
		NhaSanXuat.setTenNhaSX(tenNSX);;
		NhaSanXuat.setDiaChi(diachi);
		boolean tenNSX_expRs=true;
		boolean diachi_expRs=false;
		boolean updateNhaSanXuat_expRs=true;
		assertEquals(tenNSX_expRs, CheckingMethod.checkTen(tenNSX));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateNhaSanXuat_expRs, new NhaSanXuat_DAO().updateNhaSX(maNSX, NhaSanXuat));
	}
	
	@Test
	public void testcase9() {
		String maNSX="NSX003";
		String tenNSX="Asus";
		String diachi="TP.Hồ Chí Minh";
		NhaSanXuat NhaSanXuat=new NhaSanXuat();
		NhaSanXuat.setTenNhaSX(tenNSX);;
		NhaSanXuat.setDiaChi(diachi);
		boolean tenNSX_expRs=true;
		boolean diachi_expRs=true;
		boolean updateNhaSanXuat_expRs=true;
		assertEquals(tenNSX_expRs, CheckingMethod.checkTen(tenNSX));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateNhaSanXuat_expRs, new NhaSanXuat_DAO().updateNhaSX(maNSX, NhaSanXuat));
	}
	
	@Test
	public void testcase10() {
		String maNSX="NSX003";
		String tenNSX="123";
		String diachi="TP.Hồ Chí Minh";
		NhaSanXuat NhaSanXuat=new NhaSanXuat();
		NhaSanXuat.setTenNhaSX(tenNSX);;
		NhaSanXuat.setDiaChi(diachi);
		boolean tenNSX_expRs=true;
		boolean diachi_expRs=true;
		boolean updateNhaSanXuat_expRs=true;
		assertEquals(tenNSX_expRs, CheckingMethod.checkTen(tenNSX));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateNhaSanXuat_expRs, new NhaSanXuat_DAO().updateNhaSX(maNSX, NhaSanXuat));
	}
	
	@Test
	public void testcase11() {
		String maNSX="NSX001";
		boolean deleteNhaSanXuat_expRs=true;
		assertEquals(deleteNhaSanXuat_expRs, new NhaSanXuat_DAO().deleteNSX(maNSX));
	}
}