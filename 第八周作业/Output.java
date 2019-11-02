class Output implements Runnable //输出线程类
{
	private Storage st;
	Output(Storage st){//通过构造方法接收一个Storage对象
		this.st=st;        
	}
	public void run(){
		while (true)
		{
			st.get();         //循环取出元素
		}
	}
}