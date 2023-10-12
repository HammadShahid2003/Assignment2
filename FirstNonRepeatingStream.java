/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;
import java.util.*;


public class FirstNonRepeatingStream {
    private Map<Character, Integer> count; 
    private HashSet<Character> characters; 

    public FirstNonRepeatingStream() {
        count = new LinkedHashMap<>();
        characters = new HashSet<>();
    }
  char getFirstNonRepeating() {
        for (char c : characters) {
            
            if (count.get(c) == 1) {
                return c;
            }
        }

        
        return '-';
    }
     void add(char c) {
        
        count.put(c, count.getOrDefault(c, 0) + 1);

      
        if (!characters.contains(c)) {
            characters.add(c);
        }
    }

 

    public static void main(String[] args) {
        FirstNonRepeatingStream stream = new FirstNonRepeatingStream();
        String in;
        Scanner sc=new Scanner(System.in);
        
        System.out.println(" Enter characters: ");
        in=sc.next();
        for (int i = 0; i < in.length(); i++) {
        char character = in.charAt(i);

  
         if (character != ',') {
        stream.add(character);
        }
            }
        
       
        System.out.println("First non-repeating: " + stream.getFirstNonRepeating()); 
    
       
    }
}
