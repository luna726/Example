public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("1~添加学生信息----------------------");
       add();
       System.out.println("2~删除学生信息----------------------");
       remove();
       System.out.println("3~修改学生信息----------------------");
       alter();
	}
	public static void add() {
		StringBuffer sb=new StringBuffer();
		StringBuffer bt=new StringBuffer();
		sb.append("于璐娜");
		System.out.println("append添加结果："+sb);
	}
	public static void remove() {
		StringBuffer sb=new StringBuffer("yuluna1");
		sb.deleteCharAt(9);
		System.out.println("删除指定位置结果："+sb);
		sb.delete(0,sb.length());
		System.out.println("清除缓冲区结果："+sb);
	}
	public static void alter() {
		StringBuffer sb=new StringBuffer("王璐娜");
		sb.replace(0,1,"于" );
		System.out.println("修改指定位置结果："+sb);
	}

}
