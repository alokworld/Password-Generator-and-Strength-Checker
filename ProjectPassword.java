import java.util.*;
public class ProjectPassword {
    public static String suggest() 
    {
		System.out.print("Your new password is : ");
		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";
        String values = Capital_chars + Small_chars +numbers + symbols;

		Random rndm = new Random();
        String password="";

		for (int i = 0; i < 16 ; i++)
		{
			password += values.charAt(rndm.nextInt(values.length()));

		}
        if(!(strength(password)))
		suggest();

        return password;
    }
    public static boolean strength(String s)
    {
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";

        //Checking capital
        boolean cap=false;
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            int p=Capital_chars.indexOf(ch);
            if(p != -1)
            {
                cap=true;
                break;
            }
        }
        //Checking small
        boolean sma=false;
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            int p=Small_chars.indexOf(ch);
            if(p != -1)
            {
                sma=true;
                break;
            }
        }
        //Checking digit
        boolean dig=false;
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            int p=numbers.indexOf(ch);
            if(p != -1)
            {
                dig=true;
                break;
            }
            
        }
        //Checking special symbols
        boolean spe=false;
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            int p=symbols.indexOf(ch);
            if(p != -1)
            {
                spe=true;
                break;
            }
        }
        if(cap==true && sma==true && dig==true && spe==true)
        return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Password Suggestion");
        System.out.println("Enter 2 for checking Password Strength");
        String i=sc.next();
        switch(i)
        {
            case "1": System.out.println(suggest());
                break;
            case "2":System.out.println("Enter a password:"); 
            String s=sc.next();
            if(strength(s) && s.length()>10)
            {
            System.out.println("Your Password is Secure and Powerful");
            System.out.println("Make your Password of atleast 10 characters");
            }
            else if(strength(s))
            System.out.println("Your Password is Secure but NOT Powerful");
            else 
            System.out.println("Your Password is NOT Secure");
                break;
            default:System.out.println("Invalid Input");
        }
        sc.close();
    }
    
}
