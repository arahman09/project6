package Inheritance;
import javax.swing.JOptionPane;


public class TestFinalExam{

    public static void main (String [] args) {

        String input;
        int numOfQuestion;
        int numOfMissedQuestion;

        input = JOptionPane.showInputDialog("How Many Question are on The Final Exam");
        numOfQuestion= Integer.parseInt(input);

        input = JOptionPane.showInputDialog(" How Many Question Did Student Missed");
        numOfMissedQuestion =Integer.parseInt(input);

        FinalExam exam = new FinalExam(numOfQuestion, numOfMissedQuestion);
        JOptionPane.showMessageDialog(null,"Each Questions Counts: " + exam.getPointOfEachQuestion()+ "Points"+ "\n" +"The Exam Score is: " +
                exam.getScore()+"\n "+ "Exam Grade is: "+ exam.getLetterGrade());

        System.exit(0);


    }

}
