import java.util.Scanner;
public class AvgHeight {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Number of students: ");
        int nStudents = input.nextInt();
        // total heights of students
        int totalHeights = 0;
        for(int i = 1; i<=nStudents; i++) {
            System.out.println("Height of student "+i+" in cm: ");
            int height = input.nextInt();
            totalHeights += height;
        }
        System.out.println("Avg Height of class: "+totalHeights/nStudents);
    }
}
