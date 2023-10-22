import java.util.ArrayList;
import java.util.Collections;

class Session {
    ArrayList<Student> students;

    public Session(ArrayList<Student> students) {
        this.students = students;
    }

    public void calculateAverageQuizScores() {
        for (Student student : students) {
            int sum = 0;
            for (int score : student.quizzes) {
                sum += score;
            }
            double avg = (double) sum / student.quizzes.size();
            System.out.println("Average score for " + student.name + ": " + avg);
        }
    }

    public void printSortedQuizScores() {
        ArrayList<Integer> allQuizzes = new ArrayList<>();
        for (Student student : students) {
            allQuizzes.addAll(student.quizzes);
        }
        Collections.sort(allQuizzes);
        System.out.println("Sorted quiz scores: " + allQuizzes);
    }

    public void printPartTimeStudents() {
        System.out.print("Part-time students: ");
        for (Student student : students) {
            if (student instanceof PartTime) {
                System.out.print(student.name + ", ");
            }
        }
        System.out.println();
    }

    public void printFullTimeExams() {
        for (Student student : students) {
            if (student instanceof FullTime) {
                FullTime fullTimeStudent = (FullTime) student;
                System.out.println("Exam scores for " + fullTimeStudent.name + ": " + fullTimeStudent.exam1 + ", " + fullTimeStudent.exam2);
            }
        }
    }
}