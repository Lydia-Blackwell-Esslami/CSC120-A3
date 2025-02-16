import java.util.Scanner;

class Conversation implements Chatbot {

  // Attributes 
  String[] transcript ;
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
    
    System.out.println("How many rounds of conversation?");
    rounds = input.nextInt();
    transcript = new String[rounds];
    System.out.println(input.nextLine());
    System.out.println("Hi! I am a bot! Tell me something!");
    for (int i = 0; i < rounds; i++) {
      words = input.nextLine();
      transcript[i] = words;
      System.out.println("Okay");
    }
    



  }

  /**
   * Prints transcript of conversation
   */
  public void printTranscript() {   
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
    String returnString = ""; 
    return returnString; 
  }

  public static void main(String[] arguments) {

    Conversation myConversation = new Conversation();
    myConversation.chat();
    myConversation.printTranscript();

  }
}
