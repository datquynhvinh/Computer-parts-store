package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import BUS.CheckingMethod;
import dao.LoaiLinhKien_DAO;
import dao.NhaSanXuat_DAO;
import entity.LoaiLinhKien;
import entity.NhaSanXuat;

public class LoaiLKTest {
	
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
	
	///////////////THÊM
	@Test
	public void testcase1() {
		String tenLLK="Ổ cứng";
		LoaiLinhKien LoaiLinhKien=new LoaiLinhKien();
		LoaiLinhKien.setTenLoai(tenLLK);
		boolean tenLLK_expRs=true;
		boolean addLoaiLinhKien_expRs=true;
		assertEquals(tenLLK_expRs, CheckingMethod.checkTenLK(tenLLK));
		assertEquals(addLoaiLinhKien_expRs, new LoaiLinhKien_DAO().addLoaiLinhKien(LoaiLinhKien));
	}
	
	//Nhập sai định dạng
	@Test
	public void testcase2() {
		String tenLLK="123";
		LoaiLinhKien LoaiLinhKien=new LoaiLinhKien();
		LoaiLinhKien.setTenLoai(tenLLK);
		boolean tenLLK_expRs=true;
		boolean addLoaiLinhKien_expRs=false; // 
		assertEquals(tenLLK_expRs, CheckingMethod.checkTenLK(tenLLK)); 
		assertEquals(addLoaiLinhKien_expRs, new LoaiLinhKien_DAO().addLoaiLinhKien(LoaiLinhKien));
	}
	
	//Bỏ trống
	@Test
	public void testcase3() {
		String tenLLK="";
		LoaiLinhKien LoaiLinhKien=new LoaiLinhKien();
		LoaiLinhKien.setTenLoai(tenLLK);
		boolean tenLLK_expRs=true;
		boolean addLoaiLinhKien_expRs=false;
		assertEquals(tenLLK_expRs, CheckingMethod.checkTenLK(tenLLK));
		assertEquals(addLoaiLinhKien_expRs, new LoaiLinhKien_DAO().addLoaiLinhKien(LoaiLinhKien));
	}
	
	//////////////////////////SỬA
	@Test
	public void testcase4() {
		String maLLK="LLK012";
		String tenLLK="Màn71 hình";
		LoaiLinhKien LoaiLinhKien=new LoaiLinhKien();
		LoaiLinhKien.setTenLoai(tenLLK);
		boolean tenLLK_expRs=true;
		boolean updateLoaiLK_expRs=true;
		assertEquals(tenLLK_expRs, CheckingMethod.checkTenLK(tenLLK));
		assertEquals(updateLoaiLK_expRs, new LoaiLinhKien_DAO().updateLoaiLK(maLLK, LoaiLinhKien));
	}
	
	//Nhập sai định dạng
	@Test
	public void testcase5() {
		String maLLK="LLK012";
		String tenLLK="123";
		LoaiLinhKien LoaiLinhKien=new LoaiLinhKien();
		LoaiLinhKien.setTenLoai(tenLLK);
		boolean tenLLK_expRs=true;
		boolean updateLoaiLK_expRs=false;
		assertEquals(tenLLK_expRs, CheckingMethod.checkTenLK(tenLLK));
		assertEquals(updateLoaiLK_expRs, new LoaiLinhKien_DAO().updateLoaiLK(maLLK, LoaiLinhKien));
	}
	
	//Bỏ trống
	@Test
	public void testcase6() {
		String maLLK="LLK012";
		String tenLLK="";
		LoaiLinhKien LoaiLinhKien=new LoaiLinhKien();
		LoaiLinhKien.setTenLoai(tenLLK);
		boolean tenLLK_expRs=true;
		boolean updateLoaiLK_expRs=false;
		assertEquals(tenLLK_expRs, CheckingMethod.checkTenLK(tenLLK));
		assertEquals(updateLoaiLK_expRs, new LoaiLinhKien_DAO().updateLoaiLK(maLLK, LoaiLinhKien));
	}
	
	///////////////////////////XOÁ
	@Test
	public void testcase7() {
		String maLLK="LLK016";
		boolean deleteLoaiLinhKien_expRs=true;
		assertEquals(deleteLoaiLinhKien_expRs, new LoaiLinhKien_DAO().deleteLLK(maLLK));
	}
}