self-test exercises from textbook:
1. `list.add("Hello");`
2. `instruction.set(5, "Go");`
3. `instruction.add(5, "Go");`
4. yes, but only if there is an element existing at that position already. i.e. you cannot use `set()` to add to an ArrayList.
5. you can only use `add(index, item)` for indices up to the first unused position, i.e. index 4 in a list of 4 items.
6. `index1` can be from 0 to the size-1 of the ArrayList. `index2` can be from 0 to the size of the ArrayList.
7. Yes it can if we use `add()`
8. 
```
for ( Double element : numberList )
    System.out.println(element);
```
9. 
10. no, ArrayList must take an Object type, not primitive type
11. 
```
for (int i = 0; i < a.size(); i++) {
    System.out.println(a.get(i) + " differs from average by " + (a.get(i) - average));
}
```
12. 
```
public class Utility {
    public < E > int getMidIndex( E[] arr ) {
        return arr.length / 2;
    }
}
```
13. an object of type `UnorderedPair<String>` is also of type `Pair<String>` if `UnorderedPair` inherits from `Pair`. like how `List` is of type `Collection`. what wouldn't work is two classes of a generic type, like `Pair<A>` and `Pair<B>` - they are not of the same type. but you cannot have an array of `UnorderedPair<String>[]`