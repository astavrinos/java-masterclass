public class WrappersDemo {

    public static void main(String[] args) {
        //Primitive Data
        byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10L;
        float f = 234.5f;
        double d = 123.4;
        char c = 'A';
        boolean bool = true;

        //Java Class/Object Types
        Byte myByte1 = Byte.valueOf(b);
        byte byteValue = myByte1.byteValue();
        Short myShort = s;
        Integer myInteger = 10;
        Long myLong = Long.valueOf("10L");
        Float myFloat = Float.valueOf(f);
        Double myDouble = new Double("123.4");
        Character myChar = Character.valueOf('A');
        Boolean myBoolean = new Boolean(true);

        //parse
        int parsedInt = Integer.parseInt("s");
        Integer wrappedInteger = Integer.valueOf(1);
        int primitiveInt = myInteger.intValue();
    }

}
