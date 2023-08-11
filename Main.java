public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("QWERT", 98, 2345);
        Student student2 = new Student("asdf", 12, 987654);
        Student student3 = new Student("zxcv", 24, 886765);
        Student student4 = new Student("opiuy", 2624, 123456);
        Student[] initialStudents = {student1, student2, student3, student4};
        StudentManager studentManager = new StudentManager(initialStudents);

        Student student5 = new Student("qwerty", 18, 5423567);
        Student student6 = new Student("asdf", 22, 17685);

        studentManager.addStudent(student5);
        studentManager.addStudent(student6);

        studentManager.updateStudent("zxcv", "newName");
        studentManager.removeStudent("qwerty");

        Student[] foundStudents = studentManager.getInfoStudent(123456);
        if (foundStudents.length > 0) {
            System.out.println("Student tabyldy: " + foundStudents[0].toString());
        } else {
            System.out.println("Myndai student jok.");
        }
    }
}
