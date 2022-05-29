package ru.netology.domain;

public class Post {
    public String name; // поле для имени
    public String patronymic;
    public String surname;
    public String passport;
    public String phone;
    public boolean subscription;

    FormDate birthday = new FormDate();
}