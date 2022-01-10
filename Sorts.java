import java.util.ArrayList;

public class Sorts {


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    int swap = 0;
    int passes = 0;
    int comp = 0;
    for( int passCtr = 1; passCtr < data.size(); passCtr++ ) {
//      System.out.println( "commencing pass #" + passCtr + "..." );

      //iterate thru first to next-to-last element, comparing to next
      for( int i = 0; i < data.size()-1; i++ ) {
         comp += 1;
        //if element at i > element at i+1, swap
        if ( data.get(i).compareTo(data.get(i+1) ) > 0 ){
          data.set( i, data.set(i+1,data.get(i)) );
	  swap += 1;
         }
        //System.out.println(data); //diag: show current state of list
      }
      passes = passCtr;
    }
    System.out.print("In a data set of size " + data.size() + " bubble sort took " );
    System.out.print( swap);
    System.out.println(" swaps, " + passes + " passes and " + comp + " comparisons");
  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubble( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    bubbleSortV( data );

    return data;
  }



public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at rightmost end,

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;
    int swap = 0;
    int passes = 0;
    int comp = 0;
    for( int pass = data.size()-1; pass > 0; pass-- ) {
      passes += 1;
//      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
      maxPos = 0;
      for( int i = 1; i <= pass; i++ ) {
    //    System.out.println( "maxPos: " + maxPos );//diag
  //      System.out.println( data );//diag
        comp += 1;
        if ( data.get(i).compareTo( data.get(maxPos) ) < 0 ) {
          maxPos = i;
          swap += 1;
	   data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
	}

      //System.out.println( "after swap: " +  data );//diag
    }
}
    System.out.print("In a data set of size " + data.size() + " selection sort took " );
    System.out.print( swap);
    System.out.println(" swaps, " + passes + " passes and " + comp + " comparisons");
  }//end selectionSort
  

  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> selection( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort


 public static void insertionSortV( ArrayList<Comparable> data )
  {
    int swap = 0;
    int passes = 0;
    int comp = 0;
    for( int partition = 1; partition < data.size(); partition++ ) {
      //partition marks first item in unsorted region
      passes = partition;
      //diag:
     // System.out.println( "\npartition: " + partition + "\tdataset:");
      //System.out.println( data ); 

      //traverse sorted region from right to left
      for( int i = partition; i > 0; i-- ) {
         comp += 1;
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( data.get(i).compareTo( data.get(i-1) ) < 0 ) {
          //diag:
        //  System.out.println( "swap indices "+(i-1)+" & "+i+"..." );
          data.set( i, data.set( i-1, data.get(i) ) );
          swap += 1;
        }
        else {
          break;
         }
      }
    }
    System.out.print("In a data set of size " + data.size() + " insertion sort took " );
    System.out.print( swap);
    System.out.println(" swaps, " + passes + " passes and " + comp + " comparisons");
  }//end insertionSortV

  public static ArrayList<Comparable>
    insertion( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    insertionSortV( data );

    //return working ArrayList
    return data;
  }//end insertionSort

}
