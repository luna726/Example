//定义People1类实现Runnable接口
class People1 implements Runnable{
	private int people=100;
	public void run(){
		while(true){
			salePeople();           //调用接客方法
			if(people<=0){
				break;
			}
		}
	}
	//定义一个同步方法salePeople()
	private synchronized void salePeople(){
		if(people>0){
			try{
				Thread.sleep(100);   //经过的线程休眠100毫秒    
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"---乘坐的乘客"
			         +people--);
		}
	}
}
public class Person{
	public static void main(String[] args){
		People1 people=new People1();   //创建People1对象
		//创建并开启五个线程
		new Thread(people,"出租车一").start();
		new Thread(people,"出租车二").start();
		new Thread(people,"出租车三").start();
		new Thread(people,"出租车四").start();
		new Thread(people,"出租车五").start();
	}
}