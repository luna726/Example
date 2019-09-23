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
		System.out.println("** 吃苹果。");
	}
};
class Orange implements Fruit{
	public void eat(){
		System.out.println("** 吃橘子。");
	}
};
class FactoryTest{//定义工厂类
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