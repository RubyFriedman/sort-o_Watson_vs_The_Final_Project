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

        //Bubbles
        System.out.println("==========Bubble==========");
        System.out.println( "\nArrayList kaz before sorting:\n" + kaz );
        Sorts.bubble(kaz);
        System.out.println( "\nArrayList kaz after sorting:\n" + kaz );

        ArrayList ketterdam = populate( 10, 1, 1000 );
        System.out.println( "\nArrayList ketterdam before sorting:\n" + ketterdam );
        Sorts.bubble(ketterdam);
        System.out.println( "\nArrayList ketterdam after sorting:\n" + ketterdam );

        //Selection
        ArrayList jes = new ArrayList<Integer>();
        jes.add(7);
        jes.add(1);
        jes.add(5);
        jes.add(12);
        jes.add(3);
        System.out.println("==========Selection==========");
        System.out.println( "\nArrayList jes before sorting:\n" + jes );
        Sorts.selection(jes);
        System.out.println( "\nArrayList jes after sorting:\n" + jes );

        ArrayList zoya = populate( 10, 1, 1000 );
        System.out.println( "\nArrayList zoya before sorting:\n" + zoya );
        Sorts.selection(zoya);
        System.out.println( "\nArrayList zoya after sorting:\n" + zoya );

        //Insertion
        ArrayList wylan = new ArrayList<Integer>();
        wylan.add(7);
        wylan.add(1);
        wylan.add(5);
        wylan.add(12);
        wylan.add(3);
        System.out.println("==========Insertion==========");
        System.out.println( "\nArrayList wylan before sorting:\n" + wylan );
        Sorts.insertion(wylan);
        System.out.println( "\nArrayList wylan after sorting:\n" + wylan );

        ArrayList nina = populate( 10, 1, 1000 );
        System.out.println( "\nArrayList nina before sorting:\n" + nina );
        Sorts.insertion(nina);
        System.out.println( "\nArrayList nina after sorting:\n" + nina );
        
    }


}