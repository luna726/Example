public class SimpleFactory{
	public static void main(String[] args){
		Fruit f=FactoryTest.getInstance().newApple();
		if(f!=null){
			f.eat();
		}
		Fruit o=FactoryTest.getInstance().newOrange();
		if(o!=null){
			o.eat();
		}
	}
}
interface Fruit{
	public void eat();
}
class Apple implements Fruit{
	public void eat(){
		System.out.println("** ��ƻ����");
	}
};
class Orange implements Fruit{
	public void eat(){
		System.out.println("** �����ӡ�");
	}
};
class FactoryTest{//���幤����
	private static FactoryTest factory;
	private FactoryTest(){}
	public static FactoryTest getInstance(){
		if(factory==null){
			factory=new FactoryTest();
		}
		return factory;
	}
	public Apple newApple(){
		return new Apple();
	}
	public Orange newOrange(){
		return new Orange();
	}   
};