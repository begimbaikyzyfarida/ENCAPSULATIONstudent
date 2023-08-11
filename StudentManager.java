import java.util.Arrays;
public class StudentManager {
    private Student[] students;

    public StudentManager(Student[] students) {
        this.students = students;
    }

    public Student[] removeStudent(String name) {
        int indexToRemove = -1;
        for (int i = 0; i < students.length; i++) {
            if (name.equals(students[i].getStudentName())) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            Student[] updatedStudents = new Student[students.length - 1];
            int currentIndex = 0;
            for (int i = 0; i < students.length; i++) {
                if (i != indexToRemove) {
                    updatedStudents[currentIndex] = students[i];
                    currentIndex++;
                }
            }
            students = updatedStudents;
        }

        return students;
    }

    public Student[] updateStudent(String name, String newName) {
        for (Student b : students) {
            if (b.getStudentName().equals(name)) {
                b.setStudentName(newName);
                break;
            }
        }
        return students;
    }

    public Student[] addStudent(Student student) {
        boolean studentExists = false;
        for (Student b : students) {
            if (b.getStudentName().equals(student.getStudentName())) {
                System.out.println("Student iygiliktuiu koshuldu");
                studentExists = true;
                break;
            }
        }

        if (!studentExists) {
            Student[] student2 = new Student[students.length + 1];
            for (int i = 0; i < students.length; i++) {
                student2[i] = students[i];
            }
            student2[students.length] = student;
            students = Arrays.copyOf(student2, student2.length);
        } else {
            System.out.println("Student koshulgan jok");
        }

        return students;
    }

    public Student[] getInfoStudent(int id) {
        for (Student student : students) {
            if (student.getIdStudent() == id) {
                return new Student[]{student};
            }
        }
        return new Student[0];
    }
}
