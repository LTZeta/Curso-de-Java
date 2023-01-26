package chapters.chapter9.Inheritance;

public class Employee extends Person {

    private String employeeID;
    private String title;

    public Employee() {
        super("Leo");
        System.out.println("In Employee constructor 1");
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
