/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tickettest;


 class Ticket {
    private int id;      
    private double price;  
    private double tax;    

    public Ticket(int id, double price, double tax) {
        this.id = id;
        setPrice(price);
        this.tax = tax;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0.0;
        }
    }

    public double getCost() {
        return price + (price * tax);
    }

    public void display() {
        System.out.println("Ticket ID: " + id);
        System.out.println("Price: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("Total Cost: " + getCost());
    }
}

public class TicketTest {
    public static void main(String[] args) {
        Ticket[] tickets = new Ticket[2];

        tickets[0] = new Ticket(1, 100.0, 0.15); 
        tickets[1] = new Ticket(2, -50.0, 0.10); 

        for (Ticket ticket : tickets) {
            ticket.display(); 
        }
    }
}