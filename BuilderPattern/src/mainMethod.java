import com.phone.Phone;
import com.phone.PhoneBuilder;

public class mainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p = new PhoneBuilder().setOs("Andoird").setRam(2000).build();
		System.out.println(p);
		
	}

}
