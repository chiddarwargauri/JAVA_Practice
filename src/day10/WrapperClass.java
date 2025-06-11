package day10;

import java.util.ArrayList; // ✅ Add this import

public class WrapperClass {

    public static void main(String[] args) {

        // 1. Converting primitive data to object type (Auto Boxing)
        int i = 10;
        double d = 10.5;
        char c = 'A';
        boolean b = true;

        Integer iobj = i; // Auto-boxing
        System.out.println(iobj);

        Double dobj = d; // Auto-boxing (use Double instead of just double)
        System.out.println(dobj);

        Character cobj = c;
        System.out.println(cobj);

        Boolean bobj = b;
        System.out.println(bobj);

        // 2. Converting object to primitive (Unboxing)
        int intvalue = iobj;
        double doublevalue = dobj;
        char charvalue = cobj;
        boolean booleanvalue = bobj;

        System.out.println(intvalue);
        System.out.println(doublevalue);
        System.out.println(charvalue);
        System.out.println(booleanvalue);

        // 3. Storing null
        // int x = null; // ❌ Not allowed
        Integer x = null; // ✅ Allowed

        // 4. Collections allow only object (not primitives)
        // Arrayist ar = new ArrayList(); // ❌ Typo: "Arrayist"

        ArrayList<Integer> ar = new ArrayList<>(); // ✅ Correct
    }
}
