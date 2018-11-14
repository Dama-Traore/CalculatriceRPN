package masterInfo;


import java.util.Stack;

public class MoteurRPN{
	Stack<Double> p = new Stack<Double> ();
	private final static int min_value=-999;
	private final static int max_value=999;
	

	public MoteurRPN() 
	{
		p=new Stack<>();
	}
	
	public void enregistrer(Double value) {
		if (value> max_value || value< min_value)
			try {
				throw new MAXMINException ("La valeur de l'interval n'est pas respecté\n");
			} catch (MAXMINException e) {
				e.printStackTrace();
			}
		else
		p.push(value);
	}
	
	public void calcul(Operation op){	
		double resultat = 0;
			Double v = depile();
			Double y = depile();
			resultat = op.eval(v, y);
			p.push(resultat);
	}
	
	public boolean isEmpty() 
	{
		return p.empty();
		
	}
	
	public double depile() 
	{	
		if (p.isEmpty());
		return p.pop() ;		  
	}
	
	public int nbrOperande()
	{
		return p.size();
		
	}
	
	public Stack<Double> getP() {
		return p;
	}
	
}
		
	
