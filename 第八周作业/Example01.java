public class Example01{
	public static void main(String[] args){
		MyThread myThread=new MyThread(); //创建MyThread实例对象
		myThread.run();                   //调用MyThread类的run()方法
		while(true){
			System.out.println("Main方法在运行");
		}
	}
}
class MyThread{
	public void run(){
		while (true){
			System.out.println("MyThread类的run()方法正在运行");
		}
	}
}