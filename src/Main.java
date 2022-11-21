public class Main {
    public static void main(String[] args) {

        //NON-PARAMTERIZED
        Employee employee = new Employee();

        employee.setId(123);
        employee.setFirstName("Shabil");
        employee.setLastName("Izdihar");
        employee.setDepartment("Java Capability");
        employee.setPosition("Application Development Associate");

        //print details
        employee.printdetails();

        //PARAMETERIZED
        employee = new Employee(13, "Abu", "Ali", "Cyber", "Bus Process");

        //print details
        employee.printdetails();




    }
}