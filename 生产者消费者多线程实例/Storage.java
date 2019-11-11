public class Storage {
	private String[] cells=new String[101];
	private int intPos=1,outPos=1;
	private int count;
	public synchronized void put(int num,int sleepSecond){
		try{
			while(count==cells.length){
				this.wait();
			}
			cells[intPos]=String.valueOf(num);
			System.out.println("��"+intPos+"λ�û�"+cells[intPos]+"���ڵ�½");
			intPos++;
			if(intPos==cells.length){
				intPos=0;
			}
			count++;
			System.out.println("���ڹ���"+count+"λ�û�---��������״̬");
			Thread.sleep(sleepSecond);
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public synchronized void get(int sleepSecond){
		try{
			while(count==0){
				this.wait();
			}
			String yongHu="a";
			System.out.println("��"+outPos+"λ�û�"+cells[outPos]+"����ע��");
			cells[outPos]=yongHu;
			outPos++;
			if(outPos==cells.length){
				outPos=0;
			}
			System.out.println("���ڹ���"+count+"λ�û�---��������״̬");
			Thread.sleep(sleepSecond);
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}