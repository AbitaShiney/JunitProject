
public class example1 {
	public example1(){
		
	}
	public String sayHello(){
		return "Hello!!";
	}
	public double calcTax(double amount,String symbol){
		if(symbol == "CAD"){
			amount = amount * 1.25;
			return amount;
		}else if(symbol == "USD"){
			amount = amount * 0.75;
			return amount;
		}else{
			return -1;
		}
	}
}
