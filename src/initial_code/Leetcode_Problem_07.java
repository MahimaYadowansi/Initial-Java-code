package initial_code;

public class Leetcode_Problem_07 {

	public static void main(String[] args) {
		Leetcode_Problem_07 number=new Leetcode_Problem_07();
		int reversed=number.reverse();
		System.out.println(reversed);
	}
		  public int reverse() {
		int x=-321;
		   int num = Math.abs(x);
	        int rev = 0, rem;
	        while (num != 0) {

	            rem = num % 10;
	            if (rev > (Integer.MAX_VALUE - rem) / 10) {
	                return 0;
	            }
	            rev = ((rev * 10) + rem);
	            num = num / 10;

	        }
	        return (x < 0) ? (-rev) : rev;
	}

}
