package pojo_class;

public class UserDetails {

	private String Fname;
	private String Lname;
	private int phone_number;
	private String state;
	private int id;
	UserDetails(String Fname,String Lname,int phone_number,String state,int id)
	{
		this.Fname=Fname;
		this.Lname=Lname;
		this.id=id;
		this.phone_number=phone_number;
		this.state=state;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
