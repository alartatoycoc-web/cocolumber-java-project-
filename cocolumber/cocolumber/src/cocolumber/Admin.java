/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocolumber;

public class Admin extends User {
    public Admin(String name, String username, String password) {
        super(name, username, password);
    }

    public void manageProduct() {
        System.out.println("Admin can add or remove products.");
    }
}