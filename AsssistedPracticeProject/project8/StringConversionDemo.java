package project8;

public class StringConversionDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // convert string to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("StringBuffer: " + stringBuffer);

        // convert string to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("StringBuilder: " + stringBuilder);
    }
}
