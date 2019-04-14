package pl.sda.BoubleSort;
/*
1. Napisz metodę, która generować będzie tablicę
N losowych liczb całkowitych z zakresu A .. B.
2. Napisz metodę wykorzystującą algorytm sortowania bąbelkowego w oparciu o tablice.
3. Wygeneruj różnej wielkości tablice losowych liczb [10, 100, 1000, 1000000] i wykorzystaj
metodę do posortowania wartości. Sprawdź czas działania dla poszczególnych sortowań.
4. Napisz testy sprawdzające poprawność działania algorytmu.
Testy:
● should sort array ascending by default
● should sort array depending on the order
● should leave sorted array unchanged
● should throw exception if array is null
● should not throw exception if array is zero-sized
● should sort if elements are not unique
*/

import java.util.Date;

import static java.lang.Math.random;

public class ArrayBoubleSort {
    public static void main(String[] args) {
        int sizeTab = 50000; // rozmiar tablicy
        int zakres = sizeTab*100; // zakres losowanych liczb (zakres wartości w tablicy)
        int[] tab = new int[sizeTab];
        //random();  <<--- zwraca wartości od 0 do 1.0 (np 0.004357, max= 1.0000
        for(int i=0;i<sizeTab; i++) {
            tab[i] = (int) (random()*zakres);
        }  // rzutowanie na int powoduje obcięcie części ułamkowej wyniku mnożenia

        System.out.println("Tablica wejściowa:");
        for(int i=0;i<sizeTab; i++) System.out.print(tab[i]+" "); // wyświetlenie wartości elementów w tablicy
        long start = System.currentTimeMillis();
        sortuj(tab);  // wywołanie metody odpowiedzialnej za sortowanie
        long koniec = System.currentTimeMillis();
        System.out.println("\nTablica wynikowa:");
        for(int i=0;i<sizeTab; i++) System.out.print(tab[i]+" "); // wyświetlenie po sortowaniu
        System.out.println("Liczba elementów w tablicy = "+sizeTab);
        System.out.println("Czas sortowania = "+(koniec-start)/1000+","+(koniec-start)%1000+" sekund.");
    }   // main();

    public static int[] sortuj(int[] ttab) {
        // weź 2 kolejne elementy tablicy
        // porównaj, czy drugi jest mniejszy od pierwszego
        // jeżeli prawda ===>  dokonaj zamiany elementów miejscami
        // powtarzaj powyższe aż do elementów (size-2) i (size-1)
        // po pierwszym przebiegu największa liczba będzie na pozycji (size-1)
        // sotrowanie kończy się, gdy w czasie przeglądania par nie ma już żadnej zamiany

        boolean zamiana = true;
        int size=ttab.length;
        int tmp; // zmienna pomocnicza tymczasowa
        for(int przebieg=0; przebieg < size-1; przebieg++ ){
            if(zamiana){  //była zamiana
                zamiana = false;
                for( int n=0;n<size-1;n++) {
                if (ttab[n] > ttab[n + 1]) {
                    tmp = ttab[n];
                    ttab[n] = ttab[n + 1];
                    ttab[n + 1] = tmp;
                    zamiana = true;
                  } //
            } // for n...
        } // przebiegi
        }

    return ttab;
    } // sortuj();


}   // class ArrayBoubleSort   a <-9
