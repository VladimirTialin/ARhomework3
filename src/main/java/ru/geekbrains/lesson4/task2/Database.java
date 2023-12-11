package ru.geekbrains.lesson4.task2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collection;
@Getter
public class Database {


    private static int counter = 100;

    private Collection<Ticket> tickets = new ArrayList<>();

    private Collection<Customer> customers = new ArrayList<>();
    private Collection<Clients> clients= new ArrayList<>();


    public Database(){
        GeneratorDataBase generatorDataBase = new GeneratorDataBase();
        tickets= generatorDataBase.baseTicket();
        customers= generatorDataBase.baseCustomer();
        clients= generatorDataBase.baseClients();
    }

    /**
     * Получить актуальную стоимость билета
     * @return
     */
    public double getTicketAmount(){
        return 45;
    }

    /**
     * Получить идентификатор заявки на покупку билета
     * @return
     */
    public int createTicketOrder(int clientId){
        for (Clients id:clients){
            if(id.getId()==clientId)
                return clientId;
        }
        return -1;
    }
}