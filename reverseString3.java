public class reverseString3 {
    public static void main(String[] args) {
        String input = new String("ABCDE");

        StringBuffer sb = new StringBuffer(input);
        System.out.println("Reversed string : " + sb.reverse());
    }
}
