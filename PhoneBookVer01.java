
	class PhoneInfo{
	String name;
	String phoneNumber;
	String birth;
	
	public PhoneInfo(String name, String num, String birth) {
		this.name = name;
		phoneNumber = num;
		this.birth  = birth;
	}
	
	public PhoneInfo(String name, String num) {
		this.name = name;
		phoneNumber = num;
		this.birth = null;
	}
	
	public void showPhoneInfo() {
		System.out.println("name : " +name);
		System.out.println("phone : " +phoneNumber);
		if(birth !=null)
		System.out.println("birth : " +birth);
		
		System.out.println(""); 
	}
	
}

public class PhoneBookVer01 {

	public static void main(String[] args) {
		
		PhoneInfo pInfo1= new PhoneInfo("¿Ã¡§»∆", "323-1111", "92,09,12");
		PhoneInfo pInfo2= new PhoneInfo("±Ë»ø¡ÿ", "321-2222");
		pInfo1.showPhoneInfo();
		pInfo2.showPhoneInfo();

	}

}
