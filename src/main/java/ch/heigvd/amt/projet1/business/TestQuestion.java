package ch.heigvd.amt.projet1.business;

import ch.heigvd.amt.projet1.model.Questions;

import java.util.ArrayList;
import java.util.List;

public class TestQuestion {
    public List<Questions> generateQuestions() {
        List<Questions> result = new ArrayList<>();
        result.add(new Questions("Don't cry because it's over, smile because it happened."));
        return result;
    }
}
