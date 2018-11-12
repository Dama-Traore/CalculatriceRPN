package masterInfo;

import java.util.Stack;

public class MoteurRPN{
	Stack<Double> p = new Stack<Double> ();
	
	
	public void enregistrer(Double value) {
		p.push(value);
	}
	public void calcul(Stack<Double> p, char c) {
		
		Operation op = Operation.ADD;
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
		


		
			
		}}
		
	
