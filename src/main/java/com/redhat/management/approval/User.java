package com.redhat.management.approval;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class User implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.lang.String username;
    private java.lang.String email;
    private java.lang.String first_name;
    private java.lang.String last_name;
    private java.lang.Boolean is_active;
    private java.lang.Boolean is_org_admin;
    private java.lang.Boolean is_internal;
    private java.lang.String locale;

    public User() {
    }

    public java.lang.String getUsername() {
        return this.username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    public java.lang.String getEmail() {
        return this.email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(java.lang.String first_name) {
        this.first_name = first_name;
    }

    public java.lang.String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(java.lang.String last_name) {
        this.last_name = last_name;
    }

    public java.lang.Boolean getIs_active() {
        return this.is_active;
    }

    public void setIs_active(java.lang.Boolean is_active) {
        this.is_active = is_active;
    }

    public java.lang.Boolean getIs_org_admin() {
        return this.is_org_admin;
    }

    public void setIs_org_admin(java.lang.Boolean is_org_admin) {
        this.is_org_admin = is_org_admin;
    }

    public java.lang.Boolean getIs_internal() {
        return this.is_internal;
    }

    public void setIs_internal(java.lang.Boolean is_internal) {
        this.is_internal = is_internal;
    }

    public java.lang.String getLocale() {
        return this.locale;
    }

    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }

    public User(java.lang.String username, java.lang.String email,
            java.lang.String first_name, java.lang.String last_name,
            java.lang.Boolean is_active, java.lang.Boolean is_org_admin,
            java.lang.Boolean is_internal, java.lang.String locale) {
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
