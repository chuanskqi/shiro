package cn.team.shiro.api.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Emp implements Serializable {
	private Long empno ;
	private String name ;
	private String jpb ;
	private Double salary ;
	private String photo ;
	public Long getEmpno() {
		return empno;
	}
	public void setEmpno(Long empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJpb() {
		return jpb;
	}
	public void setJpb(String jpb) {
		this.jpb = jpb;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", jpb=" + jpb + ", salary=" + salary + ", photo=" + photo
				+ "]";
	}
	
	
}
