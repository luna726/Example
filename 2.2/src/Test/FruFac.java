package Test;

public abstract class FruFac {
	public FruFac() {
		System.out.println("what fruit:"+getFru());
	}
	public abstract Fru getFru();

}
