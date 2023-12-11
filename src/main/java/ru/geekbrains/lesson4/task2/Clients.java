package ru.geekbrains.lesson4.task2;

import lombok.Getter;
@Getter
public class Clients {

    private int id;
    private String login;
    private String password;

    public Clients(int id,String login, String password) {
        this.id= id;
        this.login = login;
        this.password = password;
    }
    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
