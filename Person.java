//����People1��ʵ��Runnable�ӿ�
class People1 implements Runnable{
	private int people=100;
	public void run(){
		while(true){
			salePeople();           //���ýӿͷ���
			if(people<=0){
				break;
			}
		}
	}
	//����һ��ͬ������salePeople()
	private synchronized void salePeople(){
		if(people>0){
			try{
				Thread.sleep(100);   //�������߳�����100����    
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"---�����ĳ˿�"
			         +people--);
		}
	}
}
public class Person{
	public static void main(String[] args){
		People1 people=new People1();   //����People1����
		//��������������߳�
		new Thread(people,"���⳵һ").start();
		new Thread(people,"���⳵��").start();
		new Thread(people,"���⳵��").start();
		new Thread(people,"���⳵��").start();
		new Thread(people,"���⳵��").start();
	}
}