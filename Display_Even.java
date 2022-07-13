import java.lang.*;
import java.util.*;
import MyPackage.ArrayX;

class MyArray extends ArrayX
{
    public MyArray(int iSize)
    {
        super(iSize);
    }

    public void DisplayEven()
    {
        System.out.println("Even numbers are : ");
        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] % 2) == 0)
            {
                System.out.println(Arr[i]);
            }
        }
    }
}

class Display_Even
{
    public static void main(String arg[])
    {
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        int iSize = sobj.nextInt();

        MyArray mobj = new MyArray(iSize);

        mobj.Accept();
        mobj.Display();
        mobj.DisplayEven();
    }
}