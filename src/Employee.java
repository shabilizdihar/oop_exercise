public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private String position;

// NON-PARAMETERIZED CONSTRUCTOR ---------------------
    public Employee() {

    }

// PARAMETERIZED CONSTRUCTOR ------------------

    public Employee(int id, String firstName, String lastName, String department, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.position = position;
    }

// SETTERS ----------------------

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

// GETTERS --------------------------------
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

// PRINT DETAILS -----------------

    public void printdetails(){
        System.out.println("\n== NON PARAMETERIZED ==");
        System.out.println(
                "ID : " + getId() +
                "\nFIRST NAME : " + getFirstName() +
                "\nLAST NAME : " + getLastName() +
                "\nDEPARTMENT : " + getDepartment() +
                "\nPOSITION : " + getPosition()
        );
    }
}
