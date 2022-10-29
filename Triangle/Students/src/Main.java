
public class Main {

    public static void main(String[] args) {
        // CR student that knows all marks
        Students CR = new Students(25, 20);
        Students student1 = new Students(26, CR.calcMarks());
        Students student2 = new Students(27, CR.calcMarks());
        Students student3 = new Students(28, CR.calcMarks());
        Students student4 = new Students(29, CR.calcMarks());
        Students student5 = new Students(30, CR.calcMarks());
        Students[] studentsArr = {student1,student2,student3,student4,student5};
        // loop over students array
        for(int i = 0; i<studentsArr.length; i++) {
            System.out.println("Roll no: " + studentsArr[i].roll_no + " Average Marks: " + studentsArr[i].avgMarks);
        }

    }
}
