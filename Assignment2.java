/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package assignment2;
import java.util.EmptyStackException;
import java.util.*;
/**
 *
 * @author hamma
 */
public class Assignment2 {

    public static void main(String[] args) {
        
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push_element("Hammad");
        stringStack.push_element("Usman");
        System.out.println("Size: " + stringStack.size());

        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop_element());
        }

        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push_element(42);
        intStack.push_element(73);
        System.out.println("Size: " + intStack.size());

        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop_element());
        }
    }
        
    
}

 class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }
class GenericStack<T> {
    private Node<T> top;
    private int size;

     void push_element(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

     T pop_element() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

     boolean isEmpty() {
        return top == null;
    }

     int size() {
        return size;
    }

    

   
        
}
