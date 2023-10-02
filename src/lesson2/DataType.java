package lesson2;

public class DataType {

    public static void main(String[] args) {
        System.out.println("консольный вывод");

        int yearOfBirth = 1969;

        byte readByte = 56;
        short userAge = 35;
        long temp = 12L, planetAge = 455_875_647_495L;

        int numberOf1 = 12_111;
        long numberOf2 = numberOf1;

        int distance = 1000;
        byte smallDistance = (byte) distance;

        // начиная с 10 версии java объявляют переменные через var

        var version = 10; // int
        var bigNumber = 15L; // long
        var connected = true; // boolean
    }
}
