// Файл util.java
// Статичнi методи, якi багаторазово використовуються у програмi
package com.company;
import java.io.*;

public class util {
    // ------------------------------------
    // Введення рядка символiв
    // Аргумент - текст, який включається у запрошення
    public static String readString(String text) {
        int rc = 0;
        byte[] ba = new byte[100];
        System.out.print("Введiть " + text + ">");
        System.out.flush();
        try {
            rc = System.in.read(ba);
        } catch (IOException e) {
        }
        return (new String(ba, 0, rc)).trim();
    }

    // ------------------------------------
    // Введення значень 0/1 для типу boolean
    // Аргумент - текст, який включається у запрошення
    public static boolean readBoolean(String text) throws NumberFormatException {

        String s = readString(text + " (1-так/0-нi)");
        if (s.equals("0"))
            return false;
        else if (s.equals("1"))
            return true;
        else
            throw new NumberFormatException();
    }

    // ----------------------------------------------
    // Вирiвнювання рядка до заданної довжини
    // Аргументи: s - рядок, що вирiвнюється
    // l - потрiбна довжина рядка
    static String leftString(String s, int l) {
        if (s.length() > l)
            s = s.substring(0, l);
        else
            while (s.length() < l)
                s = s + ' ';
        return s;
    }

    // ----------------------------------------------
    // Переворення типу double на рядок заданої довжини
    // Аргументи: d - число, яке представляється
    // l - потрiбна довжина рядка
    static String leftString(double d, int l) {
        return leftString("" + d, l);
    }

    // ----------------------------------------------
    // Переворення типу int на рядок заданої довжини
    // Аргументи: i - число, яке представляється
    // l - потрiбна довжина рядка
    static String leftString(int i, int l) {
        return leftString("" + i, l);
    }

    // ----------------------------------------------
    // Переворення типу short на рядок заданої довжини
    // Аргументи: i - число, яке представляється
    // l - потрiбна довжина рядка
    static String leftString(short i, int l) {
        return leftString("" + i, l);
    }

    // ----------------------------------------------
    // Переворення типу boolean на рядок заданої довжини
    static String leftString(boolean b, int l)
    // Аргументи: b - логiчне значення, яке представляється
    // l - потрiбна довжина рядка
    {
        String s = null;
        if (b)
            s = "так";
        else
            s = "нi";
        return leftString(s, l);
    }
    static String letString(boolean b, int l)
    // Аргументи: b - логiчне значення, яке представляється
    // l - потрiбна довжина рядка
    {
        String s = null;
        if (b)
            s = "так";
        else
            s = "нi";
        return leftString(s, l);
    }
}
}
