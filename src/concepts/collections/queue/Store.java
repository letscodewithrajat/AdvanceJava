/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concepts.collections.queue;

import java.util.LinkedList;

/**
 *
 * @author betha
 */
public class Store {
    
    public static void main(String[] args) {                
        
        LinkedList<Customer> queue = new LinkedList();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));
        System.out.println(queue);

        serverCustomer(queue);
        System.out.println(queue);
    }

    static void serverCustomer(LinkedList<Customer> queue){
        Customer c = queue.poll();
        c.serve();
    }
    
    
}
