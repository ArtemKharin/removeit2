package ua.kharin.hw3;

////Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
//// Создайте массив из десяти элементов такого типа.
//// Добавьте возможность вывода фамилии и номеров групп студентов, имеющих оценки, равные только 9 и 10.
public class Student {
    public String lastName;
    public String firstName;
    public String group;
    public int[] marks;

    public Student(String lastName, String firstName, String group, int[] marks) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
        this.marks = marks;
    }

    public String getBaseInfo() {
        return lastName + " : " + group;
    }

    public double getAvgMark() {
        double sum = 0;
        for (int number : marks) {
            sum += number;
        }
        return sum / marks.length;
    }

    public static void printStudentsConditionally(Student[] students) {
        for (Student student : students) {
            if (student.getAvgMark() >= 9) {
                System.out.println(student.getBaseInfo());
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("A", "A", "CS-1", new int[]{9, 9, 9, 10, 9});
        students[1] = new Student("B", "B", "CS-1", new int[]{1, 1, 1, 1, 1});
        students[2] = new Student("C", "A", "CS-2", new int[]{9, 9, 9, 8, 9});
        students[3] = new Student("D", "A", "CS-2", new int[]{9, 9, 9, 9, 9});
        students[4] = new Student("E", "A", "CS-3", new int[]{9, 10, 10, 10, 9});
        students[5] = new Student("F", "A", "CS-3", new int[]{3, 9, 2, 10, 9});
        students[6] = new Student("G", "A", "CS-3", new int[]{1, 9, 9, 10, 9});
        students[7] = new Student("H", "A", "CS-3", new int[]{9, 9, 1, 10, 9});
        students[8] = new Student("I", "A", "CS-3", new int[]{9, 9, 9, 10, 10});
        students[9] = new Student("J", "A", "CS-3", new int[]{10, 9, 9, 10, 9});
        printStudentsConditionally(students);
    }
}
