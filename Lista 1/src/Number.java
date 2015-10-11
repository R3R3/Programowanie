
public class Number {

	public int Num;
	
	Number (int Num){
		Num = this.Num;
	}

	String toBase (int base){
		 if(base >= 2 && base <= 16){
			 return Integer.toString(Num, base);
		 }
		 else{
			 throw new java.lang.IllegalArgumentException("Radix must be between 2 and 16.");
		 }
	}
	
	public void whatever() {}

}
