public class test {

	/**
	 * @param args
	 */
	public void buublesort(int a[])
	{
            int temp  = 0;

             for (int i = 0; i < a.length - 1; ++ i) {
                for (int j = i; j < a.length; ++j) {

                    if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
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
