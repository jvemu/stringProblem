package str.com;

public class ReplaceCharOccurance {

	// old string
	String oString;
	//new string
	String nString;
	// string to be replaced
	String rString;
	// new Character array
	char[] nCharArray;
	// character to be replaced
	char replaceChar;
	static boolean rv;
	
	
	public ReplaceCharOccurance(String s1, String s2) {
		// TODO Auto-generated constructor stub
		rString =s1;
		oString= s2;
		//System.out.println("String is null");
		
		
		nString= null;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ReplaceCharOccurance c = new ReplaceCharOccurance("a","amy");
     /*   rv=  c.replaceAllatOnce();
       System.out.println("new string from ReplaceAll="+ c.nString);
       System.out.println("return value="+ rv); */
		 
		//rv= c.replaceByIteration();
		//System.out.println(" new String replace BY iTERATION="+ c.nString  ); */
	}
  public boolean replaceAllatOnce(){
	  // check for null and blank for the source string
	   if(oString ==  null  || oString.isEmpty()){
		   System.out.println("orignal string is null");
		   return false;
	   }
	
	   // check if the replace string is null
	   if(rString== null){
		   System.out.println("string to be replaced is null");
		   return false;
	   }
		 
	   else{
	 // System.out.println("current string ="+ oString);
	  nString = oString.replaceAll(rString, "");
	  System.out.println("new string ="+ nString);
	  return true;
	   }
	  
  }
  public boolean replaceByIteration(){
	  
	  System.out.println("current String ="+ oString);
	  System.out.println("String to replace with ="+ rString);
	  
	  // return false if source string is either null or empty or if the replace with string is null
	  if(oString ==  null || oString.isEmpty() || rString == null){
		  return false;
	  }
	  
	   nCharArray = new char[oString.length()];
		replaceChar= rString.charAt(0);
		
	 
	  for(int i=0; i< oString.length(); i++){
		  char p = oString.charAt(i);
		  if(p == replaceChar){
			  p= ' ';
		  }
		  nCharArray[i]=p;
	  }
	  nString = new String(nCharArray);
	  System.out.println("newString ="+ nString);
	  
	  
	  return true;
  }
}
