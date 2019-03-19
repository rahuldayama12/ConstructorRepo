/**
 * THIS APPLICATION EVALUATES THE COST OF CONSTRUCTION BASED ON STANDARD OF CONSTRUCTION
 * @author Rahul Dayama
 */
public class ConstructionCost
{
	public double constructionCost(String standard,double area,boolean automation) 
	{
		
		double cost=0;
		//VARIABLE COST LINKED TO STANDARD
		switch(standard)
		{
			//COST FOR NORMAL OR BASIC STANDARD
			case "BASIC":
			cost = 1200*area;
			break;
			//COST FOR HIGH STANDARD
			case "HIGH":
			cost = 1500*area;
			break;
			//COST FOR HIGH STANDARD AND AUTOMATED HOME
			case "HIGH+":
			if(automation)
			{
				//IF AUTOMATION IS REQUIRED
				cost = 2500*area;
			}
			//IF AUTOMATION NOT REQUIRED
			else cost = 1800*area;
		}
		return cost;
	}
}

