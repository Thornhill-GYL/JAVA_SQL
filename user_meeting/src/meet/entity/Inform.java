package meet.entity;

public class Inform {

	//序号
	private Integer inform_id;
	//通知用户
	private Integer user_id;
	//被通知用户
	private Integer to_user_id;
	//通知类型
	private Integer inform_type;
	//通知内容
	private String inform_content;
	public Inform() {}
	public Inform(Integer inform_id, Integer user_id, Integer to_user_id, Integer inform_type, String inform_content) {
		super();
		this.inform_id = inform_id;
		this.user_id = user_id;
		this.to_user_id = to_user_id;
		this.inform_type = inform_type;
		this.inform_content = inform_content;
	}
	public Integer getInform_id() {
		return inform_id;
	}
	public void setInform_id(Integer inform_id) {
		this.inform_id = inform_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getTo_user_id() {
		return to_user_id;
	}
	public void setTo_user_id(Integer to_user_id) {
		this.to_user_id = to_user_id;
	}
	public Integer getInform_type() {
		return inform_type;
	}
	public void setInform_type(Integer inform_type) {
		this.inform_type = inform_type;
	}
	public String getInform_content() {
		return inform_content;
	}
	public void setInform_content(String inform_content) {
		this.inform_content = inform_content;
	}
	
}
