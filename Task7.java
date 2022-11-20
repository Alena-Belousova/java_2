public class Task7 {
    public static void main(String[] args) {
        System.out.println("sem_2");

        System.out.println("#7");
        char[] mas = {'П', 'р', 'о', ' ', 'н', 'а', 'п','и','с','а','н','и','е',' ','с','т','р','о','к','и',' ','ч','е','р','е','з',' ','м','а','с','с','и','в'};
        String str = "";
        str = str.copyValueOf(mas);
        System.out.println("строка,созданная из массива: " + str);
        str = str.copyValueOf(mas, 7, 6);
        System.out.println("подмассив: " + str);
}}
