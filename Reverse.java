class Reverse
{
	public static void main(String args[])
	{
		int num;
		int reversed = 0;
		num = Integer.parseInt(args[0]);
		
		while(num != 0)
		{
			int temp = num % 10;
			
			reversed = (reversed * 10) + temp;
			num /= 10;
		}
		
		System.out.println("The reversed number is: " + reversed);
	}
}