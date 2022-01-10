import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class DuplicateElementsInArray{
    public static void main(String[] args){
        String[] a = {"apple" , "Bird" , "cat" , "Bird", "cat", "cat", "banana", "elephant"};
        Set<String> hasDuplicated = new HashSet<>();
        boolean flag = true;
        
        //Checks what are the duplicated String literals
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = i + 1 ; j < a.length; j++) {
                if (a[i].equals(a[j])) {
                        hasDuplicated.add(a[j]);
                        flag = false;
                        break;
                } 
            }
        }

        if (flag) 
            System.out.println("There are no duplicated strings in this array");
        else 
            System.out.println("The duplicated values are \n" + hasDuplicated);
        
        //find how many times those words has duplicated
        HashMap<String, Integer> duplicateCount = new HashMap<>();
        for (String i : hasDuplicated) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (i.equals(a[j])) {
                   count++;
                }
            }
            duplicateCount.put(i, count);
        }
        
        System.out.println(duplicateCount);
    }
}