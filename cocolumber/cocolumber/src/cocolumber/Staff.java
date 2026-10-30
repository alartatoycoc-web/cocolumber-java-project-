/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocolumber;

public class Staff extends User {
    public Staff(String name, String username, String password) {
        super(name, username, password);
    }

    public void processSale() {
        System.out.println("Staff processes customer sales.");
    }
}
