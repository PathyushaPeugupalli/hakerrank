package practise;

public class task3 {

	public static void main(String[] args) {
		String s1 = "11373"; 
		int l = s1.length(); 
		System.out.print(countPrimeStrings(s1, l)); 

	}

	
static final int MOD =1000000007; 

// Function to check whether a number 
// is a prime number or not 
static boolean isPrime(String number) 
{ 
	int num = Integer.valueOf(number); 
	
	for(int i = 2; i * i <= num; i++) 
	{ 
	if ((num % i) == 0) 
		return false; 
	} 
	return num > 1 ? true : false; 
} 

// Function to find the count 
// of ways to split String 
// into prime numbers 
static int countPrimeStrings(String number, int i){ 

	if (i == 0) 
		return 1; 
		
	int cnt = 0; 

	 
	for(int j = 1; j <= 6; j++) 
	{ 
	
	if (i - j >= 0 && 
		number.charAt(i - j) != '0' && 
		isPrime(number.substring(i - j, i))) 
	{ 
		cnt += countPrimeStrings(number,i - j); 
		cnt %= MOD; 
	} 
	} 
	return cnt; 
}
}
