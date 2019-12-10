/*import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
class TelcomUser{
	private String phoneNumber;
	private String callTo;
	private Vector communicationRecords;
	private ArrayList callToNumbers;
	public TelcomUser(String phoneNumber) {
		this.phoneNumber=phoneNumber;
		this.communicationRecords= new Vector();
		this.callToNumbers=new ArrayList();
	}
	//模拟通话记录的生成
	void generateCommunicateRecord() {
		//随机生成通话记录数目
		int recordNum = new Random().nextInt(10);
		for(int i = 0;i<= recordNum; i++) {
			//随机生成第i条通话记录
			//用Calendar获取当前时间
			Calendar cal = Calendar.getInstance();
			//随即减去若干小时（10小时以内）
			cal.add(Calendar.HOUR, - new Random().nextInt(600000));
			//获取对应毫秒
			long timeStart = cal.getTimeInMillis();
			//结束时间开始后的十秒内随机的一个时间，至少一分钟
			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
			//被叫号码
			this.callTo = getCallToPhoneNumber();
			this.callToNumbers.add(this.callTo);
			//插入通话记录
			this.communicationRecords.add(this.phoneNumber +
					","+timeStart+
					","+timeEnd+
					","+this.callTo);
		}
	}
	public String getCallToPhoneNumber() {
		return "1346043477" + String.valueOf(new Random().nextInt(10));
	}
    //模拟计费方法，以字符串的形式返回保留4位小数的计费结果
	public String accountFee(long timeStart,long timeEnd) {
		//每分钟收费*元
		double feePerMinute=0.2;
		//通话分钟数按四舍五入计算
		int minutes=Math.round((timeEnd-timeStart)/60000);
		double feeTotal=feePerMinute*minutes;
		return String.format("%.4f",feeTotal);
	}
    //打印通话记录
    void printDetails() {
    	//获取记录数目，即communicationRecords集合中的元素个数
    	int arrayListSize = this.communicationRecords.size();
    	for(int i = 0;i < arrayListSize - 1; i++) {
    		System.out.println("--------通话记录分割线--------");
		    String [] recordField = ((String) this.communicationRecords.get(i)).split(",");
		    System.out.println("主叫："+recordField[0]);
		    System.out.println("被叫："+recordField[3]);
		    Date timeStart = new Date(Long.parseLong(recordField[1]));
		    Date timeEnd = new Date(Long.parseLong(recordField[2]));
		    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
		
		    //SimpleDateFormat
		    System.out.println("通话开始时间：" + simpleDateFormat.format(timeStart));
		    System.out.println("通话结束时间：" + simpleDateFormat.format(timeEnd));
		 
		    System.out.println("计费："
				    + accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
				    +"元。");
		    }
    	}*/
/*import java.text.DateFormat;
    import java.text.SimpleDateFormat;
    import java.util.*;
    class TelcomUser{
    	private String phoneNumber;
    	private String callTo;
    	private Vector communicationRecords;
    	private HashSet callToNumbers;
    	public TelcomUser(String phoneNumber) {
    		this.phoneNumber=phoneNumber;
    		this.communicationRecords= new Vector();
    		this.callToNumbers=new HashSet();
    	}
    	//模拟通话记录的生成
    	void generateCommunicateRecord() {
    		//随机生成通话记录数目
    		int recordNum = new Random().nextInt(10);
    		for(int i = 0;i<= recordNum; i++) {
    			//随机生成第i条通话记录
    			//用Calendar获取当前时间
    			Calendar cal = Calendar.getInstance();
    			//随即减去若干小时（10小时以内）
    			cal.add(Calendar.HOUR, - new Random().nextInt(600000));
    			//获取对应毫秒
    			long timeStart = cal.getTimeInMillis();
    			//结束时间开始后的十秒内随机的一个时间，至少一分钟
    			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
    			//被叫号码
    			this.callTo = getCallToPhoneNumber();
    			this.callToNumbers.add(this.callTo);
    			//插入通话记录
    			this.communicationRecords.add(this.phoneNumber +
    					","+timeStart+
    					","+timeEnd+
    					","+this.callTo);
    		}
    	}
    	public String getCallToPhoneNumber() {
    		return "1346043477" + String.valueOf(new Random().nextInt(10));
    	}
        //模拟计费方法，以字符串的形式返回保留4位小数的计费结果
    	public String accountFee(long timeStart,long timeEnd) {
    		//每分钟收费*元
    		double feePerMinute=0.2;
    		//通话分钟数按四舍五入计算
    		int minutes=Math.round((timeEnd-timeStart)/60000);
    		double feeTotal=feePerMinute*minutes;
    		return String.format("%.4f",feeTotal);
    	}
        //打印通话记录
        void printDetails() {
        	//获取记录数目，即communicationRecords集合中的元素个数
        	int arrayListSize = this.communicationRecords.size();
        	for(int i = 0;i < arrayListSize - 1; i++) {
        		System.out.println("--------通话记录分割线--------");
    		    String [] recordField = ((String) this.communicationRecords.get(i)).split(",");
    		    System.out.println("主叫："+recordField[0]);
    		    System.out.println("被叫："+recordField[3]);
    		    Date timeStart = new Date(Long.parseLong(recordField[1]));
    		    Date timeEnd = new Date(Long.parseLong(recordField[2]));
    		    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/年MM月dd日 hh时mm分ss秒");
    		
    		    //SimpleDateFormat
    		    System.out.println("通话开始时间：" + simpleDateFormat.format(timeStart));
    		    System.out.println("通话结束时间：" + simpleDateFormat.format(timeEnd));
    		 
    		    System.out.println("计费："
    				    + accountFee(Long.parseLong(recordField[1]),Long.parseLong(recordField[2]))
    				    +"元。");
    		    }
        	}
    }*/
    import java.text.DateFormat;
    import java.text.SimpleDateFormat;
    import java.util.*;
    class TelcomUser{
    	private String phoneNumber;
    	private String callTo;
    	private ArrayList communicationRecords;
    	private HashMap singleRecord;
		private Object callToNumbers;
		private HashMap treeMapCallToAndFee;
		private TreeMap Interator;
    	public TelcomUser(String phoneNumber) {
    		this.phoneNumber=phoneNumber;
    		this.communicationRecords= new ArrayList();
    		
    		}
    	
    	//模拟通话记录的生成
    	void generateCommunicateRecord() {
    		//随机生成通话记录数目
    		int recordNum = new Random().nextInt(10);
    		for(int i = 0;i<= recordNum; i++) {
    			//随机生成第i条通话记录
    			//用Calendar获取当前时间
    			//Calendar cal = Calendar.getInstance();
    			//随即减去若干小时（10小时以内）
    			//cal.add(Calendar.HOUR, - new Random().nextInt(600000));
    			//获取对应毫秒
    			long timeStart = System.currentTimeMillis()-new Random().nextInt(36000000);
    			//long timeStart = cal.getTimeInMillis();
    			//结束时间开始后的十秒内随机的一个时间，至少一分钟
    			long timeEnd = timeStart + 60000 + new Random().nextInt(600000);
    			//被叫号码
    			this.callTo = getCallToPhoneNumber();
    			
    			//插入通话记录
    			this.singleRecord = new HashMap();
    			this.singleRecord.put("主叫", this.phoneNumber);
    			this.singleRecord.put("开始时间", new Date(timeStart));
    			this.singleRecord.put("结束时间", new Date(timeEnd));
    			this.singleRecord.put("被叫号码", this.callTo);
    			this.singleRecord.put("计费", this.accountFee(timeStart, timeEnd));
    			this.communicationRecords.add(this.singleRecord);
    			
    			this.treeMapCallToAndFee.put(this.callTo, this.accountFee(timeStart, timeEnd));
    		}
    	}
    	public String getCallToPhoneNumber() {
    		return "1346043477" + String.valueOf(new Random().nextInt(10));
    	}
    	
        //模拟计费方法，以字符串的形式返回保留4位小数的计费结果
    	public String accountFee(long timeStart,long timeEnd) {
    		//每分钟收费*元
    		double feePerMinute=0.2;
    		//通话分钟数按四舍五入计算
    		int minutes=Math.round((timeEnd-timeStart)/60000);
    		double feeTotal=feePerMinute*minutes;
    		return String.format("%.4f",feeTotal);
    	}
        //打印通话记录
    	void printCallToAndFee() {
    		Iterator it = this.treeMapCallToAndFee.entrySet().iterator();
    		while(it.hasNext()) {
    			Map.Entry entry = (Map.Entry) it.next();
    			System.out.println(entry.getKey()+":"+entry.getValue());
    		}
    	}
    	
        //void printDetails() {
        	/*
        	 * 使用ArrayList接口遍历。注意应将communicationRecords定义为ArrayList
        	 * 遍历打印每个通话、计费记录（HashMap对象）
        	 */
        	/*Iterator itRecords = this.communicationRecords.iterator();
        	while(itRecords.hasNext()) {
        		System.out.println("--------通话记录分割线--------");
        		this.singleRecord = ((HashMap)itRecords.next());
        		Set keySet = this.singleRecord.keySet();
        		Iterator itKey = keySet.iterator();
        		while(itKey.hasNext()) {
        			Object key = itKey.next();
        			Object value = this.singleRecord.get(key);
        			System.out.println(key + ":" + value);
        		}
        	
        	}
        }*/
    	//打印通话记录
        //void printDetails() {
        	/*
        	 * 使用ArrayList接口遍历。注意应将communicationRecords定义为ArrayList
        	 * 遍历打印每个通话、计费记录（HashMap对象）
        	 */
        	
        	/*
        	 * 使用entrySet遍历通话记录
        	 */
        	/*Iterator itRecords = this.communicationRecords.iterator();
        	while(itRecords.hasNext()) {
        		System.out.println("--------通话记录分割线--------");
        		this.singleRecord = ((HashMap)itRecords.next());
        		Set entrySet = this.singleRecord.entrySet();
        		Iterator itEntry = entrySet.iterator();
        		while(itEntry.hasNext()) {
        			Map.Entry entry = (Map.Entry)itEntry.next();
        			Object key = entry.getKey();
        			Object value = entry.getValue();
        			System.out.println(key + ":" + value);
        		}
        	
        	}
        }*/
}