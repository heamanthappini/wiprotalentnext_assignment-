public class Employee implements Cloneable {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        // Create original employee
        Employee original = new Employee(101, "Karthik", 30000);

        // Create clone
        Employee cloned = original.clone();

        // Change properties of original employee
        original.id = 102;
        original.name = "Ravi";
        original.salary = 40000;

        System.out.println("Original Employee:");
        original.display();

        System.out.println("\nCloned Employee:");
        cloned.display();
    }
}