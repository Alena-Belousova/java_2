public class Task2 {
    public static void main(String[] args) {

    System.out.println("sem_2");
        System.out.println("#2");
        String str1 = "Метод сравнения двух строк";
        String str2 = "Метод сравнения строк";
        String str3 = "Метод сравнения двух строк";
        int result = str1.compareTo(str2);
        System.out.println(result );
        result = str2.compareTo(str3);
        System.out.println(result);
        result = str3.compareTo(str1);
        System.out.println(result);
}}
