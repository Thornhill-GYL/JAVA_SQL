package meet.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Order {

	//预定序号
	private Integer order_id;
	//预定人序号
	private Integer user_id;
	//预定的会议室门牌号
	private String room_name;
	//事件描述
	private String event_content;
	//参加人数
	private Integer people_number;
	//申请创建时间
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
	private Date create_time;
	//预计开始时间
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
	private Date start_time;
	//预计结束时间
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
	private Date end_time;
	//实际开始时间
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
	private Date true_start_time;
	//实际结束时间
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
	private Date true_end_time;
	//是否确认开始
	private Integer if_start;
	//是否确认结束
	private Integer if_end;
	public Order() {}
	public Order(Integer order_id, Integer user_id, String room_name, String event_content, Integer people_number,
			Date create_time, Date start_time, Date end_time, Date true_start_time, Date true_end_time,
			Integer if_start, Integer if_end) {
		super();
		this.order_id = order_id;
		this.user_id = user_id;
		this.room_name = room_name;
		this.event_content = event_content;
		this.people_number = people_number;
		this.create_time = create_time;
		this.start_time = start_time;
		this.end_time = end_time;
		this.true_start_time = true_start_time;
		this.true_end_time = true_end_time;
		this.if_start = if_start;
		this.if_end = if_end;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getRoom_name() {
		return room_name;
	}
	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}
	public String getEvent_content() {
		return event_content;
	}
	public void setEvent_content(String event_content) {
		this.event_content = event_content;
	}
	public Integer getPeople_number() {
		return people_number;
	}
	public void setPeople_number(Integer people_number) {
		this.people_number = people_number;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public Date getTrue_start_time() {
		return true_start_time;
	}
	public void setTrue_start_time(Date true_start_time) {
		this.true_start_time = true_start_time;
	}
	public Date getTrue_end_time() {
		return true_end_time;
	}
	public void setTrue_end_time(Date true_end_time) {
		this.true_end_time = true_end_time;
	}
	public Integer getIf_start() {
		return if_start;
	}
	public void setIf_start(Integer if_start) {
		this.if_start = if_start;
	}
	public Integer getIf_end() {
		return if_end;
	}
	public void setIf_end(Integer if_end) {
		this.if_end = if_end;
	}
	
}
