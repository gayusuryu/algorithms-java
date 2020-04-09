# Quick-union [lazy approach]

## Data structure

- Integer array `id[]` of size N.
- Interpretation: `id[i]` is parent of i.
- _Root_ of i is `id[id[id[...id[i]...]]]`
- `id[]` 0 -> 0, 1 -> 1, 2 -> 9, 3 -> 4, 4 -> 9, 5 -> 6, 6 -> 6, 7 -> 7, 8 -> 8, 9 -> 9
