package meet.entity;

public class Myuser {
	//用户ID
	private Integer user_id;
	//用户名
	private String user_name;
	private String real_name;
	private String user_password;
	private String user_phone;
	private String user_email;
	private Integer user_role;
	private double user_credit;
	private Integer if_in;
	public Myuser() {}
	public Myuser(int id, String name,String real_name,String word, String phone,String mail)
	{
		super();
		this.user_id=id;
		this.user_name=name;
		this.real_name=real_name;
		this.user_password=word;
		this.user_phone=phone;
		this.user_email=mail;
	}
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public Integer getUser_role() {
		return user_role;
	}
	public void setUser_role(Integer user_role) {
		this.user_role = user_role;
	}
	public double getUser_credit() {
		return user_credit;
	}
	public void setUser_credit(double user_credit) {
		this.user_credit = user_credit;
	}
	public Integer getIf_in() {
		return if_in;
	}
	public void setIf_in(Integer if_in) {
		this.if_in = if_in;
	}
	public Myuser(int id)
	{
		super();
		this.user_id=id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
}
