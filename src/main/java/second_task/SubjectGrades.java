package second_task;

import java.util.HashMap;
import java.util.Map;

class SubjectGrades {
    private String subject;
    private Map<String, Integer> grades;

    public SubjectGrades(String subject) {
        this.subject = subject;
        this.grades = new HashMap<>();
    }

    public void Hash(String studentName, Integer grade) {
        grades.put(studentName, grade);
    }

    public double calcul() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int total = 0;
        for (Integer grade : grades.values()) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    @Override
    public String toString() {
        return "Subject: " + subject + ", Grades: " + grades;
    }
}
