package general;

import java.math.BigInteger;
import java.util.Arrays;

public class CheatSheet {
    public static void main(String[] args) {
        // Primitive
        byte isByte = 1;
        short isShort = 1;
        int isInt = 1;
        long isLong = 1;
        float isFloat = 1.0f;
        double isDouble = 1.0d;
        boolean isBoolean = true;
        char isChar = '1';

        // Reference
        Byte referenceByte = Byte.valueOf(isByte);
        Short referenceShort = Short.valueOf(isShort);
        Integer referenceInteger = Integer.valueOf(isInt);
        Long referenceLong = Long.valueOf(isLong);
        Float referenceFloat = Float.valueOf(isFloat);
        Double referenceDouble = Double.valueOf(isDouble);
        Boolean referenceBoolean = Boolean.valueOf(isBoolean); // Можно обойтись без этого
        Character referenceCharacter = Character.valueOf(isChar);
        /*
        STRING

        charAt(int index); // возвращает букву строки по индексу, [] - так нельзя!
        length();  // возвращает длину строки
        toUpperCase();  // приводит строку к верхнему регистру
        toLowerCase();  // приводит строку к нижнему регистру
        compareTo(String anotherStr);  // лексикографическое сравнение строк
        contains(String str);  // проверяет содержится ли строка внутри строки
        startsWith(String str);  // проверяет начинает ли строка на строку
        endsWith(String str); // проверяет заканчивается ли строка на строку
        indexOf(String str);  // возвращает позицию первого вхождения подстроки в строку
        lastIndexOf(String str);   // возвращает позицию последнего вхождения подстроки в строку
        split(regex reg);  // разбивает строку на массив строк по регулярному выражению
        toCharArray(); // возвращает массив с символами

        STRINGBUILDER

        append(String str); // вставка в конец за константное время
        set(int index, char ch); // изменение буквы внутри строки
        delete(int from, int to);  // удаление куска строки
        deleteCharAt(int index); // удаление символа по индексу
        insert(int index, String str);     // вставка строки по индексу
        reverse(); // обратный порядок симовлов
        */
        String isString = "null";
        Integer[] firstArrayOfNumbers = new Integer[] {1,2,3};
        Integer[] secondArrayOfNumbers = new Integer[] {1,2,3};
        Character[] arrayOfCharacters = new Character[] {'a'};

        Integer[][] firstMatrix = new Integer[][] {{1,2,3},{5,6,7}};
        Integer[][] secondMatrix = new Integer[][] {{1,2,3},{5,6,7}};

        // For example
        long longNumber = 1101101;
        String longToString = Long.toString(Long.valueOf(longNumber));


        int stringLength = isString.length();
        int arrayLength = firstArrayOfNumbers.length;

        boolean firstIsEquals = Arrays.equals(firstArrayOfNumbers,secondArrayOfNumbers);
        boolean secondIsEquals = Arrays.deepEquals(firstMatrix,secondMatrix);

        System.out.println(Arrays.toString(firstArrayOfNumbers));
        System.out.println((Arrays.deepToString(firstMatrix)));

        String charArrayToString = Arrays.toString(arrayOfCharacters);
        char[] stringToCharacterArray= charArrayToString.toCharArray();

        String example = "text";
        String subExample = example.substring(0,2);
        Boolean equalsString = example.equals(subExample);
        Boolean equalsStringIgnoreCase = example.equalsIgnoreCase(subExample);

        String afterReplace = subExample.replace('t','T');
        String upperExample = example.toUpperCase();
        Character atFirst = example.charAt(0);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append("world!");
        System.out.println(stringBuilder.toString());

        Boolean endsWithText = example.endsWith("text");
        Boolean containsText = example.contains("Is");

        while (true) {
            break;
        }
        // fori
        for (int i = 0; i < 1; i++) {
            break;
        }
    }
}
