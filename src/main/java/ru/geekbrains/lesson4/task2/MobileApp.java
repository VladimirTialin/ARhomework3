package ru.geekbrains.lesson4.task2;

import java.util.Collection;
import java.util.Date;

/**
 * Мобильное приложение
 */
public class MobileApp {

    private final Customer customer;
    private final TicketProvider ticketProvider;

    public MobileApp(TicketProvider ticketProvider, CustomerProvider customerProvider){
        this.ticketProvider = ticketProvider;

        customer = customerProvider.getCustomer("Ivan", "0Ivan0");
    }

    public Collection<Ticket> getTickets(){
        return customer.getTickets();
    }

    public void searchTicket(Date date){
        customer.setTickets(ticketProvider.searchTicket(customer.getId(), new Date()));
    }

    public boolean buyTicket(String cardNo){
        return ticketProvider.buyTicket(customer.getId(), cardNo);
    }

    @Override
    public String toString() {
        return "MobileApp{" +
                "customer=" + customer +
                ", ticketProvider=" + ticketProvider +
                '}';
    }
}