package com.mine.union_find.a1_dynamic_connectivity;

public class UnionFind {
    private int[] id;

    public UnionFind(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    public int find(int p) {
        return id[p];
    }

    public int count() {
        return id.length;
    }

    // getter
    public int[] getId() {
        return id;
    }
}
