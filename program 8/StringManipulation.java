public class StringManipulation {

    public static void main(String[] args) {

        String str = "hello,world1";

        int length = str.length();
        System.out.println("Length: " + length);

        String uppercase = str.toUpperCase();
        System.out.println("Uppercase: " + uppercase);

        String lowercase = str.toLowerCase();
        System.out.println("Lowercase: " + lowercase);

        String replace = str.replace('o', 'x');
        System.out.println("Replace: " + replace);

        String substring = str.substring(7);
        System.out.println("Substring: " + substring);

        boolean startsWith = str.startsWith("hello");
        System.out.println("Starts with hello: " + startsWith);

        boolean endsWith = str.endsWith("world1");
        System.out.println("Ends with world1: " + endsWith);

        String trimmed = str.trim();
        System.out.println("Trimmed: " + trimmed);
    }
}
