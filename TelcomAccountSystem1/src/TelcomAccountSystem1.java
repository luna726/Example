public class TelcomAccountSystem1 {
	public static void main(String[] args) {
		
		TelcomUser telcomuser =new TelcomUser("15515155352");
		//生成通话记录
		telcomuser.createCommunicateRecord();
		//打印通话详单
		telcomuser.printDetails();
	}

}
