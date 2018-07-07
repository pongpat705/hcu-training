package th.co.hcu.beans;

import java.util.Date;

public class ApiResponse<T> {

	private String code;
	private T data;
	private String message;
	private Date responseTime = new Date();
	
	public String getCode() {
		return code;
	}
	public T getData() {
		return data;
	}
	public String getMessage() {
		return message;
	}
	public Date getResponseTime() {
		return responseTime;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setData(T data) {
		this.data = data;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}
	
}
