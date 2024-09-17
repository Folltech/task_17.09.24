package first_task;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private String studentid;

    public Student(String name, String studentid) {
        this.name = name;
        this.studentid = studentid;
    }

    public String getNameid() {
        return name + " " + studentid;

    }
    static Map<String, Student> studentMap = new HashMap<String, Student>();
    void addStudent(String id,Student student){
        studentMap.put(id, student);
    }
    static String getStudent(String id){
        return studentMap.get(id).getNameid();
    }
}
