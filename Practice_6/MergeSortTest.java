package Practice_6;

public class MergeSortTest {
    public static void main(String[] args) {
        Student[] students1 = new Student[]{
                new Student(133, 38),
                new Student(127, 45),
                new Student(159, 99),
                new Student(118, 74)
        };

        Student[] students2 = new Student[]{
                new Student(185, 41),
                new Student(164, 26),
                new Student(113, 32),
                new Student(119, 83)
        };

        System.out.println("Unsorted array 1:");
        for (Student s: students1) {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("Unsorted array 2:");
        for (Student s: students2) {
            System.out.println(s);
        }
        System.out.println();

        Student[] allStudents = new Student[students1.length + students2.length];

        System.arraycopy(students1, 0, allStudents,0,students1.length);
        System.arraycopy(students2, 0, allStudents, students1.length, students2.length);

        MergeSort s = new MergeSort(allStudents);

        s.mergeSort();

        System.out.println("Merged and sorted by id array:");
        for (Student i: s.getStudents()) {
            System.out.println(i);
        }
    }
}