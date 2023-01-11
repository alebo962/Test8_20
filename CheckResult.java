package test;

/**
 *
 * @author alebo
 */
public class CheckResult
{
    static int summ [] = {300, 600,1500, 3000,7500, 15_000,45_000, 90_000,1_000_000};
    static public int checkTirage(int arr1[], int arr2[]){
        int counter = 0;
        int add = 0;
        for(int i = 0; i < 8; i++)
            for(int j = 0; j < 8; j++)
                if(arr1[i] == arr2[j])
                    counter++;
        if(arr1[8] == arr2[8])
            add = 1;
        if(counter == 4 && add == 1)
            return 300;
        else if(counter > 4)
            return summ[counter * 2 + add - 9];
        else
            return 0;
    }
}
