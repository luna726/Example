public class Example03{
	public static void main(String[] args){
		MyThread myThread=new MyThread();  //创建MyThread的实例对象
		Thread thread=new Thread(MyThread);//创建线程对象
		thread.start();
		while (true){
			System.out.println("main()方法在运行");
		}
	}
}
class MyThread implements Runnable{
	public void run(){    //线程的代码段，当调用start()方法时，线程从此处开始执行
		while (true){
			System.out.println("MyThread类的run()方法在运行");
		}
	}
}