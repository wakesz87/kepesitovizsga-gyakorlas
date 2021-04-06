//A NumberOfDigits osztályba írj egy getNumberOfDigits() metódust, amely egy egész számot vár paraméterül!
// A metódus adja vissza azt, hogy ha 1-től kezdve a paraméterként átadott számig leírjuk az összes egész számot,
// akkor hány számjegyet írtunk le!

package hu.nive.ujratervezes.kepesitovizsga.numberofdigits;

public class NumberOfDigits {

    public int getNumberOfDigits(int numb){
        int sum = 0;
        for(int i = 1; i <= numb; i++){
            sum += String.valueOf(i).length();
        }
        return sum;
    }
}
