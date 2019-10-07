package Apple;
import Test.*;

public class AppleFac extends FruFac
{
	public Fru getFru(){
		return new AppleFru();
	}
}