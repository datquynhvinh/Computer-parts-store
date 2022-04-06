package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import BUS.CheckingMethod;
import dao.LinhKien_DAO;
import dao.NhanVien_DAO;
import entity.LinhKien;
import entity.LoaiLinhKien;
import entity.NhaSanXuat;

public class LinhKien_FormTest {

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
	
	
	//Thêm linh kiện
	@Test //Dữ liệu đúng
	public void test1 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "Màn hình Dell SE2717H";
		lk.setTenLK(tenLK);
		String donViTinh = "Cái";
		lk.setDonViTinh(donViTinh);
		String donGia = "170000";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "15";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=true; 
		boolean donvitinh_expRs=true;
		boolean dongia_expRs=true;
		boolean soluong_expRs=true;
		boolean addLinhKien_expRs=true;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(addLinhKien_expRs, new LinhKien_DAO().addLinhKien(lk));
		
	}
	@Test //Sai tên linh kiện
	public void test2 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "!@#";
		lk.setTenLK(tenLK);
		String donViTinh = "Cái";
		lk.setDonViTinh(donViTinh);
		String donGia = "170000";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "15";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
		boolean tenLK_expRs=false; 
		boolean donvitinh_expRs=true;
		boolean dongia_expRs=true;
		boolean soluong_expRs=true;
		boolean addLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(addLinhKien_expRs, new LinhKien_DAO().addLinhKien(lk));
		
	}
	@Test //Sai đơn vị tính
	public void test3 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "Màn hình Dell SE2717H";
		lk.setTenLK(tenLK);
		String donViTinh = "!@#";
		lk.setDonViTinh(donViTinh);
		String donGia = "170000";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "15";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=true; 
		boolean donvitinh_expRs=false;
		boolean dongia_expRs=true;
		boolean soluong_expRs=true;
		boolean addLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(addLinhKien_expRs, new LinhKien_DAO().addLinhKien(lk));
		
	}
	@Test //Sai đơn giá
	public void test4 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "Màn hình Dell SE2717H";
		lk.setTenLK(tenLK);
		String donViTinh = "Cái";
		lk.setDonViTinh(donViTinh);
		String donGia = "170000";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "15";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=true; 
		boolean donvitinh_expRs=true;
		boolean dongia_expRs=false;
		boolean soluong_expRs=true;
		boolean addLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(addLinhKien_expRs, new LinhKien_DAO().addLinhKien(lk));
		
	}
	@Test //Sai số lượng
	public void test5 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "Màn hình Dell SE2717H";
		lk.setTenLK(tenLK);
		String donViTinh = "Cái";
		lk.setDonViTinh(donViTinh);
		String donGia = "170000";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "15";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=true; 
		boolean donvitinh_expRs=true;
		boolean dongia_expRs=true;
		boolean soluong_expRs=false;
		boolean addLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(addLinhKien_expRs, new LinhKien_DAO().addLinhKien(lk));
		
	}
	@Test //Để trống tên
	public void test6 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "";
		lk.setTenLK(tenLK);
		String donViTinh = "Cái";
		lk.setDonViTinh(donViTinh);
		String donGia = "170000";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "15";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=false; 
		boolean donvitinh_expRs=true;
		boolean dongia_expRs=true;
		boolean soluong_expRs=true;
		boolean addLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(addLinhKien_expRs, new LinhKien_DAO().addLinhKien(lk));
		
	}
	@Test //Để trống đơn vị tính
	public void test7 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "Màn hình Dell SE2717H";
		lk.setTenLK(tenLK);
		String donViTinh = "";
		lk.setDonViTinh(donViTinh);
		String donGia = "170000";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "15";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=true; 
		boolean donvitinh_expRs=false;
		boolean dongia_expRs=true;
		boolean soluong_expRs=true;
		boolean addLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(addLinhKien_expRs, new LinhKien_DAO().addLinhKien(lk));
		
	}
	@Test //Để trống đơn giá
	public void test8 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "Màn hình Dell SE2717H";
		lk.setTenLK(tenLK);
		String donViTinh = "Cái";
		lk.setDonViTinh(donViTinh);
		String donGia = "";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "15";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=true; 
		boolean donvitinh_expRs=true;
		boolean dongia_expRs=true;
		boolean soluong_expRs=true;
		boolean addLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(addLinhKien_expRs, new LinhKien_DAO().addLinhKien(lk));
		
	}
	@Test //Để trống số lượng
	public void test9 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "Màn hình Dell SE2717H";
		lk.setTenLK(tenLK);
		String donViTinh = "Cái";
		lk.setDonViTinh(donViTinh);
		String donGia = "170000";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=true; 
		boolean donvitinh_expRs=true;
		boolean dongia_expRs=true;
		boolean soluong_expRs=true;
		boolean addLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(addLinhKien_expRs, new LinhKien_DAO().addLinhKien(lk));
		
	}
	//-----------------------------------------------------------------//
	//Sửa linh kiện
	@Test //Dữ liệu đúng
	public void test10 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "Màn hình Dell SE2717H";
		lk.setTenLK(tenLK);
		String donViTinh = "Cái";
		lk.setDonViTinh(donViTinh);
		String donGia = "170000";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "15";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
	    String maLK = "LK024";
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=true; 
		boolean donvitinh_expRs=true;
		boolean dongia_expRs=true;
		boolean soluong_expRs=true;
		boolean updateLinhKien_expRs=true;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(updateLinhKien_expRs, new LinhKien_DAO().updateLinhKien(maLK, lk));
	}
	@Test //Sai tên linh kiện
	public void test11 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "!@#";
		lk.setTenLK(tenLK);
		String donViTinh = "Cái";
		lk.setDonViTinh(donViTinh);
		String donGia = "170000";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "15";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
	    String maLK = "LK024";
		boolean tenLK_expRs=false; 
		boolean donvitinh_expRs=true;
		boolean dongia_expRs=true;
		boolean soluong_expRs=true;
		boolean updateLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(updateLinhKien_expRs, new LinhKien_DAO().updateLinhKien(maLK, lk));
		
	}
	@Test //Sai đơn vị tính
	public void test12 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "Màn hình Dell SE2717H";
		lk.setTenLK(tenLK);
		String donViTinh = "!@#";
		lk.setDonViTinh(donViTinh);
		String donGia = "170000";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "15";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
	    String maLK = "LK024";
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=true; 
		boolean donvitinh_expRs=false;
		boolean dongia_expRs=true;
		boolean soluong_expRs=true;
		boolean updateLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(updateLinhKien_expRs, new LinhKien_DAO().updateLinhKien(maLK, lk));
		
	}
	@Test //Sai đơn giá
	public void test13 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "Màn hình Dell SE2717H";
		lk.setTenLK(tenLK);
		String donViTinh = "Cái";
		lk.setDonViTinh(donViTinh);
		String donGia = "!@#";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "15";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
	    String maLK = "LK024";
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=true; 
		boolean donvitinh_expRs=true;
		boolean dongia_expRs=false;
		boolean soluong_expRs=true;
		boolean updateLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(updateLinhKien_expRs, new LinhKien_DAO().updateLinhKien(maLK, lk));
		
	}
	@Test //Sai số lượng
	public void test14 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "Màn hình Dell SE2717H";
		lk.setTenLK(tenLK);
		String donViTinh = "Cái";
		lk.setDonViTinh(donViTinh);
		String donGia = "170000";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "!@#";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
	    String maLK = "LK024";
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=true; 
		boolean donvitinh_expRs=true;
		boolean dongia_expRs=true;
		boolean soluong_expRs=false;
		boolean updateLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(updateLinhKien_expRs, new LinhKien_DAO().updateLinhKien(maLK, lk));
		
	}
	@Test //Để trống tên
	public void test15 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "";
		lk.setTenLK(tenLK);
		String donViTinh = "Cái";
		lk.setDonViTinh(donViTinh);
		String donGia = "170000";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "15";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
	    String maLK = "LK024";
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=false; 
		boolean donvitinh_expRs=true;
		boolean dongia_expRs=true;
		boolean soluong_expRs=true;
		boolean updateLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(updateLinhKien_expRs, new LinhKien_DAO().updateLinhKien(maLK, lk));
	}
	@Test //Để trống đơn vị tính
	public void test16 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "Màn hình Dell SE2717H";
		lk.setTenLK(tenLK);
		String donViTinh = "";
		lk.setDonViTinh(donViTinh);
		String donGia = "170000";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "15";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
	    String maLK = "LK024";
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=true; 
		boolean donvitinh_expRs=false;
		boolean dongia_expRs=true;
		boolean soluong_expRs=true;
		boolean updateLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(updateLinhKien_expRs, new LinhKien_DAO().updateLinhKien(maLK, lk));
	}
	@Test //Để trống đơn giá
	public void test17 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "Màn hình Dell SE2717H";
		lk.setTenLK(tenLK);
		String donViTinh = "Cái";
		lk.setDonViTinh(donViTinh);
		String donGia = "";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "15";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
	    String maLK = "LK024";
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=true; 
		boolean donvitinh_expRs=true;
		boolean dongia_expRs=true;
		boolean soluong_expRs=true;
		boolean updateLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(updateLinhKien_expRs, new LinhKien_DAO().updateLinhKien(maLK, lk));
		
	}
	@Test //Để trống số lượng
	public void test18 () {
		LinhKien lk = new LinhKien();
		String loaiLK = "LLK006";
		String tenLLK = "Ram - Bộ nhớ trong";
		LoaiLinhKien llk = new LoaiLinhKien();
		llk.setMaLoai(loaiLK);
		llk.setTenLoai(tenLLK);
		lk.setLoaiLinhKien(llk);
		NhaSanXuat nsx = new NhaSanXuat();
		String maNSX = "NSX005";
		String tenNSX = "Dell";
		nsx.setMaNhaSX(maNSX);
		nsx.setTenNhaSX(tenNSX);
		lk.setNhaSanXuat(nsx);
		String tenLK = "Màn hình Dell SE2717H";
		lk.setTenLK(tenLK);
		String donViTinh = "Cái";
		lk.setDonViTinh(donViTinh);
		String donGia = "170000";
		lk.setDonGia(Double.parseDouble(donGia));
		String soLuong = "";
		lk.setSoLuong(Integer.parseInt(soLuong));
		String baohanh = "6 tháng";
		lk.setBaoHanh(baohanh);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date(2020, 10, 10);  
	    lk.setNgaySX(date);
	    String tinhtrang = "Mới - FullBox 100%";
	    lk.setTinhTrang(tinhtrang);
	    String images = "src/images_LinhKien/mhhp3.png";
	    lk.setiMages(images);
	    String maLK = "LK024";
		boolean nhasanxuat_expRs=true; 
		boolean tenLK_expRs=true; 
		boolean donvitinh_expRs=true;
		boolean dongia_expRs=true;
		boolean soluong_expRs=true;
		boolean updateLinhKien_expRs=false;
		assertEquals(tenLK_expRs, CheckingMethod.checkTenLK(tenLK));
		assertEquals(donvitinh_expRs, CheckingMethod.checkDonvitinh(donViTinh));
		assertEquals(dongia_expRs, CheckingMethod.checkDongia(donGia));
		assertEquals(soluong_expRs, CheckingMethod.checkSoluong(soLuong));
		assertEquals(updateLinhKien_expRs, new LinhKien_DAO().updateLinhKien(maLK, lk));
		
	}
//	@Test 
//	public void test19 () {
//		String maLK="LK023";
//		boolean deleteLinhKien_expRs=true;
//		assertEquals(deleteLinhKien_expRs, new LinhKien_DAO().deleteLK(maLK));
//	}
}
