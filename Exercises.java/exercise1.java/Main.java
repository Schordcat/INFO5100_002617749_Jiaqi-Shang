import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new FullTime("John"));
        students.add(new PartTime("Alice"));
        students.add(new FullTime("Bob"));
        students.add(new PartTime("Eve"));
        students.add(new PartTime("Carl"));
        students.add(new FullTime("Diana"));
        students.add(new PartTime("Frank"));
        students.add(new FullTime("Grace"));
        students.add(new PartTime("Henry"));
        students.add(new FullTime("Ivy"));
        students.add(new PartTime("Jack"));
        students.add(new FullTime("Kelly"));
        students.add(new PartTime("Lucy"));
        students.add(new FullTime("Mike"));
        students.add(new PartTime("Nancy"));
        students.add(new FullTime("Oliver"));
        students.add(new PartTime("Paul"));
        students.add(new FullTime("Queen"));
        students.add(new PartTime("Robert"));
        students.add(new FullTime("Sarah"));

        for (Student student : students) {
            if (student instanceof FullTime) {
                FullTime fullTimeStudent = (FullTime) student;
                fullTimeStudent.exam1 = 90; // Dummy scores
                fullTimeStudent.exam2 = 85; // Dummy scores
            }
            for (int i = 0; i < student.quizzes.size(); i++) {
                student.quizzes.set(i, (i + 1) * 3); // Dummy scores
            }
        }

        Session session = new Session(students);
        session.calculateAverageQuizScores();
        session.printSortedQuizScores();
        session.printPartTimeStudents();
        session.printFullTimeExams();
    }
}