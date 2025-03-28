package concepts;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bethan
 */
public class GenericMethods {

    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

    public static List arrayToList(Object[] array, List<Object> list) {
        for (Object object : array) {
            list.add(object);
        }
        return list;
    }

    public static <T> List<T> arrayToListWithGenerics(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        /*List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        List<String> int1List = arrayToList(intArray, new ArrayList<>()); // no compile time error
        System.out.println(int1List.get(0)) ; // casting error at runtime
*/
        List<Character> charList1 = arrayToListWithGenerics(charArray, new ArrayList<>());
        List<Boolean> boolList1 = arrayToListWithGenerics(boolArray, new ArrayList<>());
        List<Integer> intList1 = arrayToListWithGenerics(intArray, new ArrayList<>());
    //    List<String> int1List1 = arrayToListWithGenerics(intArray, new ArrayList<>()); //  compile time error

    }

}
