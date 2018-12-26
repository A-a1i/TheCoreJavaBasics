package ObjMarker;

public class Marker {
	float length=10;
	float width=15;
	String color="red";
	 void write()
	 {
		 System.out.println("hello");
	 }
	 public static void main (String args[])
	 {
		 Marker m=new Marker();
		 float f=m.width;
		 float k=m.length;
		 String g=m.color;
		 m.write();
		 System.out.println("f");
	 }

}
