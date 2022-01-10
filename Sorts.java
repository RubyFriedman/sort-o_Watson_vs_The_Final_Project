import java.util.ArrayList;

public class Sorts {
	public static ArrayList<Comparable> bubble( ArrayList<Comparable> data ) {
		int swaps = 0;
		ArrayList<Comparable> mutable = new ArrayList<Comparable>();
		for (int i = 0; i<data.size();i++) {
			mutable.add(data.get(i));
		}
		for( int passCtr = 1; passCtr < mutable.size(); passCtr++ ) {
			//System.out.println( "commencing pass #" + passCtr + "..." ); 
			//iterate thru first to next-to-last element, comparing to next
			for( int i = 0; i < mutable.size()-1; i++ ) {
				//if element at i > element at i+1, swap
				if ( mutable.get(i).compareTo(mutable.get(i+1) ) > 0 ) {
					mutable.set( i, mutable.set(i+1,mutable.get(i)) );
					swaps += 1;
				}
				//System.out.println(data); //diag: show current state of list
			}
		}
		System.out.println("Bubble Sort on the array took " + swaps + " swaps");
		return mutable;
	}
	public static ArrayList<Comparable> selection( ArrayList<Comparable> data ) {
    	//note: this version places greatest value at rightmost end,
		//maxPos will point to position of SELECTION (greatest value)
                ArrayList<Comparable> mutable = new ArrayList<Comparable>();
                for (int i = 0; i<data.size();i++) {
                        mutable.add(data.get(i));
                }
    	int swaps = 0;
	int maxPos;
    	for( int pass = mutable.size()-1; pass > 0; pass-- ) {
      		//System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
      		maxPos = 0;
      		for( int i = 1; i <= pass; i++ ) {
        		//System.out.println( "maxPos: " + maxPos );//diag
        		//System.out.println( data );//diag
        		if ( mutable.get(i).compareTo( mutable.get(maxPos) ) > 0 ) {
		      		maxPos = i;
			  	}
      		}
		swaps += 1;
      		mutable.set( maxPos, ( mutable.set( pass, mutable.get(maxPos) ) ) );
		//System.out.println( "after swap: " +  data );//diag
    	}
                System.out.println("Selection Sort on the array took " + (swaps - 1) + " swaps");
		return mutable;
  	}//end selectionSort


	public static ArrayList<Comparable> insertion ( ArrayList<Comparable> data ) {
		int swaps = 0;
                ArrayList<Comparable> mutable = new ArrayList<Comparable>();
                for (int i = 0; i<data.size();i++) {
                        mutable.add(data.get(i));
                }
		for( int partition = 1; partition < mutable.size(); partition++ ) {
			//partition marks first item in unsorted region
			//diag:
			//System.out.println( "\npartition: " + partition + "\tdataset:");
			//System.out.println( data );
			//traverse sorted region from right to left
			for( int i = partition; i > 0; i-- ) {
				// "walk" the current item to where it belongs
				// by swapping adjacent items
				if ( mutable.get(i).compareTo( mutable.get(i-1) ) < 0 ) {
					//diag:
					//System.out.println( "swap indices "+(i-1)+" & "+i+"..." );
					swaps += 1;
					mutable.set( i, mutable.set( i-1, mutable.get(i) ) );
			  	}
			  	else {
					break;
				}
		  	}
		}
                System.out.println("Insertion Sort on the array took " + swaps + " swaps");
		return mutable;
	}//end insertion
}

