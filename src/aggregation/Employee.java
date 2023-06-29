package aggregation;

public class Employee {
	private int id;
	private String phone;
	private String name;
	private int salary;
	private CarAggregation car; // has a relationship uta ko class ko name and variable
	
	
	
	
	
	
	public CarAggregation getCar() {
		return car;
	}
	public void setCar(CarAggregation car) {
		this.car = car;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
