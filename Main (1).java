/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int n=5;
		for(int i=1;i<=n;i++){
		    //1st part
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    
		    //Spaces
		    for(int j=1;j<=2*(n-i);j++){
		        System.out.print(" ");
		    }
		    //2nd part
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
		     System.out.println();  
		}
		//repeat code for lower part but make values ulta for i
		for(int i=n;i>=1;i--){
		    //1st part
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    
		    //Spaces
		    for(int j=1;j<=2*(n-i);j++){
		        System.out.print(" ");
		    }
		    //2nd part
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
		     System.out.println();  
		}
		
		
		
		
		
		
		
		
	}
}

