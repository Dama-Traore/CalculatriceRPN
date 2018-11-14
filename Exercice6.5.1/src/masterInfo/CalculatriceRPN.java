package masterInfo;

public enum CalculatriceRPN {
	val1;
	CalculatriceRPN() 
	{
	
		SaisieRPN b=new SaisieRPN();
<<<<<<< HEAD
	//	try {
		  b.saisie();
			/*} catch (CalculatorException e) {
				System.out.println(e.getMessage());
			}*/	
=======
		  try {
			b.saisie();
		} catch (SAISIEException e) {
			System.out.println(e.getMessage());
		}		
>>>>>>> master
		
	}
	
	public static void main(String[] args) {
		CalculatriceRPN e;	
	}

}
