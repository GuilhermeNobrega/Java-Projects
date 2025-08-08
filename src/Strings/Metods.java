public class Metods {
    public static void main(String[] args) {
        // String Method 1 in Java
        String name = "Laksh Yadav";
        //System.out.println(Arrays.toString(name.toCharArray()));

        // String method 2: length()
        System.out.println("Length: " + name.length());

        // String method 3: toUpperCase()
        System.out.println("Uppercase: " + name.toUpperCase());

        // String method 4: toLowerCase()
        System.out.println("Lowercase: " + name.toLowerCase());

        // String method 5: substring()
        System.out.println("Substring (0,5): " + name.substring(0, 5));

        // String method 6: indexOf()
        System.out.println("Index of 'Y': " + name.indexOf('Y'));

        // String method 7: replace()
        System.out.println("Replace 'a' with 'o': " + name.replace('a', 'o'));
    }
}
