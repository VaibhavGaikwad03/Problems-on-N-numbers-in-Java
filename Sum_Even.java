import java.lang.*;
import java.util.*;

import javax.print.attribute.standard.MediaSize.ISO;

import MyPackage.ArrayX;

class MyArray extends ArrayX
{
    public MyArray(int iSize)
    {
        super(iSize);
    }

    public int SumEven()
    {
        int iSumEven = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] % 2) == 0)
            {
                iSumEven = iSumEven + Arr[i];
            }
        }
        return iSumEven;
    }
}

class Sum_Even
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
        iRet = mobj.SumEven();

        System.out.println("Addition of Even elements is : "+iRet);
    }
}