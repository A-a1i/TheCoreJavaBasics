package InheritanceProg;

 class parentdemo {
	void material()
	{
		System.out.println("call to material");
	}
	void objects()
	{
		System.out.println("objects in materials");
	}
}
public class UpcastingInhrtnc extends parentdemo{
	void collections()
	{
		System.out.println("collection of materials");
	}
	void stored()
	{
		System.out.println("objects stored");
	}

public static void main(String args[])
	{
	parentdemo p = new UpcastingInhrtnc();
	p.material();
	//p.stored(); /*on the base of upcasting we cannot call the child*/
	}
}