public class Member {
    String name;
    int age;
    String phone;
    String salary;
    String address;
    void printSalary() {
        System.out.println("Your salary is: " + this.salary);
    }
    public static void main(String[] args) {
        Employee employee = new Employee("David", "$293,43", "3101-232-3843", 24, "4th avenue, NYC");
        Manager manager = new Manager("John", "$253,46", "3101-939-3483", 21, "7th avenue, NYC");
        Member[] members = {employee, manager};
    for(int i=0; i<members.length; i++) {
            System.out.println(members[i].name);
            System.out.println(members[i].age);
            System.out.println(members[i].phone);
            System.out.println(members[i].salary);
            System.out.println(members[i].address);
        }

    }
}

class Employee extends Member{
    String specialization;
    Employee(String name, String salary, String phone, int age, String address) {
        this.name = name;
        this.salary = salary;
        this.phone = phone;
        this.address = address;
        this.age = age;
    }
}
class Manager extends Member{
    String department;
    Manager(String name, String salary, String phone, int age, String address) {
        this.name = name;
        this.salary = salary;
        this.phone = phone;
        this.address = address;
        this.age = age;
    }

}
