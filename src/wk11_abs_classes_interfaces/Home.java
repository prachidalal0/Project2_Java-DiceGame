package wk11_abs_classes_interfaces;
/*
Develop an application to help users decide to choose a home
Implement Home abstract class
Vars are attributes of a home: sq ft, # of bedrms, school rating, rank
Methods setRank
Implement Apartment and Duplex classes extends Home
Implement House extends Home implements Asset, Taxes
*/

//compare different homes and get a score to be ranked
public abstract class Home {
	double sqft; 
	double bedrooms; 
	double schoolRating;
	double score; 
	
	public abstract void setScore();
}

class Apartment extends Home {
	@Override
	public void setScore() {
		score = sqft + (bedrooms * 500) + (schoolRating * 500);
	}
}

class House extends Home implements Taxes, Asset {
	double taxes;
	double appreciation;
	double appraisedValue;
	
	public void setTaxes() {
		taxes = appraisedValue * TAX_RATE;
	}
	
	public void setAppreciation() {
		appreciation = appraisedValue * APPREC_RATE;
	}
	
	public void setScore() {
		score = sqft + (bedrooms * 500) + (schoolRating * 500);
		score = score + appreciation - taxes;
	}
}

interface Taxes {
	//does not change (object in an interface) 
	double TAX_RATE = 0.01; //constant
	void setTaxes(); //abstract method
}

interface Asset {
	double APPREC_RATE = 0.022; //constant
	void setAppreciation(); //abstract method
}

