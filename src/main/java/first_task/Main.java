package first_task;

public class Main {
    public static void main(String[] args){
        Student student = new Student("Andrew", "1");
        Student student2 = new Student("Nazare", "2");
        student.addStudent("1",student);
        student.addStudent("2",student2);
        System.out.println(student.getStudent("1"));
        System.out.println(student.getStudent("2"));
    }
}
