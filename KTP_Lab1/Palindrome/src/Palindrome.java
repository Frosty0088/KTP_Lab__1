public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i]; //запись слов в массив
            reverseString(s);
            isPalindrome(s);
        }

    }

    public static String reverseString(String s) //функция вывода перевернутого слова
    {
        int N = s.length(); //считывание длины слова
        for (int i = N-1; i >= 0; i--){

        }
        //System.out.print("\n");
        //System.out.println(i); строка выводит количество букв в слове
        return s;
    }

    public static boolean isPalindrome(String s) // функция проверки слова на палиндромность
    {
        String r = "";
        int N = s.length();
        for (int i = N-1; i >= 0; i--){
            r += s.charAt(i);
        }
        boolean P = r.equals(s); // сравнение слов
        if (P == true) //проверка на палиндромность
            System.out.println(s + " is palindrome");
        else System.out.println(s + " isn't palindrome");
        return P;
    }
}
