package corejava3.Boxing150623;

public class AutoBoxing {
    public static void main(String[] args) {
        long long1 = 87987;
        double double1 = 9898.987;
        int int1 = 12345;
        float float1 = 123.456f;
        char char1 = 'a';
        boolean bool1 = true;


        //autoboxing
        Long longwrap = long1;;
        Double doublewrap = double1;
        Integer intwrap = int1;
        Float floatwrap = float1;
        Character charwrap = char1;
        Boolean boolwrap = bool1;
        System.out.println("long autoboxing: " + longwrap);
        System.out.println("double autoboxing: " + doublewrap);
        System.out.println("int autoboxing: " + intwrap);
        System.out.println("float autoboxing: " + floatwrap);
        System.out.println("char autoboxing: " + charwrap);
        System.out.println("boolean autoboxing: " + boolwrap);

        //autounboxing
        long long2 = longwrap;
        double double2 = doublewrap;
        int int2 = intwrap;
        float float2 = floatwrap;
        char char2 = charwrap;
        boolean bool2 = boolwrap;
        System.out.println("long autounboxing: " + long2);
        System.out.println("double autounboxing: " + double2);
        System.out.println("int autounboxing: " + int2);
        System.out.println("float autounboxing: " + float2);
        System.out.println("char autounboxing: " + char2);
        System.out.println("boolean autounboxing: " + bool2);

    }

}
