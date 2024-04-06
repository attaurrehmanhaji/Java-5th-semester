//Print pyramide

public class lab2A{
    public static void main(String[] args){
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(i+" ");

            }
            System.out.println(" ");
        }

        for(int i=5; i>=1; i--)
        {
            for(int j=5; j>=i; j--)
            {
                System.out.print(i+1+" ");

            }
            System.out.println(i);
        }

        
    }
}