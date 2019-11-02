class Storage
{
	//数据存储数组
	private int[] cells=new int[10];
	//inPos表示存入时数组下标，outPos表示取出时数组下标
	private int inPos,outPos;
	//定义一个put()方法向数组中存入数据
	public void put (int num){
		cells[inPos]=num;
		System.out.println("在cells["+inPos+"]中放入数据---"+cells[inPos]);
		inPos++;          //存完元素让位置加1
		if (inPos==cells.length)
		{
			inPos=0;      //当inPos为数组长度时,将其置为0
		}
		//定义一个get()方法从数组中取出数据
		public void get(){
			int data=cells[outPos];
			System.out.println("从cells["+outPos+"]中取出数据"+data);
			outPos++;      //取完元素让位置加1
			if (outPos==cells.length)
				outPos=0;
		}
}