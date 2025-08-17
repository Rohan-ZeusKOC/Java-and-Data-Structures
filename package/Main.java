package main;
import Demo.java;
public class Main {
    public static void main(String[] args) {
        Demo tempConverter = new Demo(30);
        System.out.println("Temperature in Celsius: " + tempConverter.celsius);
        System.out.println("Temperature in Fahrenheit: " + tempConverter.toFahrenheit());
	}
}