public class Example01{
	public static void main(String[] args){
		MyThread myThread=new MyThread(); //����MyThreadʵ������
		myThread.run();                   //����MyThread���run()����
		while(true){
			System.out.println("Main����������");
		}
	}
}
class MyThread{
	public void run(){
		while (true){
			System.out.println("MyThread���run()������������");
		}
	}
}