class CaseTransform{
    static public void main(String args[])
	/* Cover lowercase ASCII to uppercase (-32) and vise versa, taking characters from console input, make no changes to any other character. Stop when period character is reached.
	 */
	throws java.io.IOException {
	int entry;
	char display;
	
	
	while (true){
	    entry=System.in.read();
	    if ((entry >= (int) 'a') & (entry <= (int) 'z')){
		display = ((char) (entry-32));
		    System.out.print(display);
		}
	    if ((entry >= (int) 'A') & (entry <= (int) 'Z')){
		display = ((char) (entry+32));
		    System.out.print(display);
		}
	    if (entry==(int) '.') break;
	    if (entry==(int) '\r') break;
	    if ((entry >= (int) 'z') || (entry <= (int) 'A')){
		display = ((char) (entry));
		    System.out.print(display);
		}
	}
    }
  
    
}
	
	
	
				   
