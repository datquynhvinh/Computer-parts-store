package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import BUS.CheckingMethod;
import dao.NhaCungCap_DAO;
import entity.NhaCungCap;

public class NCCTest {
////// Thêm
	@Test /// Thêm sai định dạng
	public void testcase1() {
		String tenNCC="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SoDT="0382665407";
		String diachi="TP.Hồ Chí Minh";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=true; 
		boolean email_expRs=true;
		boolean SoDT_expRs=true;
		boolean diachi_expRs=true;
		boolean addNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addNhaCungCap_expRs, new NhaCungCap_DAO().addNhaCungCap(ncc));
	}
	
	@Test
	public void testcase2() {
		String tenNCC="123";
		String email="abc@gmail.com";
		String SoDT="0382665407";
		String diachi="TP.Hồ Chí Minh";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=false; 
		boolean email_expRs=true;
		boolean SoDT_expRs=true;
		boolean diachi_expRs=true;
		boolean addNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addNhaCungCap_expRs, new NhaCungCap_DAO().addNhaCungCap(ncc));
	}
	
	@Test
	public void testcase3() {
		String tenNCC="Mai Phước Thịnh";
		String email="abc";
		String SoDT="0382665407";
		String diachi="TP.Hồ Chí Minh";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=true; 
		boolean email_expRs=false;
		boolean SoDT_expRs=true;
		boolean diachi_expRs=true;
		boolean addNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addNhaCungCap_expRs, new NhaCungCap_DAO().addNhaCungCap(ncc));
	}
	
	@Test
	public void testcase4() {
		String tenNCC="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SoDT="abc";
		String diachi="TP.Hồ Chí Minh";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=true; 
		boolean email_expRs=true;
		boolean SoDT_expRs=false;
		boolean diachi_expRs=true;
		boolean addNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addNhaCungCap_expRs, new NhaCungCap_DAO().addNhaCungCap(ncc));
	}
	
	@Test
	public void testcase5() {
		String tenNCC="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SoDT="0382665407";
		String diachi="123";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=true; 
		boolean email_expRs=true;
		boolean SoDT_expRs=true;
		boolean diachi_expRs=false;
		boolean addNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addNhaCungCap_expRs, new NhaCungCap_DAO().addNhaCungCap(ncc));
	}
	///// Thêm để trống
	@Test
	public void testcase6() {
		String tenNCC="";
		String email="abc@gmail.com";
		String SoDT="0382665407";
		String diachi="TP.Hồ Chí Minh";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=false; 
		boolean email_expRs=true;
		boolean SoDT_expRs=true;
		boolean diachi_expRs=true;
		boolean addNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addNhaCungCap_expRs, new NhaCungCap_DAO().addNhaCungCap(ncc));
	}
	@Test
	public void testcase7() {
		String tenNCC="Mai Phước Thịnh";
		String email="";
		String SoDT="0382665407";
		String diachi="TP.Hồ Chí Minh";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=true; 
		boolean email_expRs=false;
		boolean SoDT_expRs=true;
		boolean diachi_expRs=true;
		boolean addNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addNhaCungCap_expRs, new NhaCungCap_DAO().addNhaCungCap(ncc));
	}
	@Test
	public void testcase8() {
		String tenNCC="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SoDT="";
		String diachi="TP.Hồ Chí Minh";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=true; 
		boolean email_expRs=true;
		boolean SoDT_expRs=false;
		boolean diachi_expRs=true;
		boolean addNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addNhaCungCap_expRs, new NhaCungCap_DAO().addNhaCungCap(ncc));
	}
	@Test
	public void testcase9() {
		String tenNCC="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SoDT="0382665407";
		String diachi="";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=true; 
		boolean email_expRs=true;
		boolean SoDT_expRs=true;
		boolean diachi_expRs=false;
		boolean addNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(addNhaCungCap_expRs, new NhaCungCap_DAO().addNhaCungCap(ncc));
	}
	
	/////// Sửa
	@Test ////////// Sửa sai định dạng
	public void testcase10() {
		String maNCC="NCC003";
		String tenNCC="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SoDT="0382665407";
		String diachi="TP.Hồ Chí Minh";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=true; 
		boolean email_expRs=true;
		boolean SoDT_expRs=true;
		boolean diachi_expRs=true;
		boolean updateNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateNhaCungCap_expRs, new NhaCungCap_DAO().updateNhaCC(maNCC,ncc));
	}
	
	@Test
	public void testcase11() {
		String maNCC="NCC003";
		String tenNCC="123";
		String email="abc@gmail.com";
		String SoDT="0382665407";
		String diachi="TP.Hồ Chí Minh";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=false; 
		boolean email_expRs=true;
		boolean SoDT_expRs=true;
		boolean diachi_expRs=true;
		boolean updateNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateNhaCungCap_expRs, new NhaCungCap_DAO().updateNhaCC(maNCC,ncc));
	}
	
	@Test
	public void testcase12() {
		String maNCC="NCC003";
		String tenNCC="Mai Phước Thịnh";
		String email="abc";
		String SoDT="0382665407";
		String diachi="TP.Hồ Chí Minh";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=true; 
		boolean email_expRs=false;
		boolean SoDT_expRs=true;
		boolean diachi_expRs=true;
		boolean updateNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateNhaCungCap_expRs, new NhaCungCap_DAO().updateNhaCC(maNCC,ncc));
	}
	
	@Test
	public void testcase13() {
		String maNCC="NCC003";
		String tenNCC="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SoDT="abc";
		String diachi="TP.Hồ Chí Minh";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=true; 
		boolean email_expRs=true;
		boolean SoDT_expRs=false;
		boolean diachi_expRs=true;
		boolean updateNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateNhaCungCap_expRs, new NhaCungCap_DAO().updateNhaCC(maNCC,ncc));
	}
	
	@Test
	public void testcase14() {
		String maNCC="NCC003";
		String tenNCC="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SoDT="0382665407";
		String diachi="123";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=true; 
		boolean email_expRs=true;
		boolean SoDT_expRs=true;
		boolean diachi_expRs=false;
		boolean updateNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateNhaCungCap_expRs, new NhaCungCap_DAO().updateNhaCC(maNCC,ncc));
	}
	
	@Test///// Sửa để trống
	public void testcase15() {
		String maNCC="NCC003";
		String tenNCC="";
		String email="abc@gmail.com";
		String SoDT="0382665407";
		String diachi="TP.Hồ Chí Minh";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=false; 
		boolean email_expRs=true;
		boolean SoDT_expRs=true;
		boolean diachi_expRs=true;
		boolean updateNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateNhaCungCap_expRs, new NhaCungCap_DAO().updateNhaCC(maNCC,ncc));
	}
	
	@Test
	public void testcase16() {
		String maNCC="NCC003";
		String tenNCC="Mai Phước Thịnh";
		String email="";
		String SoDT="0382665407";
		String diachi="TP.Hồ Chí Minh";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=true; 
		boolean email_expRs=false;
		boolean SoDT_expRs=true;
		boolean diachi_expRs=true;
		boolean updateNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateNhaCungCap_expRs, new NhaCungCap_DAO().updateNhaCC(maNCC,ncc));
	}
	
	@Test
	public void testcase17() {
		String maNCC="NCC003";
		String tenNCC="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SoDT="";
		String diachi="TP.Hồ Chí Minh";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=true; 
		boolean email_expRs=true;
		boolean SoDT_expRs=false;
		boolean diachi_expRs=true;
		boolean updateNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateNhaCungCap_expRs, new NhaCungCap_DAO().updateNhaCC(maNCC,ncc));
	}
	
	@Test
	public void testcase18() {
		String maNCC="NCC003";
		String tenNCC="Mai Phước Thịnh";
		String email="abc@gmail.com";
		String SoDT="0382665407";
		String diachi="";
		NhaCungCap ncc=new NhaCungCap();
		ncc.setTenNhaCC(tenNCC);
		ncc.seteMail(email);
		ncc.setSoDT(SoDT);
		ncc.setDiaChi(diachi);
		boolean tenNCC_expRs=true; 
		boolean email_expRs=true;
		boolean SoDT_expRs=true;
		boolean diachi_expRs=false;
		boolean updateNhaCungCap_expRs=true;
		assertEquals(tenNCC_expRs, CheckingMethod.checkTen(tenNCC));
		assertEquals(email_expRs, CheckingMethod.checkEmail(email));
		assertEquals(SoDT_expRs, CheckingMethod.checksdt(SoDT));
		assertEquals(diachi_expRs, CheckingMethod.checkDiachi(diachi));
		assertEquals(updateNhaCungCap_expRs, new NhaCungCap_DAO().updateNhaCC(maNCC,ncc));
	}

	@Test
	public void testcase19() {
		String maNCC="NCC046";
		boolean deleteNhaCungCap_expRs=true;
		assertEquals(deleteNhaCungCap_expRs, new NhaCungCap_DAO().deleteNCC(maNCC));
	}
	
}
