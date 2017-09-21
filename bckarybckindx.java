class bckarybckindx 
{
	public static void main(String[] args) 
	{
		String s1="hoga beda huduga nana bittu";
		String arr[]=s1.split(" ");

		for (int i=0;i<=arr.length-1;i++)
		{
			String s2=arr[i];
			for (int j=s2.length()-1;j>=0;j-- )
			{
                    System.out.print(s2.charAt(j));
			}
			System.out.print(" ");
		  	
		}
		
	}
}
