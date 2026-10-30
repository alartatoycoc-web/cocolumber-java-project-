/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocolumber;

public class User {
    protected String name;
    protected String username;
    protected String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() { return name; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
}
