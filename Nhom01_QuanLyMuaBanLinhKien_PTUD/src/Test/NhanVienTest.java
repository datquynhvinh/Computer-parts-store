package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import BUS.CheckingMethod;
import dao.NhanVien_DAO;
import entity.ChucVu;
import entity.NhanVien;

public class NhanVienTest {

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

	//----------------------------------------------//
		//Thêm nhan vien
			@Test // them dung
			public void testcase1() {
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="187876055";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=true;
				boolean email_expRs=true;
				boolean SDT_expRs=true;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().addNhanVien(nv));
			}
			//Sai định dạng
			@Test // Ten sai định dạng
			public void testcase2() {
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="123";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="187876055";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=false; 
				boolean diachi_expRs=true;
				boolean email_expRs=true;
				boolean SDT_expRs=true;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().addNhanVien(nv));
			}
			@Test //Email sai dinh dang
			public void testcase3() {
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="123";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="187876055";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=true;
				boolean email_expRs=false;
				boolean SDT_expRs=true;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().addNhanVien(nv));
			}
			@Test //Sdt sai định dạng
			public void testcase4() {
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="123";
				String CMND="187876055";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=true;
				boolean email_expRs=true;
				boolean SDT_expRs=false;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().addNhanVien(nv));
			}
			@Test // Sai cmnd
			public void testcase5() {
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="123";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=true;
				boolean email_expRs=true;
				boolean SDT_expRs=true;
				boolean CMND_expRs=false;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().addNhanVien(nv));
			}
			@Test // Sai dia chi
			public void testcase6() {
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="187876055";
				String diachi="123";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=false;
				boolean email_expRs=true;
				boolean SDT_expRs=true;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().addNhanVien(nv));
			}
			//Bỏ trống
			@Test // Ten trong
			public void testcase7() {
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="187876055";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=true;
				boolean email_expRs=false;
				boolean SDT_expRs=true;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().addNhanVien(nv));
			}
			@Test // Email trong
			public void testcase8() {
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="187876055";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=true;
				boolean email_expRs=false;
				boolean SDT_expRs=true;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().addNhanVien(nv));
			}
			@Test //Sdt trong
			public void testcase9() {
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="";
				String CMND="187876055";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=true;
				boolean email_expRs=true;
				boolean SDT_expRs=false;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().addNhanVien(nv));
			}
			@Test // cmnd trong
			public void testcase10() {
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=true;
				boolean email_expRs=true;
				boolean SDT_expRs=true;
				boolean CMND_expRs=false;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().addNhanVien(nv));
			}
			@Test //dia chi trong
			public void testcase11() {
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="187876055";
				String diachi="";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=false;
				boolean email_expRs=true;
				boolean SDT_expRs=true;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().addNhanVien(nv));
			}
			//-----------------------------------------------------------------//
			//Sửa nhân viên
			@Test //Dữ liệu đúng
			public void testcase12() {
				String maNV = "NV001";
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="187876055";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=true;
				boolean email_expRs=true;
				boolean SDT_expRs=true;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().updateNhanVien(maNV, nv));
			}
			//Sai định dạng
			@Test // Ten sai định dạng
			public void testcase13() {
				String maNV = "NV001";
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="123";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="187876055";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=false; 
				boolean diachi_expRs=true;
				boolean email_expRs=true;
				boolean SDT_expRs=true;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().updateNhanVien(maNV, nv));
			}
			@Test //Email sai dinh dang
			public void testcase14() {
				String maNV = "NV001";
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="123";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="187876055";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=true;
				boolean email_expRs=false;
				boolean SDT_expRs=true;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().updateNhanVien(maNV, nv));
			}
			@Test //Sai sdt
			public void testcase15() {
				String maNV = "NV001";
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="123";
				String CMND="187876055";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=true;
				boolean email_expRs=true;
				boolean SDT_expRs=false;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().updateNhanVien(maNV, nv));
			}
			@Test // Sai cmnd
			public void testcase16() {
				String maNV = "NV001";
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="123";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=true;
				boolean email_expRs=true;
				boolean SDT_expRs=true;
				boolean CMND_expRs=false;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().updateNhanVien(maNV, nv));
			}
			@Test // Sai dia chi
			public void testcase17() {
				String maNV = "NV001";
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="187876055";
				String diachi="123";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=false;
				boolean email_expRs=true;
				boolean SDT_expRs=true;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().updateNhanVien(maNV, nv));
			}
			
			// Bo trong
			@Test //Ten NV trong
			public void testcase18() {
				String maNV = "NV001";
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="187876055";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=false; 
				boolean diachi_expRs=true;
				boolean email_expRs=true;
				boolean SDT_expRs=true;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().updateNhanVien(maNV, nv));
			}
			@Test //Email trong
			public void testcase19() {
				String maNV = "NV001";
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="187876055";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=true;
				boolean email_expRs=false;
				boolean SDT_expRs=true;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().updateNhanVien(maNV, nv));
			}
			@Test //Sdt trong
			public void testcase20() {
				String maNV = "NV001";
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="";
				String CMND="187876055";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=true;
				boolean email_expRs=true;
				boolean SDT_expRs=false;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().updateNhanVien(maNV, nv));
			}
			@Test //Cmnd trong
			public void testcase21() {
				String maNV = "NV001";
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="";
				String diachi="TP.Hồ Chí Minh";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=true;
				boolean email_expRs=true;
				boolean SDT_expRs=true;
				boolean CMND_expRs=false;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().updateNhanVien(maNV, nv));
			}
			@Test //Dia chi trong
			public void testcase22() {
				String maNV = "NV001";
				String chucvu = "CV004";
				String tenchucvu = "Nhân viên kinh doanh";
				String tenNV="Lê Thạc Đạt";
				String email="datquynhvinh1231@gmail.com";
				String gioitinh="Nam";
				String SDT="0375779958";
				String CMND="187876055";
				String diachi="";
				NhanVien nv = new NhanVien();
				ChucVu cv = new ChucVu();
				cv.setMaChucVu(chucvu);
				cv.setTenChucVu(tenchucvu);
				nv.setChucVu(cv);
				nv.setTenNV(tenNV);
				nv.setEmail(email);
				nv.setCMND(Integer.parseInt(CMND));
				nv.setDiaChi(diachi);
				nv.setGioiTinh(gioitinh);
				boolean chucvu_expRs=true;
				boolean tenNV_expRs=true; 
				boolean diachi_expRs=false;
				boolean email_expRs=true;
				boolean SDT_expRs=true;
				boolean CMND_expRs=true;
				boolean addNhanVien_expRs=true;
				assertEquals(tenNV_expRs, CheckingMethod.checkTen(tenNV));
				assertEquals(email_expRs, CheckingMethod.checkEmail(email));
				assertEquals(SDT_expRs, CheckingMethod.checksdt(SDT));
				assertEquals(CMND_expRs, CheckingMethod.checkCMND(CMND));
				assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
				assertEquals(addNhanVien_expRs, new NhanVien_DAO().updateNhanVien(maNV, nv));
			}
			
			
			public void testcase23() {
				String maNV="NV001";
				boolean deleteNhanVien_expRs=true;
				assertEquals(deleteNhanVien_expRs, new NhanVien_DAO().deleteNV(maNV));
			}
			

}
