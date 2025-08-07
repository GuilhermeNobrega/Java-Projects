public class StringOne {
    public static void main(String[] args) {
        String a = "Laksh";
        String b = "Laksh";

        // 1. Comparision check (==) {This checks if reference variables (a,b) are pointing towards the same object}
        System.out.println(a==b);
        // 2. Now, if you dont want that both a and b refernce variables to point towards the same objec, we have to tell the java that, i want to create a new object even for the same name explicitly. This can only be achived with the help of "new" keyword in java. The new keyword will be creating new object and both thee same objects will be now outside the String pool but inside the heap only. They will be giving false on comparison check because, now they both are pointing towards differnt objects
        String c = new String("Laksh");
        String d = new String("Laksh");
        System.out.println(c==d);

        // 3. When you only need to check on the value use (.equals) method . It will just check the value only
         String name1 = new String("Hero");
         String name2 = new String("Hero");
         System.out.println(name1==name2);
         System.out.println(name1.equals(name2));
         System.out.println(name1.charAt(0));
    }
}
