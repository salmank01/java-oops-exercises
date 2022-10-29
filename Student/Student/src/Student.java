public class Student {
    String name;
    String adress;
    String phone;
    int roll_no;

    Student(String name, String adress, String phone, int roll_no) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.roll_no = roll_no;
    }
    private void output() {
        System.out.println(name);
        System.out.println(adress);
        System.out.println(phone);
        System.out.println(roll_no);
    }
    public static void main(String[] args) {
        Student student = new Student("Salman Khan", "Sattelite Town, RYK", "032342378293", 28);
        Student student1 = new Student("Manal Mirza", "Chanab Nagar, FSBD", "03263872783", 27);
        student1.output();
        student.output();
    }
}
