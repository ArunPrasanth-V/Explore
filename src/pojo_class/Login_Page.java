package pojo_class;
import java.util.*;
public class Login_Page {

	public static void main(String[] args) {
		UserDetails data=new UserDetails("arun","prasanth",99433,"TamilNadu",1);
		ArrayList<UserDetails> record=new ArrayList<>();
       record.add(data);
       data= record.get(0);
       System.out.println(data.getFname()+" "+data.getLname());
	}

}
