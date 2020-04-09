import guskova.Phone;

import java.io.*;

public class Client {
    public static void main(String[] args) {
        String[] mass = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int count = mass.length;
        while (count != 0) {
            try (Phone phone = new Phone("192.168.1.75", 8000)) {
                System.out.println("Connected to server");
                String request = mass[count - 1];
                System.out.println("Request: " + request);
                phone.writeLine(request);

                String response = phone.readLine();
                System.out.println("Response: " + response);
                count--;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class Client2 {
    public static void main(String[] args) {
        String[] mass = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int count = mass.length;
        while (count != 0) {
            try (Phone phone = new Phone("192.168.1.75", 8000)) {
                System.out.println("Connected to server");
                String request = mass[count - 1];
                System.out.println("Request: " + request);
                phone.writeLine(request);

                String response = phone.readLine();
                System.out.println("Response: " + response);
                count--;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}