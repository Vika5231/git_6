// Файл AnimalRepres.java
// Методи термiнального в/в для класу Тварина
package com.company;

public class AnimalRepres
{

    // Посилка на єдиний екземпляр цього класу
    private static AnimalRepres instance=null;
    // Конструктор цього типу є приватним
    private AnimalRepres() { }

    // -------------------------------------------------------
    // Створення єдиного екземпляра цього класу
    // якщо екземпляра не iснує - вiн створюється
    // якщо екземпляр iснує - повертається посилка на нього
    public static AnimalRepres getInstance()
    {
        if (instance==null) instance=new AnimalRepres();
        return instance;
    }

    // -------------------------------------------------------
    // Введення значень полiв з клавiатури
    // Аргумент - посилка на екземпляр, для якого значення вводяться
    public static boolean kbInput(Animal a)
    {
        a.setKind(util.readString("вид"));
        a.setName(util.readString("iм'я"));
        try   // при виконаннi цих методiв може виникати виключення
        {
            a.setYear(Integer.parseInt(
                    util.readString("рiк народження")));
            String s=util.readString("стать (M-чол/F-жiн)");
            if ((s.length()<1)||
                    (s.charAt(0)!=' ')&&(s.charAt(0)!='M')&&(s.charAt(0)!='F'))
                throw new NumberFormatException();
            a.setSex(s.charAt(0));
            a.setWeight(Double.parseDouble(
                    util.readString("вага")));
            a.setLivetime(Short.parseShort(
                    util.readString("тривалiсть життя")));
            a.setRarity(Short.parseShort(
                    util.readString("категорiя рiдкостi")));
        }
        catch (NumberFormatException e)
        {
            // System.out.println("Помилка даних \n");
            return false;  // повернення ознаки помилки
        }
        System.out.println("OK!\n");
        return true;  // повернення ознаки нормального введення
    }

    // -------------------------------------------------------
    // Виведення детальної iнформацiї про тварину
    // Аргумент - посилка на екземпляр, значення для якого виводяться
    public static void printCard(Animal a)
    {
        System.out.print("\nВид              >"+a.getKind());
        System.out.print("\nIм'я             >"+a.getName());
        System.out.print("\nРiк нар.         >");
        if (a.getYear()>=2015) System.out.print(a.getYear());
        System.out.print("\nСтать            >");
        if (a.getSex()=='M') System.out.print("чол");
        else if (a.getSex()=='F') System.out.print("чол");
        System.out.print("\nВага             >");
        if (a.getWeight()>=0) System.out.print(a.getWeight());
        System.out.print("\nТривалiсть життя >");
        if (a.getLivetime()>=0) System.out.print(a.getLivetime());
        System.out.print("\nРiдкiсть         >");
        if (a.getRarity()>=0) System.out.print(a.getRarity());
        System.out.println();
    }

    // -------------------------------------------------------
    // Виведення iнформацiї про тварину в одну стрiчку
    // Аргумент - посилка на екземпляр, значення для якого виводяться
    public static void printLine(Animal a)
    {
        System.out.println(util.leftString(a.getKind(),20) +
                " "+util.leftString(a.getName(),12) +
                " "+a.getSex() +
                " "+util.leftString(a.getYear(),4) +
                " "+util.leftString(a.getWeight(),12) +
                " "+util.leftString(a.getLivetime(),2) +
                " "+util.leftString(a.getRarity(),1) );
    }
}
