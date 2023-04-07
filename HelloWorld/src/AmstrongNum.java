jkkk
public class AmstrongNum {

	public static void main(String[] args) {
		int n= 102;
		int temp= n;
		int r,sum=0;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			sum= sum+r*r*r;
		}
		if(temp == sum)
			System.out.println("It is a amstrong number");
		else {
			System.out.println("It is not");
		}

	}

}


//git fetch
//git pull