import java.util.ArrayList;

public class Student {
    private String name;
    private long id;

    private ArrayList<Integer> gradeLists;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // returns the student's id
    public long getId(){
        return id;
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        gradeLists.add(90);
        gradeLists.add(89);
        gradeLists.add(99);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return gradeLists;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (int grade : gradeLists) {
            sum += grade;
        }
        double average = sum / gradeLists.size();
        return average;

    }
}
