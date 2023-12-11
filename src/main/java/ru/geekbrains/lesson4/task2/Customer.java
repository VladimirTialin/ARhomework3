package ru.geekbrains.lesson4.task2;


import java.util.ArrayList;
import java.util.Collection;

public class Customer {
    private int id;
    private Collection<Ticket> tickets = new ArrayList<>();
    public Customer(){
    }
    public Customer(int id, Collection<Ticket> ticket){
        this.id = id;
        this.tickets=ticket;
    }
    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
