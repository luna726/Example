import Apple.*;
import Orange.*;
import Test.*;
public class FactoryMethod
{
	public static void main(String[] args){
		FruFac af=new AppleFac();
		Fru f=af.getFru();
		f.eat();
		af=new OrangeFac();
		f=af.getFru();
		f.eat();
	}
}