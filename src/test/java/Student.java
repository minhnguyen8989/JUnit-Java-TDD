import java.util.ArrayList;

public class Student {
    private String name;
    private long id;

    private ArrayList<Integer> gradeLists;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.gradeLists = new ArrayList<Integer>();
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
        gradeLists.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return gradeLists;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (int grade : getGrades()) {
            sum += grade;
        }
        double average = sum / getGrades().size();
        return average;

    }

    public void updateGrade(int index, int newGrade) {
        if (index >= 0 && index < this.gradeLists.size()){
            this.gradeLists.set(index, newGrade);
        }
    }

    public void deleteGrade(int index){
        if (index >= 0 && index < this.gradeLists.size()){
            this.gradeLists.remove(index);
        }
    }

}