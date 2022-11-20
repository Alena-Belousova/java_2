public class Task11 {
    public static void main(String[] args) {
        System.out.println("sem_2");
        System.out.println("#11");
        String str1 = "Еще один метод сравнения строк (без учета регистра)";
        String str2 = str1;
        String str3 = new String("Еще один метод сравнения строк");
        String str4 = new String("ЕЩЕ ОДИН МЕТОД СРАВНЕНИЯ СТРОК (БЕЗ УЧЕТА РЕГИСТРА)");
        boolean result;
        result = str1.equalsIgnoreCase(str2);
        System.out.println("Строка str1 совпадает со строкой str2? Ответ: " + result);
        result = str1.equalsIgnoreCase(str3);
        System.out.println("Строка str1 совпадает со строкой str3? Ответ: " + result );
        result = str1.equalsIgnoreCase(str4);
        System.out.println("Строка str1 совпадает со строкой str4? Ответ: " + result );
}}
