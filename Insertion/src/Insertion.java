// my first insertion algorithm  
/*public class Insertion{
	public static void main(String[] args)
	{
		int[] c={34,8,10,154,25,154,58,95,98,6,32,154,446,46};//
		System.out.println("原始顺序：");
		printA(c);
		inser_sort(c);
		System.out.println("排序顺序：");
        printA(c);
	}
	public static void printA(int[] a)
	{
		for(int i=0 ; i< a.length; i++)
		{
			System.out.print(a[i]+"  ");
		}		
	}
	
	public static void inser_sort(int[] a)
	{  
		int temp;
		if(a[0]>a[1]) 
		{
			int atemp= a[0];
			a[0] = a[1];
			a[1] = atemp;
		}
		for(int j = 2; j < a.length; j++)
		{
			for(int k =j; k>0 ; k--)
			{
				if(a[k-1]>=a[k])
				{
                   int tp = a[k];
                   a[k] = a[k-1];
                   a[k-1]= tp;
				}else k = 0;
			}
		}		
	}
}
*/
// wiki 
public class Insertion {    
    public static void insertionSort(Comparable []data) {    
        for(int index = 1; index < data.length; index++) {    
            Comparable key = data[index];    
            int position = index;    
            //shift larger values to the right    
            while (position > 0 && data[position - 1].compareTo(key) > 0) {    
                data[position] = data[position - 1];    
                position--;    
            }    
            data[position] = key;    
        }       
    }    
    public static void main(String []args) {    
        Comparable []c = {4, 9, 23, 1, 45, 27, 5, 2};   
        System.out.print("原始排序结果：");  
        for(int i= 0; i<c.length; i++)
        {
        	System.out.print(c[i]+"->");
        }
        System.out.println("");
        insertionSort(c);    
        System.out.print("插入排序结果：");  
        for(int i = 0; i < c.length; i++)    
            System.out.print( c[i]+"->");    
    }    
}  