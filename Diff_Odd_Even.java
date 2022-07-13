import java.lang.*;
import java.util.*;
import MyPackage.ArrayX;

class MyArray extends ArrayX
{

    public MyArray(int iSize)
    {
        super(iSize);
    }

    public int Difference()
    {
        int iSumEven = 0;
        int iSumOdd = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] % 2) == 0)
            {
                iSumEven = iSumEven + Arr[i];
            }
            if((Arr[i] % 2) != 0)
            {
                iSumOdd = iSumOdd + Arr[i];
            }
        }
        return iSumEven - iSumOdd;
    }
}

class Diff_Odd_Even
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
        iRet = mobj.Difference();

        System.out.println("Difference between even and odd numbers is : "+iRet);
    }
}