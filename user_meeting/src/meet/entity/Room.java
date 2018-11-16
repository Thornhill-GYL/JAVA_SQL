package meet.entity;

import org.springframework.web.multipart.MultipartFile;

public class Room {

	//会议室门牌号
	private String room_name;
	//会议室位置描述
	private String room_location;
	//会议室状态
	private Integer room_status;
	//会议室大小
	private Integer room_size;
	//会议室设备
	private String room_equip;
	//会议室状态描述
	private String room_detail;
	//会议室图片
	private MultipartFile room_picture;
	public Room() {}
	public Room(String room_name, String room_location, Integer room_status, Integer room_size, String room_equip,
			String room_detail, MultipartFile room_picture) {
		super();
		this.room_name = room_name;
		this.room_location = room_location;
		this.room_status = room_status;
		this.room_size = room_size;
		this.room_equip = room_equip;
		this.room_detail = room_detail;
		this.room_picture = room_picture;
	}
	public String getRoom_name() {
		return room_name;
	}
	public void setRoom_name(String room_name) {
		this.room_name = room_name;
	}
	public String getRoom_location() {
		return room_location;
	}
	public void setRoom_location(String room_location) {
		this.room_location = room_location;
	}
	public Integer getRoom_status() {
		return room_status;
	}
	public void setRoom_status(Integer room_status) {
		this.room_status = room_status;
	}
	public Integer getRoom_size() {
		return room_size;
	}
	public void setRoom_size(Integer room_size) {
		this.room_size = room_size;
	}
	public String getRoom_equip() {
		return room_equip;
	}
	public void setRoom_equip(String room_equip) {
		this.room_equip = room_equip;
	}
	public String getRoom_detail() {
		return room_detail;
	}
	public void setRoom_detail(String room_detail) {
		this.room_detail = room_detail;
	}
	public MultipartFile getRoom_picture() {
		return room_picture;
	}
	public void setRoom_picture(MultipartFile room_picture) {
		this.room_picture = room_picture;
	}
	
}
