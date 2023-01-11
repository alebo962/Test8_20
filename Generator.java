package test;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

import java.util.Arrays;
/**
 *
 * @author alebo
 */
public class Generator
{
    public static int [] generateRandom(){
        int [] array = new int[9];
        SecureRandom rnd = new SecureRandom();
        rnd.setSeed(SecureRandom.getSeed(18091962));
        HashSet<Integer> s = new HashSet<>();
        int upperBound = 20;
        while (s.size() < 8)
            s.add(1 + rnd.nextInt(upperBound));
        int i = 0;
        for(int  ele:s)
            array[i++] = ele;
        array[8] = Arrays.stream(array).sum() % 4 + 1;
        return array;
    }
}
