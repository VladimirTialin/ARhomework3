package ru.geekbrains.lesson4.task2;

import java.util.Collection;

public class CustomerProvider {

    private Database database;

    public CustomerProvider(Database database) {
        this.database = database;
    }

    public Customer getCustomer(String login, String password){
        Collection<Clients> clients=database.getClients();
        for (Clients client: clients){
            if(login.equals(client.getLogin()) && password.equals(client.getPassword()))
                return new Customer(client.getId(),database.getTickets());
        }
        return  null;
    }
}
