Exercise description 

1)
The Search skeleton can be seen as a Template Method:

```
public abstract class SearchPattern<T> {
    // Template method
    public final boolean search(T m){
    
     boolean found = false; this.init();
    
     while (!found && !this.isEmpty()) {
        T k = this.select(); if (m.equals(k))
        found = true; else
        this.split(m);
        return found;
     } 
    }
     // Primitive methods that are used by the template method
     // and are overridden in subclasses.
     protected abstract void init(); 
     protected abstract boolean isEmpty(); 
     protected abstract T select(); 
     protected abstract void split(T m);
    }
```

2)
Program the SearchPattern class and a subclass to the SearchPattern class named SearchableList
that can do a linear search in a java.util.List. That is, fill the holes in the following class:

```
public class SearchableList<T> extends SearchPattern<T>
{
    private List<T> list; 
    //TODO
    public SearchableList(List<T> list) {
    this.list = list; }
    //TODO 
}
```
3)
Make a test of the SearchableList class. The test must:
-Create a list and insert the following 8 schools (Strings) in the list: ”Holme”, ”Skåde”, ”Viby”, ”Beder”, ”Stautrup”, ”Engdal”, ”Forældreskolen” and ”Malling”.
-Search for a school that is in the list (”Malling”) and print the result of the search.
-Search for a school that is not in the list (”Risskov”) and print the result of the search.

4)
Make yet another subclass of the SearchPattern class. This class must search in an array. Name the subclass SearchableArray.
