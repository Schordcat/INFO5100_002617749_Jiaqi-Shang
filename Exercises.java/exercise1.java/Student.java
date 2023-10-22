import java.util.ArrayList;
import java.util.Collections;

class Student {
    String name;
    ArrayList<Integer> quizzes;

    public Student(String name) {
        this.name = name;
        this.quizzes = new ArrayList<>(Collections.nCopies(15, 0));
    }
}

class PartTime extends Student {
    public PartTime(String name) {
        super(name);
    }
}

class FullTime extends Student {
    int exam1;
    int exam2;

    public FullTime(String name) {
        super(name);
        this.exam1 = 0;
        this.exam2 = 0;
    }
}