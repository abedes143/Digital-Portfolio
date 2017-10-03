/**
 * DoubleList represents a doubly linked implementation of a list. The front of
 * the list is kept by "front" and the rear by "rear".
 */

public class DoubleList<T>{
  private DoubleNode<T> front, rear;
  private int count;

  /**
   * Creates an empty list using the default capacity.
   */
  public DoubleList(){
    rear = null;
    front = null;
    count = 0;
  }

  /**
   * Returns true if this list is empty and false otherwise.
   *
   * @return  true if the list is empty and false if otherwise
   */
  public boolean isEmpty(){
    return (count == 0);
  }

  /**
   * Returns the number of elements currently in this list.
   *
   * @return  the integer representation of the number of elements currently
   *          in the list
   */
  public int size(){
    return count;
  }

  /**
   * Returns a reference to the element at the front of this list.
   * The element is not removed from the list.  Throws an
   * EmptyCollectionException if the list is empty.
   *
   * @return a reference to the first element in the list
   * @throws EmptyCollectionException  if an empty collection exception occurs
   */
  public T first() throws EmptyCollectionException{
    if (isEmpty()){
      throw new EmptyCollectionException ("list");
    }
    return front.getElement();
  }

  /**
   * Returns a reference to the element at the rear of this list.
   * The element is not removed from the list.  Throws an
   * EmptyCollectionException if the list is empty.
   *
   * @returna reference to the element at the rear of this list
   * @throws EmptyCollectionException  if an empty collection exception occurs
   */
  public T last() throws EmptyCollectionException{
    if (isEmpty()){
      throw new EmptyCollectionException ("list");
    }
    return rear.getElement();
  }

  /**
   * Returns true if this list contains the specified element.
   *
   * @param target  the item the list is to be searched for
   * @return        true if the target is contained in the list
   */
  public boolean contains(T target){
    boolean found = false;
    DoubleNode<T> trav = front;
    DoubleNode<T> result = null;

    while(!found && trav != null){
      if (target.equals(trav.getElement())){
        found = true;
      }else{
        trav = trav.getNext();
      }
    }
    return found;
  }

  /**
   * Adds the specified element to the front of this list.
   *
   * @param element  the element to be added to the front of the list
   */
  public void addToFront(T element){

  }

  /**
   * Adds the specified element to the rear of this list.
   *
   * @param element  the element to be added to the list
   */
  public void addToRear(T element){

  }

  /**
  * Adds the specified element after the specified target element.
  * Throws an NoSuchElementException if the target is not found.
  *
  * @param target   the target that the element is to be added after
  * @param element  the element to be added after the target element
  */
   public void addAfter(T target, T element){

   }

  /**
   * Removes and returns the first element in this list.
   *
   * @return                           the first element in the list
   * @throws EmptyCollectionException  if an empty collection exception occurs
   */
  public T removeFirst() throws EmptyCollectionException{
    return null;
  }

  /**
   * Removes and returns the last element in this list.
   *
   * @return                           the last element in the list
   * @throws EmptyCollectionException  if an empty collection exception occurs
   */
  public T removeLast() throws EmptyCollectionException{
    return null;
  }

  /**
   * Removes and returns the specified element.
   *
   * @param element                    the element to be removed and returned
   *                                   from the list
   * @return                           the element that has been removed from
   *                                   the list
   * @throws NoSuchElementException    if an element not found exception occurs
   */
  public T remove(T element){
    return null;
  }

  /**
  * Returns a string representation of this list.
  *
  * @return  a string representation of this list
  */
  public String toString(){
    String result = "";
    DoubleNode<T> trav = front;

    while(trav != null){
       result += trav.getElement();
       trav = trav.getNext();
    }
    return result;
  }
}
