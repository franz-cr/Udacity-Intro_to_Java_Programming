// You are going to add a true/false type question to the question hierachy. Call it
// TrueFalseQuestion
//
// When the quiz is displayed, we want this text to preceed the question.
//     Answer True or False: question here
// We want the "Answer True or False: " to be prepended automatically.
// So if the user sets the text of the question to "Albert Einstein was the inventer of Java."
// the question will be displayed to the user like this
//      Answer True or False: Albert Einstein was the inventer of Java.
//
// Capitalization should not matter when determining if the answer is correct. Also t for true
// and f for false should be accepted.
//
// You will need to override three methods although not everyone will override the
// exact same three methods
//
// You will not need to add instance variables
//
//For the draft, make the changes necessary to prepend the question submitted bu the user with
//    Answer True or False:
//
public class TrueFalseQuestion extends Question {
    // Instance Variables:
    String answer = ""; 
    
    // TODO: for the draft, override the appropriate method(s) to present the question as specified 
    // TODO: for the final, override the necessay  method(s) all valid answers as specified
    public void TrueFalseQuestion () {
        super.setText("");
        super.setAnswer("");
    }
    
    /**
       Sets the answer for this question.
       @param correctResponse the answer
    */
    public void setAnswer(String correctResponse) {
        this.answer = correctResponse.toLowerCase();
    }
    
    /**
       Checks a given response for correctness.
       @param response the response to check
       @return true if the response was correct, false otherwise
    */
    public boolean checkAnswer(String response) {
        response = response.toLowerCase();

        if (response.equals("t") && this.answer.equals("true"))
            return true;
        else if (response.equals("f") && this.answer.equals("false"))
            return true;
        else
            return response.equals(this.answer);
    }
    
    public void display() {
        System.out.print("Answer True or False: ");
        super.display();
    }
}
