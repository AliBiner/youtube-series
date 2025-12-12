package com.jd.ders5;

/*
    1. Variable names are case-sensitive.
    2. A variable's name can be any legal identifier — an unlimited-length sequence of Unicode letters and digits, beginning with a letter, the dollar sign "$", or the underscore character "_". 
    3. The convention, however, is to always begin your variable names with a letter, not "$" or "_". 
    4. Additionally, the dollar sign character, by convention, is never used at all.
    5. You may find some situations where auto-generated names will contain the dollar sign, but your variable names should always avoid using it.
    6. A similar convention exists for the underscore character; while it's technically legal to begin your variable's name with "_", this practice is discouraged. 
    7. White space is not permitted.

    8. Subsequent characters may be letters, digits, dollar signs, or underscore characters.
    9. Conventions (and common sense) apply to this rule as well.
    10. When choosing a name for your variables, use full words instead of cryptic abbreviations. Doing so will make your code easier to read and understand.
    11. In many cases it will also make your code self-documenting; fields named cadence, speed, and gear, for example, are much more intuitive than abbreviated versions, such as s, c, and g. Also keep in mind that the name you choose must not be a keyword or reserved word.

    12. If the name you choose consists of only one word, spell that word in all lowercase letters. If it consists of more than one word, capitalize the first letter of each subsequent word. The names gearRatio and currentGear are prime examples of this convention.

    13. If your variable stores a constant value, such as static final int NUM_GEARS = 6, the convention changes slightly, capitalizing every letter and separating subsequent words with the underscore character. By convention, the underscore character is never used elsewhere.
*/












public class Main {

    //Constant variable
    public static final int NUM_GEARS = 6;

    public static void main(String[] args) {
        // int, byte, short, boolean, char, long, double, float

        // [veri tipinin anahtar kelimesi] + [variable/değişken ismi] + [=] + [value/değer];
        int vizeNotu = 100_000_000;

        int vizenotu = 100_000_000;

        int $asda = 100;
        int _a = 1001;

        int asdas = 100;
        int a = 1001;

        //int vize notu = 100;

        int fn = 100;
        int finalNotu = 100;

        //int int = 10;

        int butunleme = 100;
        int butunlemeNotu = 100;

    }
}
