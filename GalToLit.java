//convert gallons to liters class
class GalToLit{
    public static void main(String args[]){
	double gallons, liters;
	int counter;
	counter=0;
	for (gallons =1; gallons<100; gallons++){
	    liters = gallons *3.7854;
	    System.out.println(gallons + "gallons is " + liters  + " liters.");//increment gallons liter description
	    counter++;
	    if (counter == 10) {
		System.out.println();
		counter=0;
	    }
	}
	    
	   
    }
}
