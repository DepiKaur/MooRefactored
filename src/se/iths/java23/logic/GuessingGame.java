package se.iths.java23.logic;

/**
 * @author Depinder Kaur
 * @date 2024-01-23
 * @version 1.0
 * <p>
 * <h2>GuessingGame</h2>
 * GuessingGame is the interface which provides certain rules for playing a guessing game.
 */

public interface GuessingGame {

    String generateNumberOrWord();
    String showResult(GuessEvaluation guessEvaluation);
    GuessEvaluation checkResult(String number, String guess);
    boolean isFinished(String result);
    int getNumOfGuesses();
}
