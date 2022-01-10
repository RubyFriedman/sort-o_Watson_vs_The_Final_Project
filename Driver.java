import java.util.ArrayList;

public class Driver{
    public static ArrayList populate( int size, int lo, int hi ) {
        ArrayList<Integer> retAL = new ArrayList<Integer>();
        while( size > 0 ) {
            //     offset + rand int on interval [lo,hi]
            retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
            size--;
        }
        return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
        int randomIndex;
        for( int i = al.size()-1; i > 0; i-- ) {
            //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
            //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }

    public static void main(String[] args) {
        ArrayList kaz = new ArrayList<Integer>(); //og array nums
        kaz.add(7);
        kaz.add(1);
        kaz.add(5);
        kaz.add(12);
        kaz.add(3);

	ArrayList best = new ArrayList<Integer>(); // best case
	for (int i = 0; i < 10; i++) {
		best.add(i);
	}

	ArrayList worst = new ArrayList<Integer>(); // worst case
        for (int i = 9; i >= 0; i--) {
                worst.add(i);
        }

	ArrayList bigBad = new ArrayList<Integer>(); //length 1000
        for (int i = 999; i >= 0; i--) {
                bigBad.add(i);
        }

        ArrayList bigRand = populate( 1000, 1, 1000 ); //rand pop

        System.out.println("" + kaz + ":");
        Sorts.bubble(kaz);
        Sorts.selection(kaz);
        Sorts.insertion(kaz);

        ArrayList ketterdam = populate( 10, 1, 1000 );
        System.out.println( ketterdam + ":");
	Sorts.bubble(ketterdam);
        Sorts.selection(ketterdam);
        Sorts.insertion(ketterdam);

        System.out.println("" + best + ":");
        Sorts.bubble(best);
        Sorts.selection(best);
        Sorts.insertion(best);

        System.out.println("" + worst + ":");
        Sorts.bubble(worst);
        Sorts.selection(worst);
        Sorts.insertion(worst);

        System.out.println("Array length 1K in descending order");
        Sorts.bubble(bigBad);
        Sorts.selection(bigBad);
        Sorts.insertion(bigBad);

        System.out.println("Array length 1k, random order");
        Sorts.bubble(bigRand);
        Sorts.selection(bigRand);
        Sorts.insertion(bigRand);
    }


}
