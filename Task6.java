public class Task6 {
    public static void main(String[] args) {
        System.out.println("sem_2");
        System.out.print("#6"+'\t');
        String str1 = "Метод для сравнения строк";
        String str2 = "Метод для сравнения строк с выводом true/false";
        StringBuffer str3 = new StringBuffer("Метод для сравнения строк");
        StringBuffer str4 = new StringBuffer("Метод для сравнения строк с выводом true/false");
        boolean  r3 = str1.contentEquals(str3);
        System.out.println("Строка \"Метод для сравнения строк\" совпадает с \"Метод для сравнения строк\"? \n" + r3);
        boolean  r4 = str1.contentEquals(str4);
        System.out.println("Строка \"Метод для сравнения строк\" совпадает с \"Метод для сравнения строк с выводом true/false\"? \n" + r4);

    }}
