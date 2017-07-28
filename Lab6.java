import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 * Methods with arrays 
 * 
 * 
 * @author Ali Bayati
 * @version 28jun2017
 *
 */
public class Lab6 {

	/*int g1=0,g2=0,g3=0;
		Scanner input = new Scanner(System.in);
		for (int i=1;i<=3;i++){
			
			if(i==1)
				g1=Integer.parseInt(JOptionPane.showInputDialog("Enter grade of student "+i));
			else if(i==2)
				g2=Integer.parseInt(JOptionPane.showInputDialog("Enter grade of student "+i));
			else
				g3=Integer.parseInt(JOptionPane.showInputDialog("Enter grade of student "+i));
		
		}*/
	
	
	public static void main(String[] args) {
		int student=Integer.parseInt(JOptionPane.showInputDialog("Enter number of student:"));
		while(student<1||student>25){
		JOptionPane.showMessageDialog(null,"Number of student has to be from (1-25)try again !");	
		student=Integer.parseInt(JOptionPane.showInputDialog("Enter number of student:"));
		}
		int []gradStud=new int[student];
		String []nameStud=new String[student];
		for (int i=0;i<nameStud.length;i++){
			nameStud[i]=JOptionPane.showInputDialog("Enter Name of student "+(i+1)+":");
			gradStud[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter Grade of student "+(i+1)+":"));
		}
		showOutput(nameStud,gradStud);
		//showOutput(g1, g2, g3);
	}
	      
	public static void showOutput(String[] nameStud,int [] gradStud){
		
		String names="";
		for(int i=0;i<nameStud.length;i++){
			
			names+="Student "+(i+1)+" : "+nameStud[i]+
					", "+"grade: "+gradStud[i];
			if(i!=nameStud.length){
				names+="\n";
			}
		}
		
		JOptionPane.showMessageDialog(null,"Number of students : "+nameStud.length+
			"\n----------\n"+names+"----------\n"+"\nThe average grade is: "+average(gradStud)
			+"\nThe max grade is: "+max(gradStud)
			+"\nThe min grade is: "+min(gradStud));
		
	}
	
	private static int min(int[] gradStud) {
		/**
		 * Calculate min
		 * Input integer array
		 * Parameters gradStud[]
		 * Output return int
		 * 
		 */
		
		Arrays.sort(gradStud);
		return gradStud[0];
	}

	private static int max(int[] gradStud) {
		/**
		 * Calculate max
		 * Input integer array
		 * Parameters gradStud[]
		 * Output return int
		 * 
		 */
		Arrays.sort(gradStud);
		return gradStud[gradStud.length-1];
	}

	private static float average(int[] gradStud) {
		/**
		 * Calculate average
		 * Input integer array
		 * Parameters gradStud[]
		 * Output return float
		 * 
		 */
		
		float tot=0;
		for(int i=0;i<gradStud.length;i++){
			tot+=gradStud[i];
		}
		return tot/gradStud.length;
	}

	public static void showOutput(int g1,int g2, int g3){
		/**
		 * Show the result in JO message
		 * 
		 * input Integer 
		 * param g1,g2,g3
		 * output show message using the 3 methods 
		 */
		
		JOptionPane.showMessageDialog(null,"Number of student: 3"
				+ "\nThe average grade is: "+average(g1,g2,g3)
				+"\nThe max grade is: "+max(g1,g2,g3)
				+"\nThe min grade is: "+min(g1,g2,g3));
	}
	

	
	
	public static double average(int g1,int g2,int g3){
		/**
		 * Calculate average
		 * Input integer
		 * Parameters g1,g2,g3
		 * Output return double
		 * 
		 */
		
		
		double result;
		result =(g1+g2+g3)/3;
		return result;
	}
	public static int max(int g1,int g2,int g3){
		
		/**
		 * Calculate max number
		 * Input integer
		 * Parameters g1,g2,g3
		 * Output return integer
		 * 
		 */
		
		int max;
		if(g1>g2){
			max= g1;
		}
		else{
			max=g2;
		}
		if(max>g3){
			return max;
		}
		else{
			return g3;
		}
		
	}
	public static int min(int g1,int g2,int g3){
		
		/**
		 * Calculate min number
		 * Input integer
		 * Parameters g1,g2,g3
		 * Output return integer
		 * 
		 */
		
		int min;
		if(g1<g2){
			min= g1;
		}
		else{
			min=g2;
		}
		if(min<g3){
			return min;
		}
		else{
			return g3;
		}
		
	}
}
