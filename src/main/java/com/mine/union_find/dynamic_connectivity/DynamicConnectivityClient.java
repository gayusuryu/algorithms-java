package com.mine.union_find.dynamic_connectivity;

import com.mine.union_find.UnionFind;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

import static java.lang.System.exit;

public class DynamicConnectivityClient {
    public static void main(String[] args) {
        int n = StdIn.readInt();
        UnionFind uf = new DynamicConnectivity(n);

        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();

            try {
                if (!uf.connected(p, q)) {
                    uf.union(p, q);
                    StdOut.println(p + " " + q);
                }
            } catch (ArrayIndexOutOfBoundsException ae) {
                exit(0);
            }
        }
    }
}
