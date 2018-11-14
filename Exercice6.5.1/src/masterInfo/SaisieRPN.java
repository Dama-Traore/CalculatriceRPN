package masterInfo;
import java.util.Scanner;
import java.util.Stack;
	
public class SaisieRPN {		
		private MoteurRPN cal;
    	Stack<Double> p = new Stack<Double> ();
    	
    	public SaisieRPN(){
			cal = new MoteurRPN();
		}
    	
    	public MoteurRPN getMoteur() {
    		return cal;
    	}
    	
    	public boolean IsOperande(String sign)
    	{
    		try{
    			Double value= Double.parseDouble(sign);
    		}catch (Exception e) {
				return false;
			}
			return true;
    	}
    	
    	public boolean IsClean(String sign){
    		if ( sign.equals("c") || sign.equals("clean") ||sign.equals("C") ) 	return true;
    		return false;
    	}
    	
    	public boolean IsUndo(String sign){
    		if ( sign.equals("S")|| sign.equals("s") || sign.equals("supprimer") ) return true;
    		 return false;
    	}
		
		public void saisie(){ 
			Scanner sc=new Scanner(System.in);
			int Compteur=0;
			do{				
				System.out.println("Veuillez saisir un nombre  ou un operateur:");
				String sign = sc.nextLine();
				if(sign.equals("exit")) return ;
				
				 if(IsOperande(sign)){
					cal.enregistrer(Double.parseDouble(sign));
				}
				
				else if (IsClean(sign)) {
					cal=new MoteurRPN();
					Compteur=0;
				}

				else if (IsUndo(sign)) cal.depile();
				
				else if (operateur(sign)){						
					if ( cal.nbrOperande()-1>Compteur ) {
						Compteur++;
						cal.calcul(signe(sign));
						Compteur=0;						
					}					
				}	
				System.out.println("La pile contient:"+cal.getP());
				}while(true);
			}

	public Operation signe(String sign) {
		switch (sign) {
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
