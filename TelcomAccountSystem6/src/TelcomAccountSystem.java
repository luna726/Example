public class TelcomAccountSystem {
	public static void main(String[] args) {
		
		TelcomUser telcomuser =new TelcomUser("15515155352");
		//生成通话记录
		telcomuser.generateCommunicateRecord();
		//打印通话详单
		//telcomuser.printDetails();
		telcomuser.printCallToAndFee();
	}

}
