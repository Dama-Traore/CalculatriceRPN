package masterInfo;


import java.util.Stack;

public class MoteurRPN{
	Stack<Double> p = new Stack<Double> ();
	Stack<Double> p2 = new Stack<Double>();
	double MAXValue = 10000000000000.0;
	double MINValue = 0.00000000000001;
	
	public void enregistrer(Double value) {
		
		if (value> MAXValue || value< MINValue)
			try {
				throw new MAXMINException ();
			} catch (MAXMINException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		p.push(value);
	}
	public void calcul(Stack<Double> p, Operation op) {
		
		 //op = Operation.ADD;
		double resultat = 0;
		
		if (op == Operation.ADD) {
			Double v = p.pop();
			Double y = p.pop();
			resultat = Operation.ADD.eval(v, y);
			p.push(resultat);			
		}
		
		if (op == Operation.DIV) {
			Double v = p.pop();
			Double y = p.pop();
			resultat = Operation.DIV.eval(v, y);
			p.push(resultat);			
		}
		
		if (op == Operation.MULT) {
			Double v = p.pop();
			Double y = p.pop();
			resultat = Operation.MULT.eval(v, y);
			p.push(resultat);			
		}
		
		if (op == Operation.SUB) {
			Double v = p.pop();
			Double y = p.pop();
			resultat = Operation.SUB.eval(v, y);
			p.push(resultat);			
		}
		
		//return;	
		
		}
	
	public void ListOperandes(Stack<Double> p) {
	
		while (p.empty()==false) {
		
			
		
			double x = p.pop();
			p2.push(x);
			System.out.println(x);
		
		}
		
		while(p2.empty()== false) {
			double c = p2.pop();
			p.push(c);
			//System.out.println(c);
		}
		


		
			
		}}
		
	
