import java.util.Scanner;
public class PROJECT_ONLINE_TEST {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int mark1,mark2,mark3,mark4,mark5,choice,total;
        System.out.println("--------------------------------------------------");
        System.out.println("                 DISHA INSTITUTE                  ");
        System.out.println("--------------------------------------------------\n");
        System.out.println("Q1.How Many Planets Are In Solar System.");
        System.out.println("1.7\n2.8\n3.9\n4.6");
        choice=s.nextInt();
        if(choice==3)
        {
        	mark1=10;
        }
        else
        {
        	mark1=0;
        }
        System.out.println("Q2.How Many Bones Are Present In Human Body.");
        System.out.println("1.206\n2.204\n3.208\n4.205");
        choice=s.nextInt();
        if(choice==1)
        {
        	mark2=10;
        }
        else
        {
        	mark2=0;
        }
        System.out.println("Q3.Which Is The Longest River In INDIA.");
        System.out.println("1.Godavari\n2.Yamuna\n3.Ganga\n4.Nile");
        choice=s.nextInt();
        if(choice==4)
        {
        	mark3=10;
        }
        else
        {
        	mark3=0;
        }
        System.out.println("Q4.How Many Seconds Make One Hour.");
        System.out.println("1.36000\n2.3600\n3.360\n4.60");
        choice=s.nextInt();
        if(choice==2)
        {
        	mark4=10;
        }
        else
        {
        	mark4=0;
        }
        System.out.println("Q5.How Many Vowels Are Present In English Alphabet.");
        System.out.println("1.7\n2.8\n3.5\n4.6");
        choice=s.nextInt();
        if(choice==3)
        {
        	mark5=10;
        }
        else
        {
        	mark5=0;
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("                      RESULTS                        ");
        System.out.println("-----------------------------------------------------");
        System.out.println("Question Number                           Marks      ");
        System.out.println("   Q1                                       "+mark1);
        System.out.println("   Q2                                       "+mark2);
        System.out.println("   Q3                                       "+mark3);
        System.out.println("   Q4                                       "+mark4);
        System.out.println("   Q5                                       "+mark5);
        System.out.println("-----------------------------------------------------");
        System.out.println("                      Thank You                      ");
        System.out.println("-----------------------------------------------------");
	}

}
