import java.util.Random;
import java.util.Scanner;
class Conversation implements Chatbot {

  // Attributes 
  String[] transcript ;
  String[] responses = {"Okay", "Wow!", "That's interesting."};
  /**
   * Constructor 
   */
  Conversation() {  
  }

  /**
   * Starts and runs the conversation with the user
   */
  public void chat() {
    Scanner input = new Scanner(System.in);
    int rounds;
    String words;
    String response;
    
    System.out.println("How many rounds of conversation?");
    rounds = input.nextInt();
    transcript = new String[rounds*2];
    System.out.println(input.nextLine());
    System.out.println("Hi! I am a bot! Tell me something!");
    for (int i = 0; i < rounds*2; i++) {
      words = input.nextLine();
      transcript[i] = words;
      response = respond(words);
      System.out.println(response);
      transcript[i+1] = response;
      i++;
    }
  System.out.println("Goodbye!");


  }

  /**
   * Prints transcript of conversation
   */
  public void printTranscript() { 
    System.out.println("TRANSCRIPT:");  
    for (int idx = 0; idx < transcript.length; idx++) {
      Object elem = transcript[idx];
      System.out.println(elem); }
    }

  

  /**
   * Gives appropriate response (mirrored or canned) to user input
   * @param inputString the users last line of input
   * @return mirrored or canned response to user input  
   */
  public String respond(String inputString) {
    String returnString;
    
    if (inputString.contains(" you ")||inputString.contains(" you.")){
      returnString = inputString.replaceAll("you", "I");
      returnString = returnString.concat("?");
    }else if (inputString.contains("I ")||inputString.contains("I.")){
      returnString = inputString.replaceAll("I", "you ");
      returnString = returnString.concat("?");
    } else if (inputString.contains("You ")) {
      returnString = inputString.replaceAll("You", "I");
      returnString = returnString.concat("?");
    }  else if (inputString.contains(" me ")||inputString.contains(" me.")) {
      returnString = inputString.replaceAll("me", "you");
      returnString = returnString.concat("?");
    }  else if (inputString.contains(" am ")||inputString.contains(" am.")) {
      returnString = inputString.replaceAll("am", "are");
      returnString = returnString.concat("?");
    } else if (inputString.contains("I'm")) {
      returnString = inputString.replaceAll("I'm", "you're");
      returnString = returnString.concat("?");
    }else if (inputString.contains(" my ")||inputString.contains("my.")){
      returnString = inputString.replaceAll("my", "your");
      returnString = returnString.concat("?");
    } else if (inputString.contains(" your ")) {
      returnString = inputString.replaceAll("your", "my");
      returnString = returnString.concat("?");
    }
    else {
      Random random = new Random();
      returnString = responses[random.nextInt(2)];

    }
     
    return returnString; 
  }

  public static void main(String[] arguments) {

    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}
