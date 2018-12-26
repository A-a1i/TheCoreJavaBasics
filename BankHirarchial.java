package InheritanceProg;
class RBI{
	 void interest()
	 {
		 System.out.println("10%");
	 }
	 void account_no()
	 {
		 System.out.println("1125448644");
	 }
 }
	 class HDFC extends RBI{
		 void interest()
		 {
			 System.out.println("10.5%");
		 }
		 void accountholdername()
		 {
			 System.out.println("ali");
		 }
	 }
	public class BankHirarchial extends RBI{
		 void interest()
		 {
			 System.out.println("11%");
		 }
		 void currentacc()
		 {
			 System.out.println("saving");
		 }
	
	 public static void main(String args[]){
		BankHirarchial s = new BankHirarchial();
		s.interest();
		HDFC d = new HDFC();
		d.accountholdername();
	 }	
	 }
