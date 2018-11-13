package masterInfo;
import java.util.Scanner;
import java.util.Stack;
public class SaisieRPN   {
	
	MoteurRPN m = new MoteurRPN();
	
	public void saisir(Stack<Double> p) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir les operandes s'il vous plait");
	boolean 	fin= false;
	while (fin== false)
	{
		String  d = sc.nextLine();
		if (d=="q")
		
		{ fin=true;} 
		
		if (d=="entrer") {
	//	m.calcul(p, c);	
	
		}
		else {
		double o;
		 o = Double.parseDouble(d);
		m.enregistrer(o);
		
		
		
		
		}	
		
		
	}
		
		
	}
	
	
}
