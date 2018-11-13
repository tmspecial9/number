public class number
{
	public static void main(String args[])
	{
		int frequency=0;
		int [] a=new int[4];
		for (int k=1021;k<=1098;k++)
		{
			int x=k;
			boolean repeat=false;
			tear(x,a);									//�N4���Ʃ��}
			repeat=repeat(a);							//����4�ӼƦr���L����
			frequency=output(repeat,frequency,k);		//�L���ƫh���X�A�C���X10������
			System.out.print("1");
		}
	}
	public static void tear(int x,int[] a)
	{
		for (int i=3;i>=0;i--)			//�N4���Ʃ��}
		{
			int y=(x%10);
			a[i]=y;
		 	x-=y;
			x/=10;
		}
	}
	public static boolean repeat(int[] a)
	{
		for (int i=0;i<=2;i++)			//����4�ӼƦr���L����
		{
			for (int j=i+1;j<=3;j++)
			{
				if (a[i]==a[j])
				{
					return (true);
				}
			}
		}
		return (false);
	}
	public static int output(boolean repeat,int frequency,int k)
	{
		if (!repeat)					//�L���ƫh���X�A�C���X10������
		{
		    System.out.print(k+"\t");
		    frequency++;
		    if (frequency==10)
		    {
		    	System.out.print("\n");
		    	frequency=0;
		    }
		}
		return (frequency);
	}
}
