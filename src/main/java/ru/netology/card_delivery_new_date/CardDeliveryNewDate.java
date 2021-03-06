package ru.netology.card_delivery_new_date;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CardDeliveryNewDate {
    private CardDeliveryNewDate() {
    }

    public static class Registration {
        private Registration() {
        }

        public static User generateUser() {
            Faker faker = new Faker(new Locale("ru"));
            return new User(faker.address().city(), faker.name().fullName(), faker.phoneNumber().phoneNumber());
        }

        public static String getDate(int date) {
            LocalDate today = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate newDate=today.plusDays(date);
            return formatter.format(newDate);
        }
    }
}