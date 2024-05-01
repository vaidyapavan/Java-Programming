package DSA;

class even_length {
    String str = "Hi this is the pavan";

    void check() {
        for (String s : str.split("\\s")) {
            if (s.length() % 2 == 0) {
                System.out.println(s);
            }
        }
    }
}

public class Even_length {
    public static void main(String[] args) {
        even_length obj = new even_length();
        obj.check();
    }
}

