package th.co.hcu.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonFormat;

@MappedSuperclass
public abstract class BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	@JsonIgnore
	@Column(name="IS_DELETED")
	protected String isDeleted;
	
//	@JsonIgnore
	@Column(name="CREATED_BY")
	protected String createdBy;

//	@JsonIgnore
	@JsonFormat(pattern="dd/MM/yyyy", timezone="Asia/Bangkok")
	@Column(name="CREATED_DATE")
	protected Date createdDate;

//	@JsonIgnore
	@Column(name="UPDATED_BY")
	protected String updatedBy;
	
//	@JsonIgnore
	@JsonFormat(pattern="dd/MM/yyyy", timezone="Asia/Bangkok")
	@Column(name="UPDATED_DATE")
	protected Date updatedDate;


	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
