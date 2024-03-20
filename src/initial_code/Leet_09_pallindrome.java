package initial_code;

public class Leet_09_pallindrome {

	public static void main(String[] args) {
		Leet_09_pallindrome pallindrome=new Leet_09_pallindrome();
		System.out.println( pallindrome.isPalindrome(121));

	}
	
	public boolean isPalindrome(int x) {
        int num = 0, temp = x;

        int div, rem;
        if(x<0)
        {
            return false;
        }
        while (x != 0 ) {

            rem = x % 10;
            num = num * 10 + rem;
            x = x / 10;
        }
      
        if (temp == num) {
            return true;
        } else {
            return false;
        }

}
}
