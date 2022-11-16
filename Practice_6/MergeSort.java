package Practice_6;

import java.util.Vector;

public class MergeSort {
    private Vector<Student> students = new Vector<>();
    private int length;
    private int middle;

    MergeSort(Student[] students) {
        int i;

        for (i = 0; i < students.length; i++) {
            this.students.addElement(students[i]);
        }

        length = students.length;
    }

    public void mergeSort() {
        if (length < 2) {
            return;
        }

        middle = length / 2;

        Student[] l = new Student[middle];
        Student[] r = new Student[length - middle];

        System.arraycopy(students.toArray(), 0, l, 0, middle);
        System.arraycopy(students.toArray(), middle, r, 0, length - middle);

        MergeSort left = new MergeSort(l);
        MergeSort right = new MergeSort(r);

        left.mergeSort();
        right.mergeSort();

        merge(left.students.toArray(Student[]::new), right.students.toArray(Student[]::new));
    }

    private void merge(Student[] l, Student[] r) {
        int i = 0, j = 0, k = 0;
        int left = middle;
        int right = length - middle;

        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                students.set(k++, l[i++]);

            } else {
                students.set(k++, r[j++]);
            }
        }

        while (i < left) {
            students.set(k++, l[i++]);
        }

        while (j < right) {
            students.set(k++, r[j++]);
        }
    }

    public Vector<Student> getStudents() {
        return students;
    }
}
