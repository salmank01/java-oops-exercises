public class Company {
    public static void main(String[] args) {
        Employees employee1 = new Employees("David",  "$219,29142");
        Employees employee2 = new Employees("John",  "$939,2937");
        Employees employee3 = new Employees("Maria",  "$283,2390");
        Employees employee4 = new Employees("Diana",  "$923,29832");

        Employees[] employees = {employee1, employee2, employee3, employee4};

        for(int i = 0; i<employees.length; i++) {
            System.out.println(employees[i].name);
            System.out.println(employees[i].salary);
            System.out.println(" ");
        }
    }
}
