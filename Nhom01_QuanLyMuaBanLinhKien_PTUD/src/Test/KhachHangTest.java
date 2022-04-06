package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import BUS.CheckingMethod;
import dao.KhachHang_DAO;
import entity.KhachHang;

public class KhachHangTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	//Thêm đúng
	@Test
	public void testcase1() {
		String tenKH="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String gioitinh="Nam";
		String SDT="0382665407";
		String CMND="024469366";
		String diachi="TP.Hồ Chí Minh";
		KhachHang kh=new KhachHang();
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		kh.setGioiTinh(gioitinh);
		boolean tenKH_expRs=true; 
		boolean diachi_expRs=true;
		boolean email_expRs=true;
		boolean SDT_expRs=true;
		boolean CMND_expRs=true;
		boolean addKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addKhachHang_expRs, new KhachHang_DAO().addKhachHang(kh));
	}
	
	//Sai định dạng
	@Test // Tên sai định dạng
	public void testcase2() {
		String tenKH="123";
		String email="abc@gmail.com";
		String gioitinh="Nam";
		String SDT="0382665407";
		String CMND="023469366";
		String diachi="TP.Hồ Chí Minh";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=false;
		boolean diachi_expRs=true;
		boolean email_expRs=true;
		boolean SDT_expRs=true;
		boolean CMND_expRs=true;
		boolean addKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addKhachHang_expRs, new KhachHang_DAO().addKhachHang(kh));
	}
	
	@Test
	public void testcase3() {
		String tenKH="Mai Phước Thịnh";
		String email="abc";
		String gioitinh="Nam";
		String SDT="0382665407";
		String CMND="023469366";
		String diachi="TP.Hồ Chí Minh";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=true;
		boolean email_expRs=false;
		boolean SDT_expRs=true;
		boolean CMND_expRs=true;
		boolean addKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addKhachHang_expRs, new KhachHang_DAO().addKhachHang(kh));
	}
	
	
	@Test
	public void testcase4() {
		String tenKH="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String gioitinh="Nam";
		String SDT="abc";
		String CMND="023469366";
		String diachi="TP.Hồ Chí Minh";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=true;
		boolean email_expRs=true;
		boolean SDT_expRs=false;
		boolean CMND_expRs=true;
		boolean addKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addKhachHang_expRs, new KhachHang_DAO().addKhachHang(kh));
	}
	
	@Test
	public void testcase5() {
		String tenKH="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String gioitinh="Nam";
		String SDT="0382665407";
		String CMND="abc";
		String diachi="TP.Hồ Chí Minh";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=true;
		boolean email_expRs=true;
		boolean SDT_expRs=true;
		boolean CMND_expRs=false;
		boolean addKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addKhachHang_expRs, new KhachHang_DAO().addKhachHang(kh));
	}
	
	@Test
	public void testcase6() {
		String tenKH="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SDT="0382665407";
		String CMND="023469366";
		String diachi="123";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=false;
		boolean email_expRs=true;
		boolean SDT_expRs=true;
		boolean CMND_expRs=true;
		boolean addKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addKhachHang_expRs, new KhachHang_DAO().addKhachHang(kh));
	}
	
	//Bỏ trống
	@Test
	public void testcase7() {
		String tenKH="";
		String email="abc@gmail.com";
		String SDT="0382665407";
		String CMND="023469366";
		String diachi="TP.Hồ Chí Minh";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=false;
		boolean diachi_expRs=true;
		boolean email_expRs=true;
		boolean SDT_expRs=true;
		boolean CMND_expRs=true;
		boolean addKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addKhachHang_expRs, new KhachHang_DAO().addKhachHang(kh));
	}
	
	@Test
	public void testcase8() {
		String tenKH="Mai Phước Thịnh";
		String email="";
		String SDT="0382665407";
		String CMND="023469366";
		String diachi="TP.Hồ Chí Minh";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=true;
		boolean email_expRs=false;
		boolean SDT_expRs=true;
		boolean CMND_expRs=true;
		boolean addKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addKhachHang_expRs, new KhachHang_DAO().addKhachHang(kh));
	}
	
	
	@Test
	public void testcase9() {
		String tenKH="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SDT="";
		String CMND="023469366";
		String diachi="TP.Hồ Chí Minh";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=true;
		boolean email_expRs=true;
		boolean SDT_expRs=false;
		boolean CMND_expRs=true;
		boolean addKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addKhachHang_expRs, new KhachHang_DAO().addKhachHang(kh));
	}
	
	@Test
	public void testcase10() {
		String tenKH="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SDT="0382665407";
		String CMND="";
		String diachi="TP.Hồ Chí Minh";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=true;
		boolean email_expRs=true;
		boolean SDT_expRs=true;
		boolean CMND_expRs=false;
		boolean addKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addKhachHang_expRs, new KhachHang_DAO().addKhachHang(kh));
	}
	
	@Test
	public void testcase11() {
		String tenKH="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SDT="0382665407";
		String CMND="023469366";
		String diachi="";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=false;
		boolean email_expRs=true;
		boolean SDT_expRs=true;
		boolean CMND_expRs=true;
		boolean addKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addKhachHang_expRs, new KhachHang_DAO().addKhachHang(kh));
	}
		
		
		
	//Sửa đúng
	@Test
	public void testcase12() {
		String maKH="KH001";
		String tenKH="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SDT="0382665407";
		String CMND="023469366";
		String diachi="TP.Hồ Chí Minh";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=true;
		boolean email_expRs=true;
		boolean SDT_expRs=true;
		boolean CMND_expRs=true;
		boolean updateKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateKhachHang_expRs, new KhachHang_DAO().updateKhachHang(maKH, kh));
	}
	
	//Sai định dạng
	@Test
	public void testcase13() {
		String maKH="KH001";
		String tenKH="123";
		String email="abc@gmail.com";
		String SDT="0382665407";
		String CMND="023469366";
		String diachi="TP.Hồ Chí Minh";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=false;
		boolean diachi_expRs=true;
		boolean email_expRs=true;
		boolean SDT_expRs=true;
		boolean CMND_expRs=true;
		boolean updateKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateKhachHang_expRs, new KhachHang_DAO().updateKhachHang(maKH, kh));
	}
	
	@Test
	public void testcase14() {
		String maKH="KH001";
		String tenKH="Mai Phước Thịnh";
		String email="abc";
		String SDT="0382665407";
		String CMND="023469366";
		String diachi="TP.Hồ Chí Minh";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=true;
		boolean email_expRs=false;
		boolean SDT_expRs=true;
		boolean CMND_expRs=true;
		boolean updateKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateKhachHang_expRs, new KhachHang_DAO().updateKhachHang(maKH, kh));
	}
	
	
	@Test
	public void testcase15() {
		String maKH="KH001";
		String tenKH="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SDT="abc";
		String CMND="023469366";
		String diachi="TP.Hồ Chí Minh";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=true;
		boolean email_expRs=true;
		boolean SDT_expRs=false;
		boolean CMND_expRs=true;
		boolean updateKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateKhachHang_expRs, new KhachHang_DAO().updateKhachHang(maKH, kh));
	}
	
	@Test
	public void testcase16() {
		String maKH="KH001";
		String tenKH="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SDT="0382665407";
		String CMND="abc";
		String diachi="TP.Hồ Chí Minh";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=true;
		boolean email_expRs=true;
		boolean SDT_expRs=true;
		boolean CMND_expRs=false;
		boolean updateKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateKhachHang_expRs, new KhachHang_DAO().updateKhachHang(maKH, kh));
	}
	
	@Test
	public void testcase17() {
		String maKH="KH001";
		String tenKH="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SDT="0382665407";
		String CMND="023469366";
		String diachi="123";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=false;
		boolean email_expRs=true;
		boolean SDT_expRs=true;
		boolean CMND_expRs=true;
		boolean updateKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateKhachHang_expRs, new KhachHang_DAO().updateKhachHang(maKH, kh));
	}
	
	//Bỏ trống
	@Test
	public void testcase18() {
		String maKH="KH001";
		String tenKH="";
		String email="abc@gmail.com";
		String SDT="0382665407";
		String CMND="023469366";
		String diachi="TP.Hồ Chí Minh";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=false;
		boolean diachi_expRs=true;
		boolean email_expRs=true;
		boolean SDT_expRs=true;
		boolean CMND_expRs=true;
		boolean updateKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateKhachHang_expRs, new KhachHang_DAO().updateKhachHang(maKH, kh));
	}
	
	@Test
	public void testcase19() {
		String maKH="KH001";
		String tenKH="Mai Phước Thịnh";
		String email="";
		String SDT="0382665407";
		String CMND="023469366";
		String diachi="TP.Hồ Chí Minh";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=true;
		boolean email_expRs=false;
		boolean SDT_expRs=true;
		boolean CMND_expRs=true;
		boolean updateKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateKhachHang_expRs, new KhachHang_DAO().updateKhachHang(maKH, kh));
	}
	
	
	@Test
	public void testcase20() {
		String maKH="KH001";
		String tenKH="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SDT="";
		String CMND="023469366";
		String diachi="TP.Hồ Chí Minh";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=true;
		boolean email_expRs=true;
		boolean SDT_expRs=false;
		boolean CMND_expRs=true;
		boolean updateKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateKhachHang_expRs, new KhachHang_DAO().updateKhachHang(maKH, kh));
	}
	
	@Test
	public void testcase21() {
		String maKH="KH001";
		String tenKH="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SDT="0382665407";
		String CMND="";
		String diachi="TP.Hồ Chí Minh";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=true;
		boolean email_expRs=true;
		boolean SDT_expRs=true;
		boolean CMND_expRs=false;
		boolean updateKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateKhachHang_expRs, new KhachHang_DAO().updateKhachHang(maKH, kh));
	}
	
	@Test
	public void testcase22() {
		String maKH="KH001";
		String tenKH="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SDT="0382665407";
		String CMND="023469366";
		String diachi="";
		String gioitinh="Nam";
		KhachHang kh=new KhachHang();
		kh.setGioiTinh(gioitinh);
		kh.setTenKH(tenKH);
		kh.setEmail(email);
		kh.setCMND(Integer.parseInt(CMND));
		kh.setDiaChi(diachi);
		boolean tenKH_expRs=true;
		boolean diachi_expRs=false;
		boolean email_expRs=true;
		boolean SDT_expRs=true;
		boolean CMND_expRs=true;
		boolean updateKhachHang_expRs=true;
		assertEquals(tenKH_expRs, CheckingMethod.checkTen(tenKH));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
		assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateKhachHang_expRs, new KhachHang_DAO().updateKhachHang(maKH, kh));
	}
	
	//Xóa
	@Test
	public void testcase23() {
		String maKH="KH045";
		boolean deleteKhachHang_expRs=true;
		assertEquals(deleteKhachHang_expRs, new KhachHang_DAO().deleteKH(maKH));
	}
}

