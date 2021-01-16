/**
 * ArrayUtil exercises.
 */
import java.util.*;

public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j]) && !list.contains(array1[i])) {
                    list.add(array1[i]);
                }
            }
        }
        String[] commonItems = new String[list.size()];
        for(int i = 0; i < commonItems.length; i++){
            commonItems[i] = (String) list.get(i);
        }
        return commonItems;
    }
}
