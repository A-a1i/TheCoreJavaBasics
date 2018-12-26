package arrayprograms;

import java.util.Scanner;

public class BookDetails {
	public static void main(String args[])
	{
		int q,count=0;
	//	Book book=new Book(); 
		Book b[]=new Book[10];
		Scanner sc= new Scanner(System.in);
		do
		{
			System.out.println("enter choice 1.Add:2.update:3.remover:4.search:5.get details:6.exit");
			q=sc.nextInt();
			switch(q)
			{
			case 1:
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("name");
				String name=sc.next();
				System.out.println("publication");
				String publication=sc.next();
				System.out.println("price");
				int price =sc.nextInt();
				System.out.println("quantity");
				int quantity =sc.nextInt();
				System.out.println("description");
				String description=sc.next();

				b[count]=new Book(id, name, publication,price,quantity,description);
				count++;
				break;

			case 2:
				System.out.println("enter id");
				id=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(id==b[i].getId())
					{Book book=new Book(); 
					
						System.out.println("name");
						name=sc.next();
						b[i].setName(name);


						System.out.println("publication");
						publication=sc.next();
						b[i].setPublication(publication);
						System.out.println("price");
						price =sc.nextInt();
						b[i].setPrice(price);
						System.out.println("quantity");
						quantity =sc.nextInt();
						b[i].setQuantity(quantity);
						System.out.println("description");
						description=sc.next();
						b[i].setDescription(description);

					}
				}
				break;
			case 3:
				System.out.println("enter id");
				id=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(id==b[i].getId())
				{
						b[i]=null;
					
				}	
				}		
					
				


				break;
			case 4:
				System.out.println("enter id");
				id=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(id==b[i].getId())
					{
						System.out.println(b[i]);
					}
				}
					

				break;
			case 5:
				for(int i=0;i<count;i++)
				{
					System.out.println(b[i]);
				}
				

				

				break;
			case 6:
				System.out.println("thanks for visiting");
				System.exit(0);
				default:System.out.println("sorry");
			}	

		}while(q>0);
	}
}







