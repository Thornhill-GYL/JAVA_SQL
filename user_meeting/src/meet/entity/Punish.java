package meet.entity;

public class Punish {

	//序号
	private Integer punish_id;
	//管理员user_id
	private Integer user_id;
	//被惩罚用户id
	private Integer punish_user_id;
	//因为哪个预定记录惩罚
	private Integer order_id;
	//惩罚内容
	private String punish_content;
	//惩罚原因
	private String punish_reason;
	public Punish() {}
	public Punish(Integer punish_id, Integer user_id, Integer punish_user_id, Integer order_id, String punish_content,
			String punish_reason) {
		super();
		this.punish_id = punish_id;
		this.user_id = user_id;
		this.punish_user_id = punish_user_id;
		this.order_id = order_id;
		this.punish_content = punish_content;
		this.punish_reason = punish_reason;
	}
	public Integer getPunish_id() {
		return punish_id;
	}
	public void setPunish_id(Integer punish_id) {
		this.punish_id = punish_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getPunish_user_id() {
		return punish_user_id;
	}
	public void setPunish_user_id(Integer punish_user_id) {
		this.punish_user_id = punish_user_id;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public String getPunish_content() {
		return punish_content;
	}
	public void setPunish_content(String punish_content) {
		this.punish_content = punish_content;
	}
	public String getPunish_reason() {
		return punish_reason;
	}
	public void setPunish_reason(String punish_reason) {
		this.punish_reason = punish_reason;
	}
	
}
