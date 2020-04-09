# Quick-find [eager approach]

## Data structure

- Integer array `id[]` of size N.
- Interpretation: p and q are connected iff(if and only if) they have the same id.

_Find_: Check if p and q have the same id.  
_Union_: To merge components containing p and q, change all entries whose id equals `id[p]` to `id[q]`  
