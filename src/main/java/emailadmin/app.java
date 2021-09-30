package emailadmin;

public class app {
    public static void main(String[] args) {
        emails e = new emails("Samarth", "Shah");

        e.setAlternateEmail("samarthshah@gmail.com");
        System.out.println(e.info());
    }
}
