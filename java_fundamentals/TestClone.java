package Employee;

public class TestClone {
    public static void main(String[] args) {
        try {    
            Employee original = new Employee("Alice", 101, 50000);         
            Employee clone = (Employee) original.clone();    
            original.setName("Bob");
            original.setSalary(60000); 
            System.out.println("Original: " + original);
            System.out.println("Clone:    " + clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
