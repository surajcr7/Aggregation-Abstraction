package aggregation;

public class Testcar {
	public static void main(String[] args) {
		CarAggregation c1= new CarAggregation();
		c1.setCc(12);
		c1.setColor("White");
		c1.setPrice(1000000);
		c1.setModel("CARS123");
		
		
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Suraj");
		e1.setCar(c1);
		e1.setPhone("9843803826");
		e1.setSalary(1000000);
		
		System.out.println("Id = "+e1.getId());
		System.out.println("Name = "+e1.getName());
		System.out.println("Salary = "+e1.getSalary());
		System.out.println("Phone = "+e1.getPhone());
		
		System.out.println("======= car info=========");
		
		System.out.println("cc = "+e1.getCar().getCc());
		System.out.println("Color = "+e1.getCar().getColor());
		System.out.println("Model = " +e1.getCar().getModel());
		System.out.println("price = "+e1.getCar().getPrice());
	}
	

}
