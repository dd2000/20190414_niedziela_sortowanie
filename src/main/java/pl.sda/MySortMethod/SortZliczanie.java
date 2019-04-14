package pl.sda.MySortMethod;

import static java.lang.Math.random;

/*
1. Napisz metodę wykorzystującą algorytm sortowania [???].  [???] =  przez ZLICZANIE
2. Wygeneruj różnej wielkości tablice losowych liczb [10, 100, 1000, 1000000] i wykorzystaj
metodę do posortowania wartości. Sprawdź czas działania dla poszczególnych sortowań.
3. Napisz testy sprawdzające poprawność działania algorytmu.
4. Porównaj z innymi grupami czasy działania Waszych algorytmów.
Testy:
● should sort array ascending by default
● should sort array depending on the order
● should leave sorted array unchanged
● should throw exception if array is null
● should not throw exception if array is zero-sized
● should sort if elements are not unique
 */
public class SortZliczanie {
    public static void main(String[] args) {

        int zakresMin = 1; // zakres losowanych liczb (zakres wartości w tablicy)
        int zakresMax = 80;
        int od_do = 1+zakresMax-zakresMin;

        int sizeTab = 20; // rozmiar tablicy danych (źródłowej)
        int[] tab = new int[sizeTab];
        //random();  <<--- zwraca wartości od 0 do 1.0 (np 0.004357, max= 1.0000
        for(int i=0;i<sizeTab; i++) {
            tab[i] = (int) ((random()*(od_do))+zakresMin);
        }  // rzutowanie na int powoduje obcięcie części ułamkowej wyniku mnożenia

        // tablica kluczy - indeksy odpowiadają wartościom w tablicy źródłowej, np. index0 =>> 0+zakresMin
        int[] key = new int[od_do]; // tyle jest kluczy dopuszczalnych wartości w tablicy źródłowej

        System.out.println("\nTablica wejściowa:");
        for(int i=0;i<sizeTab; i++) System.out.print(tab[i]+" "); // wyświetlenie wartości elementów w tablicy
        long start = System.currentTimeMillis();

        key = sortuj(tab,od_do,zakresMax);  // wywołanie metody odpowiedzialnej za sortowanie

        long koniec = System.currentTimeMillis();

        System.out.println("\nTablica wynikowa:");
        for(int i=0;i<od_do; i++) {
            for(int j=1;j<=key[i];j++){
            System.out.print((i)+" "); // wyświetl index Key tyle razy, ile wynosi wartość elementu Key
            } // for j...
        } // for i...
        System.out.println("\n\nLiczba elementów w tablicy = "+sizeTab);
        System.out.println("Czas sortowania = "+(koniec-start)/1000+","+(koniec-start)%1000+" sekund.\n");
    }   // main();

    public static int[] sortuj(int[] ttab, int od_do, int zakrMAX) {
        // przeglądaj tablicę źródłową
        // wartość elementu tablicy źródłowej zwiększa o 1
        // wartość el.klucza na indeksie odpowiadającym wartości źródłowej

        int size = ttab.length;
        int[] keyTmp =new int[od_do];
        for(int i=0; i < size; i++ ){
            keyTmp[ttab[i]-od_do+zakrMAX]++;
            } // for i...

        return keyTmp;
    } // sortuj() - przez_zliczanie;

} // class SortZliczanie
