package com.redhat.management.approval;

import java.io.Serializable;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class User implements Serializable {

    static final long serialVersionUID = 1L;

    private String username;
    private String email;
    private String first_name;
    private String last_name;
    private Boolean is_active;
    private Boolean is_org_admin;
    private Boolean is_internal;
    private String locale;

    public User() {
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Boolean getIs_active() {
        return this.is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public Boolean getIs_org_admin() {
        return this.is_org_admin;
    }

    public void setIs_org_admin(Boolean is_org_admin) {
        this.is_org_admin = is_org_admin;
    }

    public Boolean getIs_internal() {
        return this.is_internal;
    }

    public void setIs_internal(Boolean is_internal) {
        this.is_internal = is_internal;
    }

    public String getLocale() {
        return this.locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public User(String username, String email,
            String first_name, String last_name,
            Boolean is_active, Boolean is_org_admin,
            Boolean is_internal, String locale) {
        this.username = username;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.is_active = is_active;
        this.is_org_admin = is_org_admin;
        this.is_internal = is_internal;
        this.locale = locale;
    }
    
    public String toString() {
        return "User: " +
          "\n username: " + this.username +
          "\n email: " + this.email +
          "\n first_name: " + this.first_name +
          "\n last_name: " + this.last_name +
          "\n is_org_amdin: " + this.is_org_admin;
    }

}
