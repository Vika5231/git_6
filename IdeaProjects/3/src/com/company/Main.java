// Файл demo1.java
// Перевiрка результатiв роботи №1
package com.company;
class Main {
    public static void main(String argv[]) {
        // Перевiрка пустого конструктора та методiв доступу
        Animal a1 = new Animal();
        AnimalRepres ar = Animal.getTerminalRepres();
        a1.setKind("ведмiдь бiлий");
        a1.setName("Умка");
        a1.setYear(1999);
        a1.setSex('F');
        a1.setWeight(250.0);
        a1.setLivetime((short) 20);
        a1.setRarity((short) 4);
        System.out.println(a1.getKind() + " " + a1.getName() + " "
                + a1.getYear() + " " + a1.getSex() + " " + a1.getWeight() + " "
                + a1.getLivetime() + " " + a1.getRarity());
        // Перевiрка повного конструктора та метода toString
        Animal a2 = new Animal("тигр бенгальський", "Рабiндранат", 2000, 'M',
                170.0, (short) 12, (short) 3);
        System.out.println(a2);
        // Перевiрка неповних конструкторiв i методу printCard
        Animal a3 = new Animal("iрбiс", "Василiса", 2003, 'F', 47.0,
                (short) 12, (short) 3);
        Animal a4 = new Animal("пацюк сiрий", "Крiстофер", 2003, 'M', 0.4,
                (short) 5, (short) 0);
        ar.printCard(a3);
        ar.printCard(a4);
        // Перевiрка пустого конструктора i методу kbInput
        Animal a5 = new Animal();
        if (!AnimalRepres.kbInput(a5))
            a5 = new Animal();
        // Перевiрка методу printLine
        //ar.printLine(a1);
        ar.printLine(a2);
        ar.printLine(a3);
        ar.printLine(a4);
        ar.printLine(a5);
        // Мы повиннi побачити на екранi список з 5 рядкiв
        // з рiвними стовпчиками
    }
}
