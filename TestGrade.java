package Inheritance;
import javax.swing.JOptionPane;

public class TestGrade {

    public static void main (String [] args) {

        String input;
        double testScore;

        GradeActivity grade = new GradeActivity();
        input = JOptionPane.showInputDialog("Enter a Numeric Test Score Out of 100");
        testScore= Double.parseDouble(input);
        grade.setScore(testScore);
        JOptionPane.showMessageDialog(null, "The Grade for The Test Is: "+ grade.getLetterGrade());

        System.exit(0);

    }


}
