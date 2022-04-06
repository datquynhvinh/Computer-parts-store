package BUS;

public class CheckingMethod {
	public static boolean checkTen(String ten) {
		String patern="^[^\\p{Punct}\\d]{3,50}$";
		if (ten.matches(patern)) {
			return true;
		}
		return false;
	}
	public static boolean checkDiachi(String diachi) {
		String patern="^[!\"#$%&\\'()*+-/:;<=>?@[\\\\]^_`{|}~]$\"]{3,50}$";
		if (!diachi.matches(patern)) {
			return true;
		}
		return false;
	}

	public static boolean checkEmail(String email) {
		String patern="^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$";
		if (email.matches(patern)) {
			return true;
		}
		return false;
	}
	public static boolean checksdt(String sdt) {
		String patern="^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
		if (sdt.matches(patern) && sdt.startsWith("0")) {
			return true;
		}
		return false;
	}
	public static boolean checkCMND(String cmnd) {
		String patern1= "^[0-9]{12}$";
    	String patern2="^[0-9]{9}$";
    	if (cmnd.matches(patern1) || cmnd.matches(patern2)) {
    		return true;
    	}
    	return false;
	}
	public static boolean checkSoluong(String soluong) {
		if(Integer.parseInt(soluong) < 1) {
			return false;
		} else {
		String patern="^[0-9]{1,5}$";
		if (soluong.matches(patern)) {
			return true;
		}
		return false;
		}
	}
	public static boolean checkSL(int soluong) {
		if(soluong < 1) {
			return false;
		} else {
		String patern="^[0-9]{1,5}$";
		if (String.valueOf(soluong).matches(patern)) {
			return true;
		}
		return false;
		}
	}
	public static boolean checkDongia(String dongia) {
		String patern="^[0-9]{3,10}$";
		if (dongia.matches(patern)) {
			return true;
		}
		return false;
	}
	public static boolean checkDonvitinh(String dvt) {
		if(dvt=="" || dvt==" ") {
			return false;
		} else {
		String patern = "^[^\\p{Punct}\\d]{1,10}$";
				if(dvt.matches(patern)){
				return true;
				}
				return false;
		}
	}
	
	
	
	public static boolean checkTenLK(String ten) {
		String patern="^[^\\p{Punct}]{3,50}$";
		if (ten.matches(patern)) {
			return true;
		}
		return false;
	}
	
	
	public static boolean checkTaikhoan(String diachi) {
		String patern="^[a-zA-Z0-9_]{3,50}$";
		if (diachi.matches(patern)) {
			return true;
		}
		return false;
	}
	
	public static boolean checkMatkhau(String diachi) {
		String patern="^[\\p{L}0-9 .,!#$%&]{3,50}+$";
		if (diachi.matches(patern)) {
			return true;
		}
		return false;
	}
	
	public static boolean checkDG(int dongia) {
		String patern="^[0-9]{3,10}$";
		if (String.valueOf(dongia).matches(patern)) {
			return true;
		}
		return false;
	}
	
//	public static void main(String[] args) {
//		int soluong=0;
//		System.out.println(CheckingMethod.checkSL(soluong));
//
//	}
}
