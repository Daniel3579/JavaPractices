package Practice_6;

public class Student implements Comparable {
    private int idNum;
    private int GPA;

    public Student(int idNum, int GPA) {
        this.idNum = idNum;
        this.GPA = GPA;
    }

    public String toString() {
        return "Practice_6.Student{" +
                "idNum=" + idNum +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Student)) {
            throw new IllegalArgumentException("Object doesn't belong Student!");
        }
        return this.idNum - ((Student) o).idNum;
    }
}