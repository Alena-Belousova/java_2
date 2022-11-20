public class Task20 {
    public static void main(String[] args) {
        System.out.println("sem_2");
        System.out.print("#20"+'\t');
        String b = new String("метод ");
        String c = new String("string.intern()");
        System.out.print("Каноническое представление: " );
        System.out.println((b.intern())+(c.intern()));
}}
