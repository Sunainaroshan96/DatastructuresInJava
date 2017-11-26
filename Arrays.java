package arrays;

//UNORDERED array

public class Arrays
{
    private long[] anArray;
    private int noOfElements=0;
    private int[] indexes;
    int count = 0;
    
    //Initializing the array
    Arrays(int max)
    {
        anArray = new long[max];
        indexes = new int[max];
    }
    
    //inserting with check for overflow
    public void insert(int element)
    {
        if(noOfElements==(anArray.length))
        {
            System.out.println("Cant Insert Anymore Woman");
            return;
        }
        anArray[noOfElements]=element;
        noOfElements++;
    }
    
    //search for key which maybe present multiple times
    public boolean search(int element)
    {
        char flag = 'N';
        
        for(int i = 0; i<noOfElements ; i++)
        {
            if(anArray[i]==element)
            {
                flag = 'Y';
                indexes[count]=i;
                count++;
            }
        }
        if(flag=='N')
        {
            System.out.println("Element not found");
            return false;
        }
        System.out.println("Element found");
        return true;
    }
    
    //
    public void delete(int element)
    {
        if(search(element))
        {
            for(int j = 0;j<=(count-1);j++)
            {
                for(int k = indexes[j];(k+1)<noOfElements;k++)
                {
                    anArray[k] = anArray[k+1];
                }
                noOfElements--;
            }
        }
    }
    
    public void display()
    {
        System.out.println("The elements are :");
        for(int i = 0; i<noOfElements; i++)
        {
            System.out.println(anArray[i]);
        }
    }
}
