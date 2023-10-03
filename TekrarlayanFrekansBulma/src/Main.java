import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi uzunluğunu giriniz : ");
        int arrayLenght = scanner.nextInt();
        int[] array = new int[arrayLenght];

        System.out.println("Dizi elemanlarını giriniz :");
        for (int i = 0; i < arrayLenght; i++) {
            array[i] = scanner.nextInt();
        }

        // Elemanların frekanslarını hesapla
        boolean[] visited = new boolean[arrayLenght];

        for (int i = 0; i < arrayLenght; i++) {
            if (visited[i]) {
                continue; // İşlenen bir elemanı atlama
            }

            int count = 1; // Elemanın frekansını başlat

            for (int j = i + 1; j < arrayLenght; j++) {
                if (array[i] == array[j]) {
                    visited[j] = true; // Aynı elemanın işaretlenmesi
                    count++;
                }
            }

            System.out.println(array[i] + " : " + count + " kez tekrar edildi.");
        }

        scanner.close();
    }
}
