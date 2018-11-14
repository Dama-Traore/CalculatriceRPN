package masterInfo;
import java.util.Scanner;
import java.util.Stack;
	
public class SaisieRPN {
		
		public  Scanner sc;
		public MoteurRPN cal;
    	Stack<Double> p = new Stack<Double> ();
		
		
		public SaisieRPN(){
			sc = new Scanner(System.in);
			cal = new MoteurRPN();
		}
		
		public void saisie(){
			System.out.println("Veuillez saisir un nombre  ou un operateur:");
			if(sc.hasNextDouble())
			{
				double d = sc.nextDouble();
				cal.enregistrer(d);
			}
			else {
				String sign = sc.nextLine();
				if(operateur(sign))
				{
					Operation op=signe(sign);
					cal.calcul(p,op);
						}
				else
				{
					System.out.println("erreur de saisie");
				}
				}
			}
			
			//}
		
			/*while (sc.hasNext())   
		      { 
		       String token = sc.next();   

		       if (operateur(token))
		       { 
		    	/*Double op2 = p.pop(); 
		        Double op1 = p.pop(); */
		       /* double result = cal.calcul(token);  
		        p.push(result); 
		       } 
		       else { 
		    	Double d = sc.nextDouble();
				cal.enregistrer(d);
				} 
		       
		      } */
		      //return p; 
		   //  } 

	public Operation signe(String token) {
		switch (token) {
        case "+":
            return Operation.ADD;
        case "-":
            return Operation.SUB;
        case "*":
            return Operation.MULT;
        case "/":
            return Operation.DIV;
            }
		return null;
	}
		
	  private boolean operateur(String token)
		     { 
		      return (token.equals("+") || token.equals("-") || 
		        token.equals("*") || token.equals("/"));
			}	
		
	
}
