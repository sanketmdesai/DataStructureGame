
package com.rajeshpatkar.datastructuregame;

public class DataStructureGame {

    public static void main(String[] args) {
        SolutionInterface c = new Solution();
        int [] intArray1 = {32,34,56,34,98,78,90,53,81,123};
        int x = c.findDuplicate(intArray1);
        System.out.println("Entered Input Array : "+arrayToString(intArray1));
        System.out.println("expected result" + 34);
        System.out.println("Obtined "+x);
        if(x == 34)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
        int [] intArray2 = {32,34,56,134,98,78,90,53,81,765,226,318,435,134,123};
        x = c.findDuplicate(intArray2);
        System.out.println("Entered Input Array : "+arrayToString(intArray1));
        System.out.println("expected result" + 134);
        System.out.println("Obtined "+x);
        if(x == 134)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
    
    static String arrayToString(int[] intArray)
    {
        String s = "";
        s+=intArray[0];
        for(int i=1;i<intArray.length ; i++)
        {
            s+=","+intArray[i];
        }
        return s;
    }
}

