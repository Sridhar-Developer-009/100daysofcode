public class mainoop {
    public static void main(String[] args) {
        Student student1=new Student(13,"sridhar",4f);
        System.out.println(student1.rno+" "+student1.name);
    }
}
class  Student{
    int rno;
    String name;
    float marks;
    // Constructor to initialize Student objects
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
