class YouThread extends Thread{
	public YouThread(String name) {
		super(name);
		
	}
	public void run() {
		System.out.println(this.getName());
	}
}
public class Demo3{
	public static void main(String args[]) {
		new YouThread("THread1").start();
		new YouThread("THread2").start();
	}
}
