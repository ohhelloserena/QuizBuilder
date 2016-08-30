package ca.ubc.cpsc210.quizbuilder.model.question;

/**
 * Created by serenachen on 2/25/16.
 */
public class MultiplicationQuestion extends Question {

    private int correctAnswer;

    public MultiplicationQuestion(double maxMark, int factor1, int factor2) {
        super(maxMark, (Integer.toString(factor1) + " * " + Integer.toString(factor2) + " = ???"));
        calculateAnswer(factor1, factor2);
    }

    public int calculateAnswer(int factor1, int factor2) {
        correctAnswer = factor1 * factor2;
        return correctAnswer;
    }

    @Override
    public boolean isCorrect(String answer) {
        try {
            int answerI = Integer.parseInt(answer);
            if (answerI == correctAnswer) {
                return true;
            }
            return false;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
