public class FactoryMethod {
	public static void main(String[] args) {
		FruFac af=new AppleFac();
		Fru f=af.getFru();
		f.eat();
		af=new OrangeFac();
		f=af.getFru();
		f.eat();
		}
}
abstract class Fru{
	String name;
	public abstract void eat();
} 
class AppleFru extends Fru{
	public AppleFru(){
		name="apple";
	} 	
	public void eat() {
		System.out.println("水果："+name);
	}
} 
class OrangeFru extends Fru{
	public OrangeFru(){
		name="orange";
	}
	public void eat() {
		System.out.println("水果："+name);
	}
} 
abstract class FruFac{
	public FruFac(){
		System.out.println("what fruit:"+getFru());
	}
	public abstract Fru getFru();
} 
class AppleFac extends FruFac{ 
	public Fru getFru() {
		return new AppleFru();
	}	
} 
class OrangeFac extends FruFac{
		public Fru getFru() {
		return new OrangeFru();
	}
}