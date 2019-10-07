package Orange;
import Test.*;

public class OrangeFac extends FruFac
{
	public Fru getFru(){
		return new OrangeFru();
	}
}