package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.LinhKien_DAO;

public class TK_LinhKien_Test {

	private boolean testTimkiem(String kw) {
		LinhKien_DAO lkDAO= new LinhKien_DAO();
		if (lkDAO.TimKiemTen1(kw)!=null){
			return true;
		}
		return false;
	}
	
	//Tìm kiếm đúng tên
	@Test
	public void testcase1() {
		String kw="G.SKILL Trident Z Neo DDR4 ";
		boolean expRs=true;
		assertEquals(expRs, testTimkiem(kw));
	}
	
	//Tìm kiếm gần đúng
	@Test
	public void testcase2() {
		String kw="G.SKILL";
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
		
}
