package masterInfo;

public enum Operation {
	
	MULT("*") {
		@Override
		public double eval(double a, double b) {
		
			return a*b;
		}
	}, ADD("+") {
		@Override
		public double eval(double a, double b) {
			
			return a+b;
		}
	}, SUB("-") {
		@Override
		public double eval(double a, double b ){
			
			return a-b;
		}
	}, DIV ("/") {
		@Override
		public double eval(double a, double b) {
		
			return a/b;
		}
	} ;
	
 private  String symbole;
 
 
  private Operation (String symbole)
  {
	
	this.symbole= symbole;
	
}
  public String getsymbole() {  
      return  this.symbole ;  
 } 
  
  
  
  
  public abstract double eval (double a, double b);
  
  
  
}
