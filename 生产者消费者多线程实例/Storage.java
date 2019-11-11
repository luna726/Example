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
			System.out.println("第"+intPos+"位用户"+cells[intPos]+"正在登陆");
			intPos++;
			if(intPos==cells.length){
				intPos=0;
			}
			count++;
			System.out.println("现在共有"+count+"位用户---处于在线状态");
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
			System.out.println("第"+outPos+"位用户"+cells[outPos]+"正在注销");
			cells[outPos]=yongHu;
			outPos++;
			if(outPos==cells.length){
				outPos=0;
			}
			System.out.println("现在共有"+count+"位用户---处于在线状态");
			Thread.sleep(sleepSecond);
			this.notify();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}