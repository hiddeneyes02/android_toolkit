package com.dzboot.template.helpers;


@SuppressWarnings("unused")
public class NumberUtils {

   public static String arabicToEnglishNumeralsFancyWay(String number) {
      char[] chars = new char[number.length()];
      for (int i = 0; i < number.length(); i++) {
         char ch = number.charAt(i);
         if (ch >= 0x0660 && ch <= 0x0669)
            ch -= 0x0660 - '0';
         else if (ch >= 0x06f0 && ch <= 0x06F9)
            ch -= 0x06f0 - '0';
         chars[i] = ch;
      }
      return new String(chars);
   }

   public static String arabicToEnglishNumerals(String value) {
      return String.valueOf(value)
            .replaceAll("١", "1")
            .replaceAll("٢", "2")
            .replaceAll("٣", "3")
            .replaceAll("٤", "4")
            .replaceAll("٥", "5")
            .replaceAll("٦", "6")
            .replaceAll("٧", "7")
            .replaceAll("٨", "8")
            .replaceAll("٩", "9")
            .replaceAll("٠", "0");
   }

   public static String englishToArabicNumerals(int value) {
      return String.valueOf(value)
            .replaceAll("1", "١")
            .replaceAll("2", "٢")
            .replaceAll("3", "٣")
            .replaceAll("4", "٤")
            .replaceAll("5", "٥")
            .replaceAll("6", "٦")
            .replaceAll("7", "٧")
            .replaceAll("8", "٨")
            .replaceAll("9", "٩")
            .replaceAll("0", "٠");
   }
}
