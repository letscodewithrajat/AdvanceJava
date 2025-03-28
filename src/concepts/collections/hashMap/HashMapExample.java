
package concepts.collections.hashMap;

import java.util.HashMap;

/**
 *
 * @author bethan
 */
public class HashMapExample {
    
    public static void main(String[] args) {  

        HashMap<String,Integer> phoneBook = new HashMap<>();
        phoneBook.put("Kevin", 12345);
        phoneBook.put("Jill", 98765);
        phoneBook.put("Brenda", 123123);
        phoneBook.put("Brenda", 22222);
        phoneBook.put(null, 0000);
        if(phoneBook.containsKey("Brenda")){
            phoneBook.remove("Brenda");
        }
        phoneBook.clear();
        System.out.println(phoneBook);
        
        
    }
    
}
