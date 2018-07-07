package th.co.hcu.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todo_detail")
public class TodoDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
  private long detailId;
  private long todoId;
  private String detail;
  private long sorting;
  private Date createDate;
  private String createBy;
  private Date updateDate;
  private String updateBy;


  public long getDetailId() {
    return detailId;
  }

  public void setDetailId(long detailId) {
    this.detailId = detailId;
  }


  public long getTodoId() {
    return todoId;
  }

  public void setTodoId(long todoId) {
    this.todoId = todoId;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }


  public long getSorting() {
    return sorting;
  }

  public void setSorting(long sorting) {
    this.sorting = sorting;
  }


  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }


  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }


  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }


  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }

}
