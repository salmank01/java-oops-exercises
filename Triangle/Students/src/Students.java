import java.util.Scanner;

public class Students {
    int roll_no;
    int avgMarks;

    Students(int roll_no, int avgMarks) {
        this.roll_no = roll_no;
        this.avgMarks = avgMarks;
    }

    int calcMarks() {
        Scanner input = new Scanner(System.in);
        int marks = 0;
        for(int i = 1; i<=3; i++) {
            System.out.println("Marks for subject "+i+": " );
            marks += input.nextInt();
        }
        return marks/2;
    }
}
