package observer;

import java.util.ArrayList;
import java.util.Iterator;
public class IntegerDataBag implements Subject {
      private ArrayList list = new ArrayList();
      private ArrayList observers = new ArrayList();
      public void add( Integer i ) {
            list.add( i );
            notifyObservers();
      }
      public Iterator iterator() {
            return list.iterator();
      }
      public Integer remove( int index ) {
            if( index < list.size() ) {
                  Integer i = (Integer) list.remove( index );
                  notifyObservers();
                  return i;
            }
            return null;
      }
      public void addObserver( Observer o ) {
            observers.add( o );
      }
      public void removeObserver( Observer o ) {
            observers.remove( o );
      }
      private void notifyObservers() {
            // loop through and notify each observer
            Iterator i = observers.iterator();
            while( i.hasNext() ) {
                  Observer o = ( Observer ) i.next();
                  o.update( this );
            }
      }
}