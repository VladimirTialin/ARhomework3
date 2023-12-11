package ru.geekbrains.lesson4.task2;

import java.util.ArrayList;
import java.util.Collection;

public class GeneratorDataBase {
    private static final int count = 10;
    public Collection<Ticket> baseTicket() {
        Collection<Ticket> tickets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tickets.add(new Ticket(i));
        }
        return tickets;
    }

    public Collection<Customer> baseCustomer() {
        Collection<Customer> customers = new ArrayList<>();
        for (Clients x : baseClients()) {
            customers.add(new Customer(x.getId(), baseTicket()));
        }
        return customers;
    }

    public Collection<Clients> baseClients() {
        Collection<Clients> clients = new ArrayList<>();
        String[] login = {"Ivan", "Peter", "Vova", "Svetlana", "Nastya", "Sergey"};
        for (int i = 0; i < login.length; i++) {
            clients.add(new Clients(i + count, login[i], i + login[i] + (i * 3)));
        }
        return clients;
    }
}
