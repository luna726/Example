class Teacher implements Runnable{
	private int number=80;
	Object lock=new Object();//ͬ����������
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
					System.out.println(Thread.currentThread().getName()+"������ҵ"+number--);
					
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
		
		new Thread(teacher,"��ʦһ").start();
		new Thread(teacher,"��ʦ��").start();
		new Thread(teacher,"��ʦ��").start();
	}
}
