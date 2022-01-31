import java.util.ArrayList;

public class Driver{
	//We populate an arraylist of type integer with a specified size parameter and high/low bounds.
    public static ArrayList populate( int size, int lo, int hi ) {
	    //Constructor of integer type Arrraylist
        ArrayList<Integer> retAL = new ArrayList<Integer>();
	    //We use condition size > 0 b/c the size is getting reduced each time a random number is being generated.
	    //This makes sure the newly generated ArrayList adheres to the specified int size parameter.
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

	//We created a new ArrayList called kaz which serves as one of the test cases that we specified the exact elements.
    public static void main(String[] args) {
        ArrayList kaz = new ArrayList<Integer>(); //og array nums
        kaz.add(7);
        kaz.add(1);
        kaz.add(5);
        kaz.add(12);
        kaz.add(3);
	   
	//Best case because the ArrayList is already sorted in increasing orders meaning all 3 sorting do not have to do anything. 
	ArrayList best = new ArrayList<Integer>(); 
	for (int i = 0; i < 10; i++) {
		best.add(i);
	}

	//Worst because the ArrayList is sorrted in descending order meaning all 3 sorting need to re-sort the sequence.
	ArrayList worst = new ArrayList<Integer>(); 
        for (int i = 9; i >= 0; i--) {
                worst.add(i);
        }
	//bigBad because the ArrayList is the extreme version of worst case. 
	ArrayList bigBad = new ArrayList<Integer>(); //length 1000
        for (int i = 999; i >= 0; i--) {
                bigBad.add(i);
        }
	    
	//This is our 5 new populated ArrayList with varying array sizes from 10 to 1000. 
	//ArrayList kaz was already created in line 31 with the smallest array size of 5 elements.
	//Order of all arrays: kaz (5), best (9), worst(9), ketterdam(10), a(100), b(200), c(500), bigBad(999), BigRand (1000)
        ArrayList ketterdam = populate( 10, 1, 1000 );
	ArrayList a = populate( 100, 1, 1000 );
        ArrayList b = populate( 200, 1, 1000 );
        ArrayList c = populate( 500, 1, 1000 );
        ArrayList bigRand = populate( 1000, 1, 1000 );
	    
	//Sorting of the pre-specified ArrayList kaz: size 5
        System.out.println("" + kaz + ":");
        Sorts.bubble(kaz);
        Sorts.selection(kaz);
        Sorts.insertion(kaz);

	//Sorting of the ArrayList best: size 9
	System.out.println("" + best + ":");
        Sorts.bubble(best);
        Sorts.selection(best);
        Sorts.insertion(best);
	
	//Sorting of the ArrayList worst: size 9
	System.out.println("" + worst + ":");
        Sorts.bubble(worst);
        Sorts.selection(worst);
        Sorts.insertion(worst);
	    
       	//Sorting of the ArrayList ketterdam: size 10
        System.out.println( ketterdam + ":");
	Sorts.bubble(ketterdam);
        Sorts.selection(ketterdam);
        Sorts.insertion(ketterdam);
       
	//Sorting of the ArrayList a: size 100
        Sorts.bubble(a);
        Sorts.selection(a);
        Sorts.insertion(a);
	    
	    
	//Sorting of the ArrayList b: size 200
	Sorts.bubble(b);
        Sorts.selection(b);
        Sorts.insertion(b);
	    
	//Sorting of the ArrayList c: size 500
	Sorts.bubble(c);
        Sorts.selection(c);
        Sorts.insertion(c);

	//Sorting of the ArrayList bigBad: size 999
        System.out.println("Array length 999 in descending order");
        Sorts.bubble(bigBad);
        Sorts.selection(bigBad);
        Sorts.insertion(bigBad);

	//Sorting of the ArrayList bigRand: size 1000
        System.out.println("Array length 1k, random order");
        Sorts.bubble(bigRand);
        Sorts.selection(bigRand);
        Sorts.insertion(bigRand);


    }


}
