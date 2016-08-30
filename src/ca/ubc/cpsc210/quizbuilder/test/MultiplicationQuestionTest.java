package ca.ubc.cpsc210.quizbuilder.test;

import ca.ubc.cpsc210.quizbuilder.model.question.MultiplicationQuestion;
import ca.ubc.cpsc210.quizbuilder.model.question.Question;
import ca.ubc.cpsc210.quizbuilder.model.questionslist.QuestionsList;
import ca.ubc.cpsc210.quizbuilder.model.quiz.InstantFeedbackQuiz;
import ca.ubc.cpsc210.quizbuilder.model.quiz.Quiz;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationQuestionTest extends QuizBuilderTests {

    private Question q1;
    private QuestionsList qList;
    private Quiz testQuiz;


    @Before
    public void runBefore() {
        q1 = new MultiplicationQuestion(8, 3, 7);
        qList = new QuestionsList();
        qList.addQuestion(q1);
        testQuiz = new InstantFeedbackQuiz(qList);
    }




    @Test
    public void testConstructor() {
        assertEquals("3 * 7 = ??? [8.0 points]", q1.getQuestionString());
    }



}

