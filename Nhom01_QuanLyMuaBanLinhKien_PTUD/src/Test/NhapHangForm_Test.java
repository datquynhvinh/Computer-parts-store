package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import BUS.CheckingMethod;

public class NhapHangForm_Test {
	//Test case 1
		@Test
		public void testTC1_1() {
			String tenLK="";
			String DVTinh="Cái";
			String Dongia="129000";
			String sl="2";
			boolean exptenLK=false;
			boolean expDVTinh=true;
			boolean expDongia=true;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTen(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		@Test
		public void testTC1_2() {
			String tenLK=" ";
			String DVTinh="Cái";
			String Dongia="129000";
			String sl="2";
			boolean exptenLK=false;
			boolean expDVTinh=true;
			boolean expDongia=true;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTen(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		@Test
		public void testTC1_3() {
			String tenLK="@#$";
			String DVTinh="Cái";
			String Dongia="129000";
			String sl="2";
			boolean exptenLK=false;
			boolean expDVTinh=true;
			boolean expDongia=true;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTen(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		@Test
		public void testTC1_4() {
			String tenLK="Nguồn máy tính Corsair RM750xNguồn máy tính Corsair RM750xNguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="129000";
			String sl="2";
			boolean exptenLK=false;
			boolean expDVTinh=true;
			boolean expDongia=true;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTen(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		@Test
		public void testTC1_5() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="129000";
			String sl="2";
			boolean exptenLK=false;
			boolean expDVTinh=true;
			boolean expDongia=true;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTen(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		//Test case 2
		@Test
		public void testTC2_1() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="";
			String Dongia="129000";
			String sl="2";
			boolean exptenLK=true;
			boolean expDVTinh=false;
			boolean expDongia=true;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		@Test
		public void testTC2_2() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh=" ";
			String Dongia="129000";
			String sl="2";
			boolean exptenLK=true;
			boolean expDVTinh=false;
			boolean expDongia=true;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		@Test
		public void testTC2_3() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="@#$";
			String Dongia="129000";
			String sl="2";
			boolean exptenLK=true;
			boolean expDVTinh=false;
			boolean expDongia=true;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		@Test
		public void testTC2_4() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="CáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCáiCái";
			String Dongia="129000";
			String sl="2";
			boolean exptenLK=true;
			boolean expDVTinh=false;
			boolean expDongia=true;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		@Test
		public void testTC2_5() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="1";
			String Dongia="129000";
			String sl="2";
			boolean exptenLK=true;
			boolean expDVTinh=false;
			boolean expDongia=true;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		//Test case 3
		@Test
		public void testTC3_1() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="";
			String sl="2";
			boolean exptenLK=true;
			boolean expDVTinh=true;
			boolean expDongia=false;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		@Test
		public void testTC3_2() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia=" ";
			String sl="2";
			boolean exptenLK=true;
			boolean expDVTinh=true;
			boolean expDongia=false;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		@Test
		public void testTC3_3() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="@#$";
			String sl="2";
			boolean exptenLK=true;
			boolean expDVTinh=true;
			boolean expDongia=false;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		@Test
		public void testTC3_4() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="1";
			String sl="2";
			boolean exptenLK=true;
			boolean expDVTinh=true;
			boolean expDongia=true;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		
		@Test
		public void testTC3_5() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="10000000000000000000000000000000000000000000000";
			String sl="2";
			boolean exptenLK=true;
			boolean expDVTinh=true;
			boolean expDongia=false;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		public void testTC3_6() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="abc";
			String sl="2";
			boolean exptenLK=true;
			boolean expDVTinh=true;
			boolean expDongia=false;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		public void testTC3_7() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="-1000";
			String sl="2";
			boolean exptenLK=true;
			boolean expDVTinh=true;
			boolean expDongia=false;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		
		//Test case 4
		@Test
		public void testTC4_1() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="129000";
			String sl="";
			boolean exptenLK=true;
			boolean expDVTinh=true;
			boolean expDongia=true;
			boolean expsl=false;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		@Test
		public void testTC4_2() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="129000";
			String sl=" ";
			boolean exptenLK=true;
			boolean expDVTinh=true;
			boolean expDongia=true;
			boolean expsl=false;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		@Test
		public void testTC4_3() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="129000";
			String sl="abc";
			boolean exptenLK=true;
			boolean expDVTinh=true;
			boolean expDongia=true;
			boolean expsl=false;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		@Test
		public void testTC4_4() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="129000";
			String sl="@#$";
			boolean exptenLK=true;
			boolean expDVTinh=true;
			boolean expDongia=true;
			boolean expsl=false;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		@Test
		public void testTC4_5() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="129000";
			String sl="111111111111111111111111";
			boolean exptenLK=true;
			boolean expDVTinh=true;
			boolean expDongia=true;
			boolean expsl=false;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		@Test
		public void testTC4_6() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="129000";
			String sl="-1000";
			boolean exptenLK=true;
			boolean expDVTinh=true;
			boolean expDongia=true;
			boolean expsl=false;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		@Test
		public void testTC4_7() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="129000";
			String sl="abc";
			boolean exptenLK=true;
			boolean expDVTinh=true;
			boolean expDongia=true;
			boolean expsl=false;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
		
		//Test case 5
		@Test
		public void testTC5() {
			String tenLK="Nguồn máy tính Corsair RM750x";
			String DVTinh="Cái";
			String Dongia="129000";
			String sl="11";
			boolean exptenLK=true;
			boolean expDVTinh=true;
			boolean expDongia=true;
			boolean expsl=true;
			assertEquals(exptenLK, CheckingMethod.checkTenLK(tenLK));
			assertEquals(expDVTinh, CheckingMethod.checkDonvitinh(DVTinh));
			assertEquals(expDongia, CheckingMethod.checkDongia(Dongia));
			assertEquals(expsl, CheckingMethod.checkSoluong(sl));
		}
}
