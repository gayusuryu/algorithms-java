# Dynamic connectivity

Given a set of N objects.

- Union command: connect two objects.
- Find/connected query: is there a path connecting the two objects?

## Applications involve manipulating objects of all types.

- Pixels in a digital photo.
- Computers in a network.
- Friends in a social network.
- Transistors in a computer chip.
- Elements in a mathematical set.
- Variable names in Fortran program.
- Metallic sites in a composite system.

When programming, convenient to name objects 0 to N-1.

- Use integers as array index.
- Suppress details not relevant to union-find.

## Modeling the connections

We assusme "is connected to" is an equivalence relation:

- Reflexive: p is connected to p.
- Symmetric: if p is connected to q, q is connected to p.
- Transitive: if p is connected to q and q is connected to r, then p is connected to r.

Connected components: Maximal set of objects that are mutually connected.

## Implementing the operations

- _Find query_: Check if two objects are in the same component.
- _Union command_: Replace components containing two objects with their union.

## Union-find data type (API)

_Goal_, Design efficient data structure for union-find.

- Number of objects N can be huge.
- Number of operations M can be huge.
- Find queries and union commands may be intermixed.

```java
public class UF {
    UF(int N)   // initialize union-find data structure with N objects (0 - N-1).

    void union(int p, int q)    // add connection between p and q.

    boolean connected(int p, int q) // are p and q in the same component?

    int find(int p) // component identifier for p(0 -N-1).

    int count() // number of components
}
```
