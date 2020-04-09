package com.mine.union_find.a3_quick_union;

import com.mine.union_find.a1_dynamic_connectivity.UnionFind;

public class QuickUnionUF extends UnionFind {
    public QuickUnionUF(int n) {
        super(n);
    }

    private int root(int i) {
        while (i == getId()[i]) {
            i = getId()[i];
        }
        return i;
    }

    @Override
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    @Override
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        getId()[i] = j;
    }
}
