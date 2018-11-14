package masterInfo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperationTest {

	@Test
	void test() {
		
		/// Test junit sur l'addition;
		
		Operation  op1 = Operation.ADD;
		
	double somme= op1.eval(5, 5);
	
	assertEquals(10,somme);
	
	/// Test junit sur la soustraction;
	
	Operation  op2 = Operation.SUB;
	
double difference= op2.eval(5, 5);

assertEquals(0,difference);
	
/// Test junit sur la multiplication;

Operation  op3 = Operation.MULT;

double produit = op3.eval(5, 5);

assertEquals(25, produit );


/// Test junit sur la division;

Operation  op4 = Operation.DIV;

double quotient= op4.eval(5, 5);

assertEquals(1,quotient);
		
		// fail("Not yet implemented");
	}

}
