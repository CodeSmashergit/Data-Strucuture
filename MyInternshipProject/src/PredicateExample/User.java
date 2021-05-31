/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PredicateExample;

import java.util.Objects;

/**
 *
 * @author HP
 */
public class User {

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        User other=(User)obj;
        return (this.name.equals(other.name)&&this.role.equals(other.role));
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", role=" + role + '}';
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
    private String name,role;
    
}
