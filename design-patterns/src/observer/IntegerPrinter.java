package observer;

import java.util.Iterator;
public class IntegerPrinter implements Observer {
      private IntegerDataBag bag;
      public IntegerPrinter( IntegerDataBag bag ) {
            this.bag = bag;               
            bag.addObserver( this );
      }
      public void update( Subject o ) {
            if( o == bag ) {
                  System.out.println( "The contents of the IntegerDataBag have changed." );
                  System.out.println( "The new contents of the IntegerDataBag contains:" );
                  Iterator i = bag.iterator();
                  while( i.hasNext() ) {
                        System.out.println( i.next() );
                  }
            }
      }
}