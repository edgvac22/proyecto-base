package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SearchCoursePage;

public class Answer implements Question<Boolean> {

    public Answer(String question) {
        thisgiit.question = question;
    }

    public static String toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if(question.equals(nameCourse)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
