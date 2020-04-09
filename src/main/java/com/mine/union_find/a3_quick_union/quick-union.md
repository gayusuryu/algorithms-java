# Quick-union [lazy approach]

## Data structure

- Integer array `id[]` of size N.
- Interpretation: `id[i]` is parent of i.
- _Root_ of i is `id[id[id[...id[i]...]]]`
- `id[]` 0 -> 0, 1 -> 1, 2 -> 9, 3 -> 4, 4 -> 9, 5 -> 6, 6 -> 6, 7 -> 7, 8 -> 8, 9 -> 9

## Quick-union is also too slow

### Cost model

- Number of array accesses (for read and write).

### Quick-find defect

- Union too expensive (N array accesses).
- Trees are flat, but too expensive to keep them flat.

### Quick-union defect

- Trees can get tall.
- Find too expensive (could be N array accesses).
