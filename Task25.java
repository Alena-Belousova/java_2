public class Task25 {
    public static void main(String[] args) {
        System.out.println("sem_2");
        System.out.print("#25"+'\t');
        String str = "Про опреденение колличества знаков в строке";
        System.out.println(str);
        int len = str.length();
        System.out.println( "в строке выше " + len + " символа.");
        String str1= "Про опреденение колличества знаков в строке";
        int len1 = str1.length();
        System.out.println( "Длина строки \"Про опреденение колличества знаков в строке\": " + len + " символа.");
        System.out.println( "Длина строки \"Про опреденение колличества знаков в строке\": " + len1 + " символа.");
        if (len > len1){
            System.out.println( "ответ: первая строка длиннее второй");
        }
        else if (len < len1){
            System.out.println( "ответ: вторая строка длиннее первой");
        }
        else {
            System.out.println( "ответ: строки равны");
        }
}}
