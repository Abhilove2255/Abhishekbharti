package ElectronicsShop;
import java.util.*;
import java.util.Scanner;

 class ViswakaramShop{
	 private String MobilePhone_name;
		private int MobilePhone_PhoneNo;
		private String MobilePhone_email;
		
	    public String getMobilePhone_name() 
		{
			return MobilePhone_name;
		}
		public void setMobilePhone_name(String mobilePhone_name)
		{
			MobilePhone_name =mobilePhone_name;
		}
		public int getMobilePhone_PhoneNo()
		{
			return MobilePhone_PhoneNo;
		}
		public void setMobilePhone_PhoneNo(int mobilePhone_PhoneNo)
		{
			MobilePhone_PhoneNo = mobilePhone_PhoneNo;
		}
		public String getMobilePhone_email()
		{
			return MobilePhone_email;
		}
		public void setMobilePhone_email(String mobilePhone_email)
		{
			MobilePhone_email = mobilePhone_email;
		}
	 
               public static void main(String[] args) {
				System.out.println("Welcome to JkElectronics");
				            
				               System.out.println("How may Help u");
				           
				               Scanner sc = new Scanner(System.in);
				              System.out.println("Select Choice : 1)MobilePhone 2)TV 3)Fridge 4)WashingMachine" );
				              
				               int Choice=sc.nextInt();
				             
				               switch (Choice) {
							case 1:MobilePhone ref1=  new MobilePhone();
							      ref1.MobilePhone();
								break;
							case 2:Tv ref2 =new Tv();
							     ref2.Tv();
							break;
							case 3:Fridge ref3=new Fridge();
							     ref3.Fridge();
							     break;
							case 4:WashingMachine ref4=new WashingMachine();
							      ref4.WashingMachine();
							break;
							default:System.out.println("Invalid Input");
							}
			}
}
 class MobilePhone extends ViswakaramShop{
	 public static void MobilePhone(){
		   Scanner sc= new Scanner(System.in);
		   System.out.println("Which Type of Phone u want?: ");
		   System.out.println("Select Phone :1)Keypadphone 2)SmartPhone");
		   int Phone =sc.nextInt();
		   System.out.println("lenga kya masst offer hai apni dukan mein");
		   switch(Phone) {
		   case 1:Keypadphone k= new Keypadphone();
		   k.Keypadphone();
		   
			   break;
		   case 2:SmartPhone s=new SmartPhone();
		   s.SmartPhone();
		   }
	 }
 }
 class Keypadphone extends MobilePhone{
	 public static void Keypadphone() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Select Phonetype: 1)Nokia 2)karbon 3)samsung 4)lava");
		 int Phonetype=sc.nextInt();
		 switch (Phonetype) {
		case 1:System.out.println("You Choose The Brand: 1)Nokia");
			Keypadphone1();
			break;
		case 2:System.out.println("You Choose The Brand: 2)karbon");
		   Keypadphone1();
		    break;
		case 3:System.out.println("You Choose The Brand: 3)smasung");
		   Keypadphone1();
		   break;
		case 4:System.out.println("You Choose The Brand: 4)lava");
		Keypadphone1();
		break;
		default:System.out.println("Invalid Choice");	
		}
		
	 }

	private static void Keypadphone1() {
	       Scanner sc=new Scanner (System.in);
	       System.out.println("Enter your Colour : 1)Blue 2)Black 3)Red 4)white");
		    int Colour =sc.nextInt();
		    switch (Colour) {
			case 1:System.out.println("Your Choose Colour: 1)Blue");	
				break;
			case 2:System.out.println("Your Choose Colour: 2)Black");
			break;
			case 3:System.out.println("Your Choose Colour: 3)Red");
			break;
			case 4:System.out.println("Your Choose Colour : 4)white");
           break;
			default:System.out.println("Invalid Choice");	
			}
	try {
	 Keypadphone ref= new Keypadphone();
     Scanner sc1=  new Scanner(System.in);
     System.out.println("Enter name");
		System.out.println("Enter PhoneNo");
		System.out.println("Enter email");
		String choice = sc1.nextLine();
		int choice1 = sc1.nextInt();
		String choice2 = sc1.next();
		ref.setMobilePhone_name(choice);
		ref.setMobilePhone_PhoneNo(choice1);
		ref.setMobilePhone_email(choice2);
		System.out.println("Name"+ref.getMobilePhone_name());
		System.out.println("Phone:"+ref.getMobilePhone_PhoneNo());
		System.out.println("email"+ref.getMobilePhone_email());
		System.out.println("Congratulation your order has been successful");
	}
	catch (Exception e) {
		System.out.println("Congratulation sir vist here again");
	}
	}
  
 }
 class SmartPhone extends MobilePhone{
	 public static void SmartPhone() {
		 System.out.println("Feature Phone");
		                   Scanner sc= new Scanner(System.in); 
		                   System.out.println("Select Brand: 1)Apple 2)Oneplus 3)Realme 4)Google");
		                   int Brand=sc.nextInt();
		                   switch (Brand) {
						case 1:Apple A =new Apple();
						   A.Apple();
							break;
						case 2:Oneplus  O= new Oneplus();
						  O.Oneplus();
						  break;
						case 3:Realme R= new Realme();
						R.Realme();
						break;
						case 4:Google G=new Google();
						G.Google();
						break;
						default:System.out.println("Invalid Choice");
		                   } 
		                   
	 }        
	 }
 class Apple extends SmartPhone{
	public static void Apple() {
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Select apple: 1)Iphone 14 2)Iphone 14pro 3)Iphone 14promax 4)Iphone SE2");
		int apple=sc.nextInt();
		switch (apple) {
		case 1:Iphone14 I1=new Iphone14();
		I1.Iphone14();
			break;
		case 2: Iphone14pro I2=new Iphone14pro();
		I2.Iphone14pro();
          break;
		case 3: Iphone14promax I3=new Iphone14promax();
		I3.Iphone14promax();
		case 4:IphoneSE2 I4= new IphoneSE2();
		I4.IphoneSE2();
		break;
		
		default:System.out.println("Invalid Choice Your");
			break;
		}
	}
 }
class Iphone14 extends Apple{	
 public static void Iphone14() {
		           Scanner sc=new Scanner(System.in);
		           System.out.println("Choice Your Colour: 1)Blue 2)Black 3)White 4)Red 5)Purple");
		           int Colour=sc.nextInt();
		           switch (Colour) {
				case 1:System.out.println("Choice Your Colour:1)Blue");
				    Price();
					break;
				case 2:System.out.println("Choice Your Colour: 2)Black");
				   Price();
				   break;
				case 3:System.out.println("Choice Your Colour: 3)White");
				  Price();
				  break;
				case 4:System.out.println("Choice Your Colour: 4)Red");
				 Price();
				 break;
				case 5:System.out.println("Choice Your Colour: 5)Purple");
				Price();
				break;
				default:System.out.println("Invalid Choice Yours");
					
				}
	}

private static void Price() {
	               Scanner sc=new Scanner(System.in);
	               System.out.println("Select Price Range: 1) 128-GB RS:1,29,900. 2)256-GB RS1,39,900. 3)512-GB RS:1,59,900.");
			          int PriceRange=sc.nextInt();
			          switch (PriceRange) {
					case 1:System.out.println("Select Your Phone Feature: 1)128-GB RS1,29,900.");
					    break;
					case 2:	System.out.println("Select Your Phone Feature:2)256-GB RS:1,39,900.");
						break;
					case 3: System.out.println("Select Your Phone Feature:3)512-GB RS:1,59,900.");
					break;

					default:System.out.println("Invalid Choice You have Enter");
						
					}System.out.println("Congratulation Your Order has been Successful:) ");
	
}
}
class Iphone14pro extends Apple{
public static void Iphone14pro() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Choice Your Colour: 1)Blue 2)Black 3)White 4)Red 5)Purple");
    int Colour=sc.nextInt();
    switch (Colour) {
	case 1:System.out.println("Choice Your Colour:1)Blue");
	    Price1();
		break;
	case 2:System.out.println("Choice Your Colour: 2)Black");
	   Price1();
	   break;
	case 3:System.out.println("Choice Your Colour: 3)White");
	  Price1();
	  break;
	case 4:System.out.println("Choice Your Colour: 4)Red");
	 Price1();
	 break;
	case 5:System.out.println("Choice Your Colour: 5)Purple");
	Price1();
	break;
	default:System.out.println("Invalid Choice Yours");
		
	}
	}

private static void Price1() {
	   Scanner sc=new Scanner(System.in);
       System.out.println("Select Price Range: 1) 128-GB RS:78,400. 2)256-GB RS:88,400. 3)512-GB RS:1,09,900");
          int PriceRange=sc.nextInt();
          switch (PriceRange) {
		case 1:System.out.println("Select Your Phone Feature: 1)128-GB RS:78,400.");
		    break;
		case 2:	System.out.println("Select Your Phone Feature:2) 256-GB RS:88,400.");
			break;
		case 3: System.out.println("Select Your Phone Feature:3) 512-GB RS:1,09,900.");
		break;

		default:System.out.println("Invalid Choice You have Enter");
			
		}System.out.println("Congratulation Your Order has been Successful:) ");

}
}
class Iphone14promax extends Apple{
public static void Iphone14promax() {
	  Scanner sc=new Scanner(System.in);
	    System.out.println("Choice Your Colour: 1)Blue 2)Black 3)White 4)Red 5)Purple");
	    int Colour=sc.nextInt();
	    switch (Colour) {
		case 1:System.out.println("Choice Your Colour:1)Blue");
		    Price2();
			break;
		case 2:System.out.println("Choice Your Colour: 2)Black");
		   Price2();
		   break;
		case 3:System.out.println("Choice Your Colour: 3)White");
		  Price2();
		  break;
		case 4:System.out.println("Choice Your Colour: 4)Red");
		 Price2();
		 break;
		case 5:System.out.println("Choice Your Colour: 5)Purple");
		Price2();
		break;
		default:System.out.println("Invalid Choice Yours");
			
		}
	}

private static void Price2() {
	   Scanner sc=new Scanner(System.in);
       System.out.println("Select Price Range: 1) 128-GB RS:1,39,900. 2)256-GB RS:1,49,900. 3)512-GB RS:1,69,900. 4)1TB RS:1,89,900");
          int PriceRange=sc.nextInt();
          switch (PriceRange) {
		case 1:System.out.println("Select Your Phone Feature: 1)128-GB RS:1,39,900.");
		    break;
		case 2:	System.out.println("Select Your Phone Feature:2)256-GB RS:1,49,900.");
			break;
		case 3: System.out.println("Select Your Phone Feature:3)512-GB RS:1,69,900.");
		break;
		case 4:System.out.println("Select Your Phone Feature: 4)1TB RS:1,89,900");
        break;
		default:System.out.println("Invalid Choice You have Enter");
			
		}System.out.println("Congratulation Your Order has been Successful:) ");

}
	
	
}
class IphoneSE2 extends Apple{
public static void IphoneSE2() {
	
	 Scanner sc=new Scanner(System.in);
	    System.out.println("Choice Your Colour: 1)Blue 2)Black 3)White 4)Red 5)Purple");
	    int Colour=sc.nextInt();
	    switch (Colour) {
		case 1:System.out.println("Choice Your Colour:1)Blue");
		    Price3();
			break;
		case 2:System.out.println("Choice Your Colour: 2)Black");
		   Price3();
		   break;
		case 3:System.out.println("Choice Your Colour: 3)White");
		  Price3();
		  break;
		case 4:System.out.println("Choice Your Colour: 4)Red");
		 Price3();
		 break;
		case 5:System.out.println("Choice Your Colour: 5)Purple");
		Price3();
		break;
		default:System.out.println("Invalid Choice Yours");
			
		}
		
	}

private static void Price3() {
	  Scanner sc=new Scanner(System.in);
      System.out.println("Select Price Range: 1) 64-GB RS:28,990. 2) 128-GB RS:32,990. 3)256-GB RS:40,990.");
         int PriceRange=sc.nextInt();
         switch (PriceRange) {
		case 1:System.out.println("Select Your Phone Feature: 1) 64-GB RS:28,990..");
		    break;
		case 2:	System.out.println("Select Your Phone Feature:2) 128-GB RS:32,990.");
			break;
		case 3: System.out.println("Select Your Phone Feature:3)256-GB RS:40,990.");
		break;
	
		default:System.out.println("Invalid Choice You have Enter");
			
		}System.out.println("Congratulation Your Order has been Successful:) ");
}
}
class Oneplus extends SmartPhone{
 public static void Oneplus() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Select Oneplus: 1)Oneplus 10R  2)Oneplus 10 3)Oneplus 10pro 4)Oneplus Nord2");
	int Oneplus=sc.nextInt();
	switch (Oneplus) {
	case 1:Oneplus10R O1=new Oneplus10R();
	O1.Oneplus10R();
		break;
	case 2: Oneplus10 O2= new Oneplus10();
	O2.Oneplus10();
      break;
	case 3:Oneplus10pro O3=new Oneplus10pro();
	O3.Oneplus10pro();
	case 4:OneplusNord2 O4=new OneplusNord2();
	O4.OneplusNord2();
	break;
	
	default:System.out.println("Invalid Choice Your");
	}
}	
}
	class Oneplus10R extends Oneplus{

	static void Oneplus10R() {
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Choice Your Colour: 1)Forest Green 2)Sierra Black 3)Blue Tide 4)Gray Shadow");
		    int Colour=sc.nextInt();
		    switch (Colour) {
			case 1:System.out.println("Choice Your Colour:1)Forest Green");
			    OneplusPrice1();
				break;
			case 2:System.out.println("Choice Your Colour: 2)Sierra Black");
			 OneplusPrice1();
			   break;
			case 3:System.out.println("Choice Your Colour: 3)Blue Tide");
			 OneplusPrice1();
			  break;
			case 4:System.out.println("Choice Your Colour: 4)Gray Shadow");
			 OneplusPrice1();
			 break;
			default:System.out.println("Invalid Choice Yours");
		    }		
}
	public static void OneplusPrice1() {
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Select Price Range: 1)8-GB 128-GB RS:28,999. 2)12GB 256-GB RS:34,999.");
	         int PriceRange=sc.nextInt();
	         switch (PriceRange) {
			case 1:System.out.println("Select Your Phone Feature: 1) 8-GB 128-GB RS:28,999..");
			    break;
			case 2:	System.out.println("Select Your Phone Feature:2)12GB 256-GB RS:34,999.");
				break;
			default:System.out.println("Invalid Choice You have Enter");
				
			}System.out.println("Congratulation Your Order has been Successful:) ");
	}
	}
	class Oneplus10 extends Oneplus{
	public static void Oneplus10() {
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Choice Your Colour: 1)Forest Green 2)Sierra Black 3)Blue Tide 4)Gray Shadow");
		    int Colour=sc.nextInt();
		    switch (Colour) {
			case 1:System.out.println("Choice Your Colour:1)Forest Green");
			    OneplusPrice2();
				break;
			case 2:System.out.println("Choice Your Colour: 2)Sierra Black");
			 OneplusPrice2();
			   break;
			case 3:System.out.println("Choice Your Colour: 3)Blue Tide");
			 OneplusPrice2();
			  break;
			case 4:System.out.println("Choice Your Colour: 4)Gray Shadow");
			 OneplusPrice2();
			 break;
			default:System.out.println("Invalid Choice Yours");
		    }		
	}
	private static void OneplusPrice2() {
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Select Price Range: 1)8-GB 128-GB RS:49,999. 2)12GB 256-GB RS:54,999.");
	         int PriceRange=sc.nextInt();
	         switch (PriceRange) {
			case 1:System.out.println("Select Your Phone Feature: 1) 8-GB 128-GB RS:49,999.");
			    break;
			case 2:	System.out.println("Select Your Phone Feature:2)12GB 256-GB RS:34,999.");
				break;
		
			default:System.out.println("Invalid Choice You have Enter");
				
			}System.out.println("Congratulation Your Order has been Successful:) ");
	}
	}
class Oneplus10pro extends Oneplus{ 
	public static void Oneplus10pro() {
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Choice Your Colour: 1)Forest Green 2)Sierra Black 3)Blue Tide 4)Gray Shadow");
		    int Colour=sc.nextInt();
		    switch (Colour) {
			case 1:System.out.println("Choice Your Colour:1)Forest Green");
			    OneplusPrice3();
				break;
			case 2:System.out.println("Choice Your Colour: 2)Sierra Black");
			 OneplusPrice3();
			   break;
			case 3:System.out.println("Choice Your Colour: 3)Blue Tide");
			 OneplusPrice3();
			  break;
			case 4:System.out.println("Choice Your Colour: 4)Gray Shadow");
			 OneplusPrice3();
			 break;
			default:System.out.println("Invalid Choice Yours");
		    }		
		
	}private static void OneplusPrice3() {
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Select Price Range: 1)8-GB 128-GB RS:54,999. 2)12GB 256-GB RS:61,999.");
	         int PriceRange=sc.nextInt();
	         switch (PriceRange) {
			case 1:System.out.println("Select Your Phone Feature: 1) 8-GB 128-GB RS:54,999.");
			    break;
			case 2:	System.out.println("Select Your Phone Feature:2)12GB 256-GB RS:61,999");
				break;
		
			default:System.out.println("Invalid Choice You have Enter");
				
			}System.out.println("Congratulation Your Order has been Successful:) ");
		
	}
}

class OneplusNord2 extends Oneplus{
	public static void OneplusNord2() {
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Choice Your Colour: 1)Forest Green 2)Sierra Black 3)Blue Tide 4)Gray Shadow");
		    int Colour=sc.nextInt();
		    switch (Colour) {
			case 1:System.out.println("Choice Your Colour:1)Forest Green");
			    OneplusPrice4();
				break;
			case 2:System.out.println("Choice Your Colour: 2)Sierra Black");
			 OneplusPrice4();
			   break;
			case 3:System.out.println("Choice Your Colour: 3)Blue Tide");
			 OneplusPrice4();
			  break;
			case 4:System.out.println("Choice Your Colour: 4)Gray Shadow");
			 OneplusPrice4();
			 break;
			default:System.out.println("Invalid Choice Yours");
		    }
		
	}

	private static void OneplusPrice4() {
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Select Price Range: 1)8-GB 128-GB RS:28,999. 2)12GB 256-GB RS:34,999.");
	         int PriceRange=sc.nextInt();
	         switch (PriceRange) {
			case 1:System.out.println("Select Your Phone Feature: 1) 8-GB 128-GB RS:28,999.");
			    break;
			case 2:	System.out.println("Select Your Phone Feature:2)12GB 256-GB RS:33,999..");
				break;
		
			default:System.out.println("Invalid Choice You have Enter");
				
			}System.out.println("Congratulation Your Order has been Successful:) ");
	}
}
	class Realme extends SmartPhone{

	public static void Realme() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Oneplus: 1)Realme 95G  2)Realme 9pro5g 3)Realme 9pro+ 4)Realme Narzo 50");
		int RealmePrice=sc.nextInt();
		switch (RealmePrice) {
		case 1:Realme95G ref1=new Realme95G();
		ref1.Realme95G();
			break;
		case 2: Realme9PRO5G ref2=new Realme9PRO5G();
		ref2.Realme9PRO5G();
	      break;
		case 3: Realme9PRO ref3= new Realme9PRO();
		ref3.Realme9PRO();
		case 4:RealmeNarozo50 ref4 =new RealmeNarozo50();
		ref4.RealmeNarozo50();
		break;
		default:System.out.println("Invalid Choice Your");
		}}
	}
class Realme95G extends Realme{
 public	static void Realme95G() {
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Choice Your Colour: 1)Sunburst Gold 2)Meteor Black 3)Stargaze White, 4)Aurora Green");
		    int Colour=sc.nextInt();
		    switch (Colour) {
			case 1:System.out.println("Choice Your Colour:1)Sunburst Gold");
			RealmePrice95G1();
				break;
			case 2:System.out.println("Choice Your Colour: 2)Meteor Black");
			RealmePrice95G1();
			   break;
			case 3:System.out.println("Choice Your Colour: 3)Stargaze White");
			RealmePrice95G1();
			  break;
			case 4:System.out.println("Choice Your Colour: 4)Aurora Green");
			RealmePrice95G1();
			 break;
			default:System.out.println("Invalid Choice Yours");
		    }
		
			
	}
	private static void RealmePrice95G1() {
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Select Price Range: 1)6-GB 128-GB RS:17,000. 2)8GB 128-GB RS:18,000.");
	         int PriceRange=sc.nextInt();
	         switch (PriceRange) {
			case 1:System.out.println("Select Your Phone Feature: 1) 8-GB 128-GB RS:17,000.");
			    break;
			case 2:	System.out.println("Select Your Phone Feature:2)12GB 256-GB RS:18,000.");
				break;
		
			default:System.out.println("Invalid Choice You have Enter");
				
			}System.out.println("Congratulation Your Order has been Successful:) ");
		
	}
}
class Realme9PRO5G extends Realme{ 
	public static void Realme9PRO5G() {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Choice Your Colour: 1)Sunburst Gold 2)Meteor Black 3)Stargaze White, 4)Aurora Green");
	    int Colour=sc.nextInt();
	    switch (Colour) {
		case 1:System.out.println("Choice Your Colour:1)Sunburst Gold");
		RealmePrice9PRO5G();
			break;
		case 2:System.out.println("Choice Your Colour: 2)Meteor Black");
		RealmePrice9PRO5G();
		   break;
		case 3:System.out.println("Choice Your Colour: 3)Stargaze White");
		RealmePrice9PRO5G();
		  break;
		case 4:System.out.println("Choice Your Colour: 4)Aurora Green");
		RealmePrice9PRO5G();
		 break;
		default:System.out.println("Invalid Choice Yours");
	    }
		
	}

	private static void RealmePrice9PRO5G() {
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Select Price Range: 1)6-GB 128-GB RS:19,000. 2)8GB 128-GB RS:20,999.");
	         int PriceRange=sc.nextInt();
	         switch (PriceRange) {
			case 1:System.out.println("Select Your Phone Feature: 1) 8-GB 128-GB RS:19,000.");
			    break;
			case 2:	System.out.println("Select Your Phone Feature:2)12GB 256-GB RS:20,999.");
				break;
		
			default:System.out.println("Invalid Choice You have Enter");
				
			}System.out.println("Congratulation Your Order has been Successful:) ");
	}
}
class Realme9PRO extends Realme{

	public static void Realme9PRO() {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Choice Your Colour: 1)Sunburst Gold 2)Meteor Black 3)Stargaze White, 4)Aurora Green");
	    int Colour=sc.nextInt();
	    switch (Colour) {
		case 1:System.out.println("Choice Your Colour:1)Sunburst Gold");
		RealmePrice9PRO();
			break;
		case 2:System.out.println("Choice Your Colour: 2)Meteor Black");
		RealmePrice9PRO();
		   break;
		case 3:System.out.println("Choice Your Colour: 3)Stargaze White");
		RealmePrice9PRO();
		  break;
		case 4:System.out.println("Choice Your Colour: 4)Aurora Green");
		RealmePrice9PRO();
		 break;
		default:System.out.println("Invalid Choice Yours");
	    }
		
	}

	private static void RealmePrice9PRO() {
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Select Price Range: 1)6-GB 128-GB RS:24,999. 2)8GB 128-GB RS:27,000.");
	         int PriceRange=sc.nextInt();
	         switch (PriceRange) {
			case 1:System.out.println("Select Your Phone Feature: 1) 8-GB 128-GB RS:24,999");
			    break;
			case 2:	System.out.println("Select Your Phone Feature:2)12GB 256-GB RS:27,000.");
				break;
		
			default:System.out.println("Invalid Choice You have Enter");
				
			}System.out.println("Congratulation Your Order has been Successful:) ");
	}
	}
class RealmeNarozo50 extends Realme{
	public static void RealmeNarozo50() {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Choice Your Colour: 1)Sunburst Gold 2)Meteor Black 3)Stargaze White, 4)Aurora Green");
	    int Colour=sc.nextInt();
	    switch (Colour) {
		case 1:System.out.println("Choice Your Colour:1)Sunburst Gold");
		RealmePriceNarozo50();
			break;
		case 2:System.out.println("Choice Your Colour: 2)Meteor Black");
		RealmePriceNarozo50();
		   break;
		case 3:System.out.println("Choice Your Colour: 3)Stargaze White");
		RealmePriceNarozo50();
		  break;
		case 4:System.out.println("Choice Your Colour: 4)Aurora Green");
		RealmePriceNarozo50();
		 break;
		default:System.out.println("Invalid Choice Yours");
	    }
	    
		
	}

	private static void RealmePriceNarozo50() {
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Select Price Range: 1)6-GB 128-GB RS:21,949. 2)8GB 128-GB RS:24,949.");
	         int PriceRange=sc.nextInt();
	         switch (PriceRange) {
			case 1:System.out.println("Select Your Phone Feature: 1) 8-GB 128-GB RS:21,949");
			    break;
			case 2:	System.out.println("Select Your Phone Feature:2)12GB 256-GB RS:24,949..");
				break;
		
			default:System.out.println("Invalid Choice You have Enter");
				
			}System.out.println("Congratulation Your Order has been Successful:) "); 
	}}
class Google extends SmartPhone {
	

	public static void Google() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Oneplus: 1)Google Pixel 7 2)Google Pixel 7 Pro ");
		int Google=sc.nextInt();
		switch (Google) {
		case 1:Google7 ref1= new Google7(); 
		ref1.Google7();
			break;
		case 2: Google7PRO ref2=new Google7PRO();
		ref2.Google7PRO();
	      break;
		default:System.out.println("Invalid Choice Your");
		}}
}
class Google7 extends Google{
	public static void Google7() {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Choice Your Colour: 1)Snow 2)Hazel");
	    int Colour=sc.nextInt();
	    switch (Colour) {
		case 1:System.out.println("Choice Your Colour:1)Snow");
		GooglePrice7();
			break;
		case 2:System.out.println("Choice Your Colour: 2)Hazel");
		GooglePrice7();
		   break;
				default:System.out.println("Invalid Choice Yours");
			    }
	}
 
	private static void GooglePrice7() {
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Select Price Range: 1)8-GB 128-GB RS:59,999.");
	         int PriceRange=sc.nextInt();
	         switch (PriceRange) {
			case 1:System.out.println("Select Your Phone Feature: 1) 8-GB 128-GB RS:59,999");
			    break;
			default:System.out.println("Invalid Choice You have Enter");
				
			}System.out.println("Congratulation Your Order has been Successful:) "); 
	}
}
	
class Google7PRO extends Google{
	public static void Google7PRO() {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Choice Your Colour: 1)Obsidian 2)Lemongrass");
	    int Colour=sc.nextInt();
	    switch (Colour) {
		case 1:System.out.println("Choice Your Colour:1)Obsidian ");
		GooglePrice7pro();
			break;
		case 2:System.out.println("Choice Your Colour: 2)Lemongrass");
		GooglePrice7pro();
		   break;
				default:System.out.println("Invalid Choice Yours");
			    }
	}
	private static void GooglePrice7pro() {
		 Scanner sc=new Scanner(System.in);
	      System.out.println("Select Price Range: 1)8-GB 128-GB RS:84,999.");
	         int PriceRange=sc.nextInt();
	         switch (PriceRange) {
			case 1:System.out.println("Select Your Phone Feature: 1) 8-GB 128-GB RS:84,999");
			    break;
			default:System.out.println("Invalid Choice You have Enter");
	         }
			
				 Google ref1= new Google();
			     Scanner sc2=  new Scanner(System.in);
			     System.out.println("Enter name");
					System.out.println("Enter PhoneNo");
					System.out.println("Enter email");
					String choice = sc2.nextLine();
					int choice1 = sc2.nextInt();
					String choice2 = sc2.next();
					ref1.setMobilePhone_name(choice);
					ref1.setMobilePhone_PhoneNo(choice1);
					ref1.setMobilePhone_email(choice2);
					System.out.println("Name"+ref1.getMobilePhone_name());
					System.out.println("Phone:"+ref1.getMobilePhone_PhoneNo());
					System.out.println("email"+ref1.getMobilePhone_email());
					System.out.println("Congratulation your order has been successful");	
	}	
	}
	
	class Tv extends ViswakaramShop{
		public static void Tv() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Select Oneplus: 1)Normal Tv 7 2)Android Tv ");
			int Tv=sc.nextInt();
			switch (Tv) {
			case 1:NormalTv ref1= new NormalTv(); 
			ref1.NormalTv();
				break;
			case 2:AndroidTv ref2=new AndroidTv();
			ref2.AndroidTv();
		      break;
			default:System.out.println("Invalid Choice Your");
			}
		}
	}
	class NormalTv extends Tv{
		public static void NormalTv() {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Select Product: 1)Box TV 2)LCD TV");
		    int Choice=sc.nextInt();
		    switch (Choice) {
			case 1:System.out.println("Product Type : 1)Box TV");
				Product3();
				break;
			case 2: System.out.println("Product Type : 2)LCD TV");
			default:System.out.println("Invalid Choice");}
	}

		public static void Product3() {
			Scanner sc=new Scanner(System.in);
		    System.out.println("Choice Your Price 1)Onida RS:4500 2)Samsung RS:5300");
		    int Price=sc.nextInt();
		    switch (Price) { 
			case 1:System.out.println("Choice Your Price:1)Onida RS:4500  ");
				break;	
			case 2:System.out.println("Choice Your Price: 2)Samsung RS:5300");
			break;
			default:System.out.println("Invalid Choice");
			
			
		}}
	}
	class AndroidTv extends Tv{
		public static void AndroidTv() {
			 Scanner sc=new Scanner(System.in);
			    System.out.println("Select Product: 1)LCD TV 2)LED TV");
			    int Choice=sc.nextInt();
			    switch (Choice) {
				case 1:System.out.println("Product Type : 1)LCD TV");
					Product4();
					break;
				case 2: System.out.println("Product Type : 2)LED TV");
				break;
				default:System.out.println("Invalid Choice");}
		}

		public static void Product4() {
			Scanner sc=new Scanner(System.in);
		    System.out.println("Choice Your Price 1)Sony Bravia 55Inch RS:65,990  2)LG 55Inch RS:48,490");
		    int Price=sc.nextInt();
		    switch (Price) { 
			case 1:System.out.println("Choice Your Price:1)Sony Bravia 55Inch RS:65,990  ");
				break;	
			case 2:System.out.println("Choice Your Price: 2)LG 55Inch RS:48,490");
			break;
			default:System.out.println("Invalid Choice");
			
		}
		}
	}
	 class Fridge extends ViswakaramShop{
		 public static void Fridge() {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Select Fridge Type 1)SingleDoor 2)Double Door");
			 int Choice=sc.nextInt();
			 switch (Choice) {
			case 1:SingleDoor s=new SingleDoor();
			  s.SingleDoor();
				break;
			case 2: DoubleDoor D=new DoubleDoor();
			 D.DoubleDoor();
			default:
				;
			}
		 }
	 }
	 class SingleDoor extends Fridge{
 
		public static void SingleDoor() {
			    Scanner sc=new Scanner(System.in);
			    System.out.println("Select Product: 1)3 star 2)5 star");
			    int Choice=sc.nextInt();
			    switch (Choice) {
				case 1:System.out.println("Product Type : 1)3 star");
					Product1();
					break;
				case 2: System.out.println("Product Type : 2)5 star");
				default:System.out.println("Invalid Choice");
				}
		}
		private static void Product1() {
			Scanner sc=new Scanner(System.in);
		    System.out.println("Choice Your Colour: 1)Samsung 192 L RS:13,190  2)LG 190 L RS:16,290");
		    int ColourPrice=sc.nextInt();
		    switch (ColourPrice) { 
			case 1:System.out.println("Choice Your Colour:1)Samsung 192 L RS:13,190 ");
				break;	
			case 2:System.out.println("Choice Your Colur: 2)LG 190 L RS:16,290");
			break;
			default:System.out.println("Invalid Choice");
		}     
	 }
	 }
	 class DoubleDoor extends Fridge{

		public static void DoubleDoor() {
			   Scanner sc=new Scanner(System.in);
			    System.out.println("Select Product: 1)5 Star 2)7 Star");
			    int Choice=sc.nextInt();
			    switch (Choice) {
				case 1:System.out.println("Product Type : 1)5 Star");
					Product2();
					break;
				case 2: System.out.println("Product Type : 2)7 star");
				default:System.out.println("Invalid Choice");
				}
		}
		public static void Product2() {
			   Scanner sc=new Scanner(System.in);
			    System.out.println("Select Product: 1)Whirlpool 292 L RS:28,490. 2)AmazonBasics 335 L RS:28,490");
			    int ChoicePrice=sc.nextInt();
			    switch (ChoicePrice) {
				case 1:System.out.println("Product Type : 1)Whirlpool 292 L RS:28,490");
					Product2();
					break;
				case 2: System.out.println("Product Type : 2)AmazonBasics 335 L RS:28,490");
				break;
				default:System.out.println("Invalid Choice");
				}
			                Fridge ref1 =new Fridge();
			    Scanner sc2=  new Scanner(System.in);
			     System.out.println("Enter name");
					System.out.println("Enter PhoneNo");
					System.out.println("Enter email");
					String choice = sc2.nextLine();
					int choice1 = sc2.nextInt();
					String choice2 = sc2.next();
					ref1.setMobilePhone_name(choice);
					ref1.setMobilePhone_PhoneNo(choice1);
					ref1.setMobilePhone_email(choice2);
					System.out.println("Name"+ref1.getMobilePhone_name());
					System.out.println("Phone:"+ref1.getMobilePhone_PhoneNo());
					System.out.println("email"+ref1.getMobilePhone_email());
					System.out.println("Congratulation your order has been successful");
		}
		 
	 }
	 class WashingMachine extends ViswakaramShop{
		 public static void WashingMachine() {
			
				 Scanner sc=new Scanner(System.in);
				 System.out.println("Select Fridge Type 1)SemiAutomatic 2)Fully Automatic");
				 int Choice=sc.nextInt();
				 switch (Choice) {
				case 1:SemiAutomatic s=new SemiAutomatic();
				  s.SemiAutomatic();
					break;
				case 2: FullyAutomatic F=new FullyAutomatic();
				 F.FullyAutomatic();
				 break;
				default:System.out.println("Invalid Choice");
				 }
		 }

		
		 
		 }
	class SemiAutomatic extends  WashingMachine{
		public static void SemiAutomatic() {
			 Scanner sc=new Scanner(System.in);
			    System.out.println("Select Product:1)Whirlpool 7 Kg RS:10,990. 2)Amazon Basics 6 Kg RS:9,690 ");
			    int Choice=sc.nextInt();
			    switch (Choice) {
				case 1:System.out.println("Product Type : 1)Whirlpool 7 Kg RS:10,990.");
					break;
				case 2: System.out.println("Product Type : 2)Amazon Basics 6 Kg RS:9,690");
				break;
				default:System.out.println("Invalid Choice");
				}
			    System.out.println("Your Order Has been Successful");
			    
		}
	}
	class FullyAutomatic extends WashingMachine{
		public static void FullyAutomatic() {
			 Scanner sc=new Scanner(System.in);
			    System.out.println("Select Product:1)Whirlpool 6.5 Kg RS:16,490. 2)Samsung 6.5 kg ");
			    int Choice=sc.nextInt();
			    switch (Choice) {
				case 1:System.out.println("Product Type : 1)Whirlpool 6.5 Kg RS:16,490");
					break;
				case 2: System.out.println("Product Type : 2)Samsung 6.5 kg");
				break;
				default:System.out.println("Invalid Choice");
				}
			    System.out.println("Your Order has been Successful");
		}
	} 
	

	
			
		
	 

	
	
		

	 
 
	 

