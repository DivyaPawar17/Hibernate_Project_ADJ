package one_to_one_unidirectional_entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_master")
public class Employee {
	@Id
	@Column(name = "emp_no")
	private Integer empno;
	@Column(name = "emp_name")
	private String name;
	@Column(name = "emp_sal")
	private int sal;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passport_id")
	private Passport passportRef;

	public Employee() {
		
	}

	public Employee(Integer empno, String name, int sal, Passport passportRef) {
		super();
		this.empno = empno;
		this.name = name;
		this.sal = sal;
		this.passportRef = passportRef;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Passport getPassportRef() {
		return passportRef;
	}

	public void setPassportRef(Passport passportRef) {
		this.passportRef = passportRef;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", sal=" + sal + ", passportRef=" + passportRef + "]";
	}
	
}
