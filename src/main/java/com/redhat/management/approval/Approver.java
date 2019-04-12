package com.redhat.management.approval;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Approver implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.lang.Integer id;
    private java.lang.String firstName;
    private java.lang.String lastName;
    private java.lang.String userName;
    private java.lang.String emailAddress;

    public Approver() {
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public java.lang.String getLastName() {
        return this.lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public java.lang.String getUserName() {
        return this.userName;
    }

    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    public java.lang.String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Approver(java.lang.String userName, java.lang.String emailAddress, 
            java.lang.String firstName, java.lang.String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.emailAddress = emailAddress;
    }
    
    public String toString() {
        return "\nApprover: " +
        "\n firstName: " + this.firstName +
        "\n lastName: " + this.lastName +
        "\n userName: " + this.userName +
        "\n emailAddress: " + this.emailAddress;
    }

}
