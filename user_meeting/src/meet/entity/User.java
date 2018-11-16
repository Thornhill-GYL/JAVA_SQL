package meet.entity;

public class User {

	//用户id
	private Integer user_id;
	//用户名
	private String user_name;
	//真实姓名
	private String real_name;
	//密码
	private String user_password;
	//电话
	private String user_phone;
	//邮箱
	private String user_email;
	//角色
	private Integer user_role;
	//信誉值
	private double user_credit;
	//是否具有申请会议室的资格
	private Integer if_in;
	public User() {}
	public User(Integer userId, String user_name, String real_name, String user_password, String user_phone,
			String user_email, Integer user_role, double user_credit, Integer if_in) {
		super();
		user_id = userId;
		this.user_name = user_name;
		this.real_name = real_name;
		this.user_password = user_password;
		this.user_phone = user_phone;
		this.user_email = user_email;
		this.user_role = user_role;
		this.user_credit = user_credit;
		this.if_in = if_in;
	}
	public Integer getUserId() {
		return user_id;
	}
	public void setUserId(Integer userId) {
		user_id = userId;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
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
	
}
