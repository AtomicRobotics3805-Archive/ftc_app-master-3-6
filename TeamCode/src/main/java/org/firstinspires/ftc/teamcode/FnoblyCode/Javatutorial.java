package org.firstinspires.ftc.teamcode.FnoblyCode;

/**
 * Created by student on 2/6/18.
 */

public class IMUtest
{
    public static void main(String[] args)
    {

        int integerOne = 22;

        int integerTwo =  integerOne + 1;

        System.out.println(integerTwo);

        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 2100000000;
        long bigLong = 9220000000000000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.1482379123512514594154215;

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true;

        char randomChar = 66;
        char anotherChar = 'A';

        char escapedChars = '\\';

        String randomString = "I'm a random string";
        String anotherString = "Stuff";

        String andAnotherString = randomString + ' ' + anotherString;

        String byteString = Byte.toString(bigByte);
        String intString = Integer.toString(bigInt);
        String shortString = Short.toString(bigShort);
        String longString = Long.toString(bigLong);
        String floatString = Float.toString(bigFloat);
        String doubleString = Double.toString(bigDouble);
        String booleanString = Boolean.toString(trueOrFalse);

        System.out.println(andAnotherString);
    }
}
