package ru.geekbrains.lesson4.task2;

import java.util.Date;

class Ticket{

    static int counter = 4000;

    public Ticket(int customerId) {
        id = ++counter;
        this.customerId = customerId;
        this.date = new Date();
        this.qrcode =String.valueOf(id+customerId);
    }

    private int id;
    private int customerId;
    private Date date;
    private String qrcode;

    private boolean enable = true;

    public int getId() {
        return id;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getQrcode() {
        return qrcode;
    }

    public int getCustomerId() {
        customerId=this.id;
        return customerId;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Ticket[" +
                "id:" + id +
                ", customerId:" + customerId +
                ", date:" + date +
                ", qrcode:'" + qrcode + '\'' +
                "]\n";
    }
}