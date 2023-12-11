package ru.geekbrains.lesson4.task2;

import java.awt.*;
import java.util.Collection;
import java.util.Date;

public class Program {

    /**
     * Разработать контракты и компоненты системы "Покупка онлайн билетов на автобус в час пик".
     * @param args
     */
    public static void main(String[] args) {

        Core core = new Core();

        MobileApp mobileApp = new MobileApp(core.getTicketProvider(), core.getCustomerProvider());

        BusStation busStation = new BusStation(core.getTicketProvider());
        System.out.println(mobileApp.buyTicket("1000000000001"));
        Collection<Ticket> tickets =mobileApp.getTickets();
        System.out.println(tickets);
        System.out.println(busStation.checkTicket("4019"));



    }

}
