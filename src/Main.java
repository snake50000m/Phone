public class Main {
    public static void main(String[] args) {
        Phone iphone13 = new Phone("996770921975", "Iphone 13", 162);
        Phone xiaomiMi11Lite = new Phone("996500266744", "Xiaomi Mi 11 Lite", 157);
        Phone samsung = new Phone("996554266744", "Samsung S22 Ultra", 228);

        System.out.println(iphone13);
        System.out.println(xiaomiMi11Lite);
        System.out.println(samsung);

        iphone13.receiveCall("Ангелина");
        System.out.println(iphone13.getNumber());
        xiaomiMi11Lite.receiveCall("Данилл");
        System.out.println(xiaomiMi11Lite.getNumber());
        samsung.receiveCall("Иван");
        System.out.println(samsung.getNumber());

        System.out.println("----------------------");

        iphone13.receiveCall("Ангелина", iphone13.getNumber());
        xiaomiMi11Lite.receiveCall("Данилл", xiaomiMi11Lite.getNumber());
        samsung.receiveCall("Иван", samsung.getNumber());

        System.out.println("----------------------");

        String[] numbers = new String[]{iphone13.getNumber(), xiaomiMi11Lite.getNumber(), samsung.getNumber()};
        Phone.sendMessage(numbers);

    }
}