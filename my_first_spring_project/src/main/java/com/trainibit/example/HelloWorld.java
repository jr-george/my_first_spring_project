package com.trainibit.example;

public class HelloWorld {
    private String message;
    private User user;
    // Setter method for dependency injection
    public void setMessage(String message) {
        this.message = message;
    }

    // Method to print the message
    public void printMessage() {
        //System.out.println("Message: " + message);
        System.out.printf("Message: %s, %s %s %s", message, this.user.getName(), this.user.getLastName(), this.user.getBirthDate());
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
