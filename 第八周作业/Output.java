class Output implements Runnable //����߳���
{
	private Storage st;
	Output(Storage st){//ͨ�����췽������һ��Storage����
		this.st=st;        
	}
	public void run(){
		while (true)
		{
			st.get();         //ѭ��ȡ��Ԫ��
		}
	}
}