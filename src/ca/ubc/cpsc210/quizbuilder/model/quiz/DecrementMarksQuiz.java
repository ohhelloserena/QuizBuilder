package ca.ubc.cpsc210.quizbuilder.model.quiz;

import ca.ubc.cpsc210.quizbuilder.model.exceptions.OutOfTriesException;
import ca.ubc.cpsc210.quizbuilder.model.exceptions.RetryAnswerException;
import ca.ubc.cpsc210.quizbuilder.model.questionslist.QuestionsList;

/**
 * Created by serenachen on 2/29/16.
 */
public class DecrementMarksQuiz extends EachAnswerMustBeRightQuiz{

    int markSoFar;

    public DecrementMarksQuiz(QuestionsList questions) {
        super(questions);
    }


    @Override
    public String submitAnswer(String answer) throws RetryAnswerException, OutOfTriesException {
        boolean correct = super.checkAnswer(answer);
          if (!correct) {
            if (curQuestion.getMaxMark() > 1) {
                curQuestion.setMaxMark(curQuestion.getMaxMark() - 1);
                throw new RetryAnswerException("Wrong answer, please retry.");
            }

        }
        if (curQuestion.getMaxMark() == 1) {
            throw new OutOfTriesException("You're out of tries.");
        }

        return "";
    }



}
