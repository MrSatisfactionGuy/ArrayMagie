package de.ostfalia.prog1.arrayMagie;

public class ArrayMagie {

    int[] arr = {8, 7, 4, 1, 0, 5, -2};

    public static int[] arrayMagic(int[] arr) {
        // TODO: Implementieren Sie die Methode gemäß der Aufgabenstellung

        if (arr == null || arr.length == 0) {
            return new int[]{0};
        }

        int addingNums = 0;
        for (int i = 0; i < arr.length; i++) {
            addingNums += arr[i];
        }

        int newLength = (arr.length + 1) / 2 + 1;
        int[] result = new int[newLength];

        int j = 0;
        for (int i = 0; i < arr.length; i += 2) {
            result[j] = arr[i];
            j++;
        }

        result[result.length - 1] = addingNums;

        return result;
    }
}
