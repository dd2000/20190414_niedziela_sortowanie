package pl.sda.MySortMethod;

import java.util.Scanner;

public class SPOJ_FR_01_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int loops = (int) Integer.parseInt(in.nextLine());
        for(int p=0;p<loops;p++){
            int size = (int) Integer.parseInt(in.nextLine());
            int[] tab = new int[size];
            for(int i=0; i<size; i++){
                tab[i] = in.nextInt();
            }  // for i...
            sortuj(tab);
        } // for p...
    }// main();

    public static void sortuj(int[] tab){
        int ile = 0;
        //sortowanie
        boolean zamiana = true;
        int size=tab.length;
        int tmp; // zmienna pomocnicza tymczasowa
        for(int przebieg=0; przebieg < size-1; przebieg++ ){
            if(zamiana){  //była zamiana
                zamiana = false;
                for( int n=0;n<size-1;n++) {
                    if (tab[n] > tab[n + 1]) {
                        tmp = tab[n];
                        tab[n] = tab[n + 1];
                        tab[n + 1] = tmp;
                        zamiana = true;
                        ile++;
                    } //
                } // for n...
            } // przebiegi
        }


        // wypisz, ile zamian
        System.out.println(ile);
    } // sortuj();

} // class SPOJ_FR_01_09
