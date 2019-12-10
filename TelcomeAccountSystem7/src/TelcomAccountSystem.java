
public class TelcomAccountSystem {
     public static void main(String[] args) {
    	 TelcomUser telcomUser = new TelcomUser("15515155352");
    	 
    	 telcomUser.generateCommunicationRecord();
    	 
    	 telcomUser.printDetails();
    	 telcomUser.printCallToAndFee();
     }
}
