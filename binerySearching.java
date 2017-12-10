/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinchou
 */
public class binerySearching {

    int b, c, hasil;
    int indexHasil = -1;

    public void search(int[] array, int x) {
        b = 0;
        c = (array.length - 1);
        while (x >= 0) {
            indexHasil = (b + c) / 2;
            if (array[indexHasil] < x) {
                b = indexHasil;
            } else if (array[indexHasil] > x) {
                c = indexHasil;
            } else if (array[indexHasil] == x) {
                hasil = x;

                System.out.println(hasil + " " + indexHasil);
                return;
            }
        }

    }
}

class sequentialSearching {

    void search(int array[], int x) {
        for (int a = 0; a < array.length; a++) {
            
                if (array[a] == x) {
                    System.out.println("data ditemukan pada index ke " + a);
                    return;
                }
                else if (a==array.length-1){
                    System.out.println("nggak ketemu cok");
                }  }
    }
}

class main {

    public static void main(String[] args) {
        int a[] = {20, 30, 45, 50, 70, 100, 120};
        binerySearching lul = new binerySearching();
        lul.search(a, 100);
        sequentialSearching lul2 = new sequentialSearching();
        lul2.search(a, 100);

    }

}
