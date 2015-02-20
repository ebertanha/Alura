package observer;

import java.util.Iterator;
public class IntegerAdder implements Observer {
      private IntegerDataBag bag;
      public IntegerAdder( IntegerDataBag bag ) {
            this.bag = bag;               
            bag.addObserver( this );
      }
      public void update( Subject o ) {
            if( o == bag ) {
                  System.out.println( "The contents of the IntegerDataBag have changed." );
                  int counter = 0;
                  Iterator i = bag.iterator();
                  while( i.hasNext() ) {
                        Integer integer = ( Integer ) i.next();
                        counter+=integer.intValue();
                  }
                  System.out.println( "The new sum of the integers is: " + counter );
            }
      }
}
