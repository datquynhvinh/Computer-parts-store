package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import BUS.CheckingMethod;

public class BanHang_FormTest {
	@Test
	public void testTC1_1() {
		String sl="";
		boolean expsl=false;
		String Tiennhan="";
		boolean expTien=false;
		assertEquals(expTien, CheckingMethod.checkDongia(Tiennhan));
		assertEquals(expsl, CheckingMethod.checkSoluong(sl));
	}
	
	@Test
	public void testTC1_2() {
		String sl=" ";
		String Tiennhan=" ";
		boolean expTien=false;
		assertEquals(expTien, CheckingMethod.checkDongia(Tiennhan));
		boolean expsl=false;
		assertEquals(expsl, CheckingMethod.checkSoluong(sl));
	}
	
	@Test
	public void testTC1_3() {
		String sl="-1";
		boolean expsl=false;
		String Tiennhan="-1000";
		boolean expTien=false;
		assertEquals(expTien, CheckingMethod.checkDongia(Tiennhan));
		assertEquals(expsl, CheckingMethod.checkSoluong(sl));
	}
	
	@Test
	public void testTC1_4() {
		String sl="a";
		boolean expsl=false;
		String Tiennhan="a";
		boolean expTien=false;
		assertEquals(expTien, CheckingMethod.checkDongia(Tiennhan));
		assertEquals(expsl, CheckingMethod.checkSoluong(sl));
	}
	
	@Test
	public void testTC1_5() {
		String sl="@#$";
		boolean expsl=false;
		String Tiennhan="@#$";
		boolean expTien=false;
		assertEquals(expTien, CheckingMethod.checkDongia(Tiennhan));
		assertEquals(expsl, CheckingMethod.checkSoluong(sl));
	}
	
	@Test
	public void testTC1_6() {
		String sl="125151535";
		boolean expsl=false;
		String Tiennhan="10000000";
		boolean expTien=true;
		assertEquals(expTien, CheckingMethod.checkDongia(Tiennhan));
		assertEquals(expsl, CheckingMethod.checkSoluong(sl));
	}
	
	@Test
	public void testTC1_7() {
		String sl="3";
		boolean expsl=true;
		String Tiennhan="10000000";
		boolean expTien=true;
		assertEquals(expTien, CheckingMethod.checkDongia(Tiennhan));
		assertEquals(expsl, CheckingMethod.checkSoluong(sl));
	}
}
