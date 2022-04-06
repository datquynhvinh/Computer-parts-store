package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import BUS.CheckingMethod;

public class DatHangForm_Test {

	@Test
	public void testTC1_1() {
		String sl="";
		boolean expsl=false;
		assertEquals(expsl, CheckingMethod.checkSoluong(sl));
	}
	
	@Test
	public void testTC1_2() {
		String sl=" ";
		boolean expsl=false;
		assertEquals(expsl, CheckingMethod.checkSoluong(sl));
	}
	
	@Test
	public void testTC1_3() {
		String sl="-1";
		boolean expsl=false;
		assertEquals(expsl, CheckingMethod.checkSoluong(sl));
	}
	
	@Test
	public void testTC1_4() {
		String sl="abc";
		boolean expsl=false;
		assertEquals(expsl, CheckingMethod.checkSoluong(sl));
	}

	@Test
	public void testTC1_5() {
		String sl="@#$";
		boolean expsl=false;
		assertEquals(expsl, CheckingMethod.checkSoluong(sl));
	}
	
	@Test
	public void testTC1_6() {
		String sl="125151535";
		boolean expsl=false;
		assertEquals(expsl, CheckingMethod.checkSoluong(sl));
	}
	
	@Test
	public void testTC1_7() {
		String sl="10";
		boolean expsl=true;
		assertEquals(expsl, CheckingMethod.checkSoluong(sl));
	}
}
