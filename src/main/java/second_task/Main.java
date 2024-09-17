package second_task;

public class Main {
    public static void main(String[] args) {
        SubjectGrades mathGrades = new SubjectGrades("Mathematics");
        mathGrades.Hash("Nazefe", 67);
        mathGrades.Hash("Andrew", 34);
        mathGrades.Hash("Kakish", 98);
        System.out.println(mathGrades);
        double average = mathGrades.calcul();
        System.out.println("Average Grade: " + average);
    }
}
