package test;

/**
 *
 * @author alebo
 */
public class CheckResult
{
    static public int checkTirage(int arr1[], int arr2[]){
        int counter = 0;
        for(int i = 0; i < 8; i++)
            for(int j = 0; j < 8; j++)
                if(arr1[i] == arr2[j])
                    counter++;
        if(arr1[8] == arr2[8])
            counter += 10;
        return counter;
    }
}
