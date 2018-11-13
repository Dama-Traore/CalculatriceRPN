package masterInfo;
import java.util.Scanner;
import java.util.Stack;
	
public class SaisieRPN {
		
		private Scanner sc;
		private MoteurRPN cal;
		private Operation op;
    	Stack<Double> p = new Stack<Double> ();
		
		
		public SaisieRPN(){
			sc = new Scanner(System.in);
			cal = new MoteurRPN();
		}
		
		public void saisie(){
			System.out.println("Veuillez saisir un nombre  ou un operateur:");
		
			while (sc.hasNext())   
		      { 
		       String token = sc.next();   

		       if (operateur(token))
		       { 
		    	/*Double op2 = p.pop(); 
		        Double op1 = p.pop(); */
		        double result = cal.calcul(token);  
		        p.push(result); 
		       } 
		       else { 
		    	Double d = sc.nextDouble();
				cal.enregistrer(d);
				} 
		       
		      } 
		      //return p; 
		     } 

		    private boolean operateur(String token) 
		     { 
		      return (token.equals("+") || token.equals("-") || 
		        token.equals("*") || token.equals("/"));
			}	
		
	
}
