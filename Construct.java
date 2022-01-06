class DefaultValueTest {
    byte byteDefaultValue;
    int intDefaultValue;
    short shortDefaultValue;
    long longDefaultValue;
    float floatDefaultValue;
    double doubleDefaultValue;
    boolean booleanDefaultValue;
    String referenceDefaultValue;
}


class Phone1 {
    String model;
    String color;
    int price;

    public Phone1(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }
}

public class Construct {
    public static void main(String[] args) {
        Phone1 galaxy = new Phone1("galaxy10", "black", 100);

        Phone1 iphone =new Phone1("galaxy10", "black", 100);

        System.out.println("철수는 이번에 " + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에 " + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");

        DefaultValueTest defaultValueTest = new DefaultValueTest();
        System.out.println("byte default: " + defaultValueTest.byteDefaultValue);
        System.out.println("short default: " + defaultValueTest.shortDefaultValue);
        System.out.println("int default: " + defaultValueTest.intDefaultValue);
        System.out.println("long default: " + defaultValueTest.longDefaultValue);
        System.out.println("float default: " + defaultValueTest.floatDefaultValue);
        System.out.println("double default: " + defaultValueTest.doubleDefaultValue);
        System.out.println("boolean default: " + defaultValueTest.booleanDefaultValue);
        System.out.println("reference default: " + defaultValueTest.referenceDefaultValue);
    }
}




