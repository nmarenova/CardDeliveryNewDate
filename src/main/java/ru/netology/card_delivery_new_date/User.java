package ru.netology.card_delivery_new_date;
public class User {
    private final String city;
    private final String name;
    private final String phone;


    public User(String city, String name, String phone) {
        this.city = city;
        this.name = name;
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }


    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
