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
        ArrayList kaz = new ArrayList<Integer>();
        kaz.add(7);
        kaz.add(1);
        kaz.add(5);
        kaz.add(12);
        kaz.add(3);

	ArrayList best = new ArrayList<Integer>();
	for (int i = 0; i < 10; i++) {
		best.add(i);
	}

	ArrayList worst = new ArrayList<Integer>();
        for (int i = 10; i > 0; i--) {
                worst.add(i);
        }

        //Bubbles
        System.out.println("==========Bubble==========");
        System.out.println( "\nArrayList kaz before sorting:\n" + kaz );
        System.out.println( "\nArrayList kaz after sorting:\n");
        System.out.println(Sorts.bubble(kaz));

        ArrayList ketterdam = populate( 10, 1, 1000 );
        System.out.println( "\nArrayList ketterdam before sorting:\n" + ketterdam );
        System.out.println( "\nArrayList ketterdam after sorting:\n");
	System.out.println( Sorts.bubble(ketterdam));

        System.out.println( "\nArrayList best before sorting:\n" + best );
        System.out.println( "\nArrayList best after sorting:\n");
        System.out.println( Sorts.bubble(best));

        System.out.println( "\nArrayList worst before sorting:\n" + worst );
        System.out.println( "\nArrayList worst after sorting:\n");
        System.out.println( Sorts.selection(worst));

        //Selection
        System.out.println("==========Selection==========");
        System.out.println( "\nArrayList kaz before sorting:\n" + kaz );
        System.out.println( "\nArrayList kaz after sorting:\n");
        System.out.println(Sorts.selection(kaz));

        System.out.println( "\nArrayList ketterdam before sorting:\n" + ketterdam );
        System.out.println( "\nArrayList ketterdam after sorting:\n");
        System.out.println( Sorts.selection(ketterdam));

        System.out.println( "\nArrayList best before sorting:\n" + best );
        System.out.println( "\nArrayList best after sorting:\n");
        System.out.println( Sorts.selection(best));

        System.out.println( "\nArrayList worst before sorting:\n" + worst );
        System.out.println( "\nArrayList worst after sorting:\n");
        System.out.println( Sorts.selection(worst));
        //Insertion
        System.out.println("==========Insertion==========");
        System.out.println( "\nArrayList kaz before sorting:\n" + kaz );
        System.out.println( "\nArrayList kaz after sorting:\n");
        System.out.println(Sorts.insertion(kaz));

        System.out.println( "\nArrayList ketterdam before sorting:\n" + ketterdam );
        System.out.println( "\nArrayList ketterdam after sorting:\n");
        System.out.println( Sorts.insertion(ketterdam));

        System.out.println( "\nArrayList best before sorting:\n" + best );
        System.out.println( "\nArrayList best after sorting:\n");
        System.out.println( Sorts.selection(best));

        System.out.println( "\nArrayList worst before sorting:\n" + worst );
        System.out.println( "\nArrayList worst after sorting:\n");
        System.out.println( Sorts.selection(worst));
    }


}
