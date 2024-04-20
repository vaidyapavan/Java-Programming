package DSA;

public class String_odd_length {
    void odd() {
        String st = "hi this is the pavan ";
        String[] words = st.split("\\s+");

        for (String i : words) {
            if (i.length() % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        String_odd_length obj = new String_odd_length();
        obj.odd();
    }
}
