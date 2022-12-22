public class Start {
    public static void main(String[] args) {
        String s1 = "United Kingdom";
        String s2 = "Germany";
        String sub1 = s1.substring(0,7).toUpperCase();
        String sub2 = s1.substring(6,14).toUpperCase();
        char[] charArray = sub1.concat(s2.toUpperCase()).concat(sub2).toCharArray();
        System.out.println(charArray);
    }
}
