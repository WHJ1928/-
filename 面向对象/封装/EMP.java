package ·â×°;

public class EMP {
	
    private Person person;
	private Company company;
	private Salary salary;
    private Department department;
	private Station station;
    
	private EMP up;
	private EMP[] downs;

	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
    public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Station getStation() {
		return station;
	}
	public void setStation(Station station) {
		this.station = station;
	}
	public EMP getUp() {
		return up;
	}
	public void setUp(EMP up) {
		this.up = up;
	}
	public EMP[] getDowns() {
		return downs;
	}
	public void setDowns(EMP[] downs) {
		this.downs = downs;
	}

}
