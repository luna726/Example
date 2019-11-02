class Teacher implements Runnable{
	private int number=80;
	Object lock=new Object();//同步代码块的锁
	public void run() {
		while (true) {
			synchronized(lock) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(number>0) {
					System.out.println(Thread.currentThread().getName()+"发的作业"+number--);
					
				}
				else {
					break;
				}
			}
			
		}
	}
}
public class Demo2 {
	public static void main(String args[]) {
		Teacher teacher=new Teacher();
		
		new Thread(teacher,"老师一").start();
		new Thread(teacher,"老师二").start();
		new Thread(teacher,"老师三").start();
	}
}
