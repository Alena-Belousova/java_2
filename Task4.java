public class Task4 {
    public static void main(String[] args) {

    System.out.println("sem_2");
        System.out.println("#4");
        String st1 = "Сравнение, игнорируя регистр букв";
        String st2 = "сравнение, игнорируя регистр букв";
        String st3 = "Сравнение, игнорируя Регистр";
        int r = st1.compareToIgnoreCase(st2);
        System.out.println(r);
        r = st2.compareToIgnoreCase(st3);
        System.out.println(r);
        r = st3.compareToIgnoreCase(st1);
        System.out.println(r);

    }}
