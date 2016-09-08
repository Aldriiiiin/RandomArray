import java.util.Random;
import java.util.Scanner;


public class AldrinPineda {
        Scanner input = new Scanner(System.in);
        Random Me  = new Random();
  
        int array[]; 
        int sum = 0;
        int max = 0 ;
        double average = 0 ; 
        int size;
   
        
    public void show(){
            
       System.out.print("Enter the Size of Array : " ) ;
            size=input.nextInt();
            array=new int [size];
            
                for (int x = 0 ; x < size; x++){
                    array[x]=Me.nextInt(3000);
                    System.out.print(array[x]+" , ") ;           
            }
        }
        
    
       public void max() {
		for(int x = 0; x < size; x++)
                {
			if(array[x] > max)
                        max = array[x];
		}
                System.out.println();
		System.out.print("Number of Max : " + max);
	}
	
	public void sum()
        {
		for(int x = 0; x < size; x++)
                {
		sum = sum + array[x];
		}
                
                System.out.print("/n");
		System.out.print("The Sum : " + sum);
	}

	public void average() {
                 System.out.println();
		 average = sum / size;
		 System.out.print("The Average : " + average);		 
	}
    
        public static void main(String [] args){
             AldrinPineda print = new AldrinPineda();
            
            print.average(); print.show(); print.max(); print.sum();
            
        }
        
}
