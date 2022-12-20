import java.util.ArrayList;
public class BigNumber {
	
	private ArrayList<Integer> Digits = new ArrayList<>();
	int Sign;
	
	public BigNumber(String input) {//if positive, sign=0 //if negative sign=1
		
		if(input.charAt(0)=='-')//its negative
			Sign = 1;
		else
			Sign = 0;
		
		for (int i = input.length()-1 ; i >= Sign; i--)
			Digits.add(input.charAt(i)-48);

	}
	
	//// //// ////
	
	@Override
	public String toString() {
		
		String print ="";
		if(this.getSign()==1)//N
			print = "-";
		
		for (int i = this.Digits.size()-1; i >= 0 ; i--) 
			print+=this.Digits.get(i);
		
		return print;
		
	}
	
	//// //// ////
	
	BigNumber Minimum (BigNumber Compared) {
		
		if(this.compareTo(Compared)==-1)//compared bigger
			return this;
		else//this bigger
			return Compared;
		
	}
	
	//// //// ////
	
	BigNumber Maximum (BigNumber Compared) {
		
		if(this.compareTo(Compared)==1)//this bigger
			return this;
		else//compared bigger
			return Compared;
		
	}
	
	//// //// ////
	
	BigNumber Add (BigNumber Second) {
		
		String Result="";
		if((this.compareTo(Second)==1) || (this.compareTo(Second)==0)) {//this > second
			if(Second.getSign()==0) {//P P
				int thisCount = 0;
				int left = 0;
				
				for (int i=0; i < Second.getDigits().size(); i++) {
					int total = this.Digits.get(thisCount++) + Second.getDigits().get(i) + left;
					int remaining = total % 10;
					left = total/10;
					Result = remaining + Result;
				}
				
				if(thisCount < this.Digits.size()) {
					int e;
					while((thisCount<this.Digits.size()) && (e = Digits.get(thisCount))==9 && left == 1) {
						int total = e + left;
						int remaining = total%10;
						left = total/10;
						Result = remaining + Result;
						thisCount++;
					}
					if(left==1 && thisCount < this.Digits.size())
						Result = (this.Digits.get(thisCount++) + left) + Result;
					else if(left==1)
						Result = "1"+ Result;
					for (; thisCount < this.Digits.size(); thisCount++)
						Result = ""+Digits.get(thisCount)+ Result;
				}
				else if(left==1)
					Result = "1" + Result;
				return new BigNumber(Result);
			}
			
			else if(this.getSign()==1) {//N N
				int secondCount = 0;
				int left = 0;
				for (int i=0; i < this.Digits.size(); i++) {
					int total = this.Digits.get(i) + Second.getDigits().get(secondCount) + left;
					int remaining = total%10;
					left = total/10;
					Result = remaining + Result;
					secondCount++;
				}
				
				if(secondCount < Second.getDigits().size()) {
					int e;
					while(left==1 && secondCount < Second.getDigits().size() && (e =Second.getDigits().get(secondCount))==9) {
						int total = e + left; 
						int remaining = total%10;
						left = total/10;
						Result = remaining + Result;
						secondCount++;
					}
					
					if(left==1 && secondCount < Second.getDigits().size())
						Result = (Second.getDigits().get(secondCount++) + left) + Result;
					else if(left==1)
						Result = "1"+ Result;
					for (; secondCount < Second.getDigits().size(); secondCount++) 
						Result= "" + (Second.getDigits().get(secondCount)) + Result;					
				}
				else if(left==1)
					Result = "1" + Result;							
				Result = "-" + Result;
				return new BigNumber(Result);
			}
			
			else {//P N
				BigNumber Second2 = Second;
				Second2.setSign(0);
				if(this.compareTo(Second2)==1) {//this > second
					int thisCount = 0;
					int left = 0;
					for (int i=0; i < Second.getDigits().size(); i++) {
						int d = this.Digits.get(thisCount++) - Second.getDigits().get(i) - left;
						
						if(d<0) {
							left = 1;
							d +=10;
						}
						else
							left = 0;
						
						Result = d + Result;
					}
					if(thisCount < this.Digits.size()) {
						int e;
						while(left==1 && thisCount < this.Digits.size() && (e =this.Digits.get(thisCount))==0) {
							int d = e - left;
							int remaining = d + 10;
							left = 1;
							Result = remaining + Result;
							thisCount++;
						}
						
						if(left==1 && thisCount < this.Digits.size())
							Result = (this.Digits.get(thisCount++) - left) + Result;
						for(; thisCount < this.Digits.size(); thisCount++) 
							Result = this.Digits.get(thisCount) + Result;
						
						return new BigNumber(Result);
					}
					
					for (int i=0; i < Result.length(); i++) {
						if(Result.charAt(i)!='0') {
							Result = Result.substring(i);
							break;
						}
					}
					
					return new BigNumber(Result);
				}
				
				else if(this.compareTo(Second2)==-1) {//second2 bigger
					BigNumber First2 = new BigNumber(this.toString());
					First2.setSign(1);
					BigNumber result2 = Second2.Add(First2);
					result2.setSign(1);
					return result2;	
				}
				
				else {
					return new BigNumber("0");
				}
			}
		}
		else if(this.compareTo(Second)==-1){//second > this
			return Second.Add(this);
		}
		
		else
			return new BigNumber("0");
		
	}
	
	//// //// ////
	
	BigNumber Substarct (BigNumber Second) {

		BigNumber Second2 = Second;
		boolean a;
		
		if(Second.getSign()==0)//P
			a = false;
		else//N
			a = true;
		
		if(a==false)
			Second2.setSign(1);//set negative
		else
			Second2.setSign(0);//set positive
		
		return this.Add(Second2);
		
	}
	
	//// //// ////
	
	int compareTo (BigNumber Second) {//1 = this big //-1 = second big
		
		if(this.Sign==0 && Second.Sign==1)//P N
			return 1;
		else if(this.Sign==1 && Second.Sign==0)//N P
			return -1;
		else if(this.Sign==1 && Second.Sign==1) {//N N
			if(this.Digits.size() < Second.getDigits().size())
				return 1;
			else if(this.Digits.size() > Second.getDigits().size())
				return -1;
			else {
				for (int i = this.Digits.size()-1; i >= 0 ; i--) {
					if(this.Digits.get(i) < Second.getDigits().get(i)) 
						return 1;
					else if(this.Digits.get(i) > Second.getDigits().get(i))
						return -1;
			}
			return 0;
		}
		}
		else {//P P
			if(this.Digits.size() < Second.getDigits().size())
				return -1;
			else if(this.Digits.size() > Second.getDigits().size())
				return 1;
			else {
				for (int i = this.Digits.size()-1; i >= 0 ; i--) {
					if(this.Digits.get(i) < Second.getDigits().get(i))
						return -1;
					else if(this.Digits.get(i) > Second.getDigits().get(i))
						return 1;
				}				
				return 0;
		}
	}
		
	}

	//// //// ////
	
	BigNumber max3 (BigNumber seconddd, BigNumber thirddd) {
		
		int compare1 = this.compareTo(seconddd);
		
		int compare2=0;
		
		if(compare1==1)//firsttt bigger
			compare2 = this.compareTo(thirddd);
		else if(compare1==-1)//seconddd bigger
			compare2 = this.compareTo(thirddd);
		
		if(compare1==1 && compare2==1)//first biggest
			return this;
		else if(compare1==1 && compare2==-1)//thirddd biggest
			return thirddd;
		else if(compare1==-1 && compare2==1)//seconddd biggest
			return seconddd;
		else //(compare1==-1 && compare2==-1)//third biggest
			return thirddd;
		
	}
	
	//// //// ////
	
	public ArrayList<Integer> getDigits() {
		return Digits;
	}

	public void setDigits(ArrayList<Integer> digits) {
		Digits = digits;
	}

	public int getSign() {
		return Sign;
	}

	public void setSign(int sign) {
		Sign = sign;
	}

}
