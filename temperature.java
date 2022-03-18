package assignment.pkg2.solve;
import java.util.Scanner;
public class temperature
{
    void calculate_temperature(int choice, String[] city)
    {
        Scanner sca = new Scanner(System.in);
        int choose;
        double temp;
        
        System.out.println("1.Fahrenheit");
        System.out.println("2.Calcius");
        System.out.print("choose one which you enter value between 1 and 2 = ");
        choose = sca.nextInt();
        if(choose==1)
        {
            System.out.print("Enter Temparature in Fahrenheit scale = ");
            temp = sca.nextDouble();
            temp = (temp-32)*5/9;
            System.out.println("Temparature of "+city[choice-1]+" in Calcius is = "+temp);            
        }
        else if(choose==2)
        {
            System.out.print("Enter Temparature in Calcius scale = ");
            temp = sca.nextDouble();
            temp = (temp*9/5)+32;
            System.out.println("Temparature of "+city[choice-1]+" in Fahrenheit is = "+temp);
        }
    }
    public static void main(String[] args)
    {
        String [] city ={"Multan","Lahore","Islamabad","Faisalabad","Vehari","Mailsi","Peshawar","Quetta","Karachi","Sialkot"};
        Scanner sc = new Scanner(System.in);
        int choice;
        String x = "yes";
        do
        {
            System.out.println("1.Multan");
            System.out.println("2.Lahore");
            System.out.println("3.Islamabad");
            System.out.println("4.Faisalabad");
            System.out.println("5.Vehari");
            System.out.println("6.Mailsi");
            System.out.println("7.Peshawar");
            System.out.println("8.Quetta");
            System.out.println("9.Karachi");
            System.out.println("10.Sialkot");
            System.out.println("\t\t\tChoose one city!");
            System.out.print("Enter your choice between 1 to 10 = ");
            choice = sc.nextInt();
            if(choice>=1 && choice<=10)
            {
                temperature obj = new temperature();
                obj.calculate_temperature(choice,city);
            }
            else
            {
                System.out.println("You enter wrong number!");
            }
            System.out.println("You check again?\n yes or no.");
            System.out.print("Enter your choice = ");
            x=sc.next();
        }while(x.equals("yes"));
    }
}