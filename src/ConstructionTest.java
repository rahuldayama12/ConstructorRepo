import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructionTest {

	@Test
	public void Constructioncosttest () 
	{
		ConstructionCost c=new ConstructionCost();
		double result=c.constructionCost("BASIC", 1000, false);
		assertEquals(1200000.0,result,0.1);
	}

}
