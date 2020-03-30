package Inheritance;

public class FinalExam extends GradeActivity {

     int numOfQuestion;
     double pointOfEachQuestion;
     int numOfMissedQuestion;

    // public FinalExam () {}

    public FinalExam (int numOfQuestion, int numOfMissedQuestion) {
        this.numOfQuestion = numOfQuestion;
        this.numOfMissedQuestion = numOfMissedQuestion;

        double numericScore;

        pointOfEachQuestion =100.0 / numOfQuestion;
        numericScore = 100.0 - (pointOfEachQuestion * numOfMissedQuestion);
        setScore(numericScore);

    }

    public double getPointOfEachQuestion () {
        return pointOfEachQuestion;
    }

    public int getNumOfMissedQuestion () {
        return numOfMissedQuestion;

    }


}


