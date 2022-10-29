public class Parent {
     void msg() {
        System.out.println("This is a parent class");
    }
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        parent.msg();
        child.msg2();
        child.msg();
    }
}

class Child extends Parent {
    void msg2() {
        System.out.println("This is a child class");
    }
}