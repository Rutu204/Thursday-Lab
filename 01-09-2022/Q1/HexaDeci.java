class HexaDeci
{
	public static void main(String args[])
	{
		String hexdec = "7A";
		String hex= "0123456789ABCDEF";                          
		int decimal = 0;
		for (int i = 0; i < hexdec.length(); i++)
		{
			char ch = hexdec.charAt(i);
			int  in= hex.indexOf(ch);
			decimal = 16*decimal + in;
		}
		System.out.print("Hexadecimal Number:\n"+ hexdec);
		System.out.println("\nDecimal Equivalent:\n" + decimal);
	}   
}