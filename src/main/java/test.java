
public class test {

	/**
	 * @param args
	 */
	public void buublesort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j++])
				{
					int tep=a[j];
					 a[j]=a[j++];
					 a[j++]=tep;
				}
			}
		}
	}
	public void initarry(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			a[i]=10-i;
		}
	}
	 public void printarry(int a[]) {
		 for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t1=new test();
		int a[]=new int[10];
		t1.initarry(a);
		t1.printarry(a);
		t1.buublesort(a);
		t1.printarry(a);
		
		

	}

}
