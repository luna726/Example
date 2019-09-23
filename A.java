class Person{
    void eat(){
        System.out.println("eat food");
    }
}
class Student extends Person{
    void eat(){
        System.out.println("eat food slowly");
    }
}
class Worker extends Person{
    void eat() {
        System.out.println("eat food quickly");
    }
}
class Teacher extends Person{
    void eat() {
        System.out.println("eat food gently");
    }
}
public class A {
    // ���е��˲��۳���ͳһ�ķ�������
    public static void eatBreakFast(Person per) {
        per.eat();
    }
     public static void main(String[] args) {
        eatBreakFast(new Student());
        eatBreakFast(new Worker());
        eatBreakFast(new Teacher());
   }
}