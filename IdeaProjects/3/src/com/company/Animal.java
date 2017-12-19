// Файл Animal.java
// Визначення класу Тварина
package com.company;
public class Animal {
    private String kind = ""; // назва виду
    private String name = ""; // iм'я тварини
    private int year = -1; // рiк народження
    private char sex = ' '; // стать
    private double weight = 0; // вага
    private short livetime = -1; // тривалiсть життя виду у неволi
    private short rarity = 0; // категорiя рiдкостi виду

    // -------------------------------------------------------
    // КОНСТРУКТОРИ
    // -------------------------------------------------------
    // "Пустий" конструктор
    Animal() {
    }

    // -------------------------------------------------------
    // "Повний" конструктор
    Animal(String kind, String name, int year, char sex, double weight,
           short livetime, short rarity) {
        this.name = name;
        this.kind = kind;
        this.year = year;
        this.sex = sex;
        this.weight = weight;
        this.livetime = livetime;
        this.rarity = rarity;
    }

    // -------------------------------------------------------
    // Конструктор без livetime
    Animal(String kind, String name, int year, char sex, double weight,
           short rarity) {
        this(name, kind, year, sex, weight, (short) -1, rarity);
    }

    // -------------------------------------------------------
    // Конструктор без livetime и без rarity
    Animal(String kind, String name, int year, char sex, double weight) {
        this(name, kind, year, sex, weight, (short) -1, (short) -1);
    }

    // -------------------------------------------------------
    // Методи доступу до полiв класу (акцесори)
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setLivetime(short livetime) {
        this.livetime = livetime;
    }

    public short getLivetime() {
        return livetime;
    }

    public void setRarity(short rarity) {
        this.rarity = rarity;
    }

    public short getRarity() {
        return rarity;
    }

    // -------------------------------------------------------
    // Перетворення на рядок
    public String toString() {
        return kind + " " + name + " " + sex + " " + year + " " + weight + " "
                + livetime + " " + rarity;
    }

    // -------------------------------------------------------
    // Створення екземпляра класу-представника
    public static AnimalRepres getTerminalRepres() {
        return AnimalRepres.getInstance();
    }
}
