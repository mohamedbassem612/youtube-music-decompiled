package defpackage;

import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acac {
    public final long a;
    public final long b;
    public final long c;

    public acac(long j, long j2, byte[] bArr) {
        ahno.O(j <= j2);
        this.c = j;
        this.b = j2;
        this.a = j2 - j;
    }

    private final long c(Map.Entry entry, long j) {
        if (entry != null) {
            long j2 = j - this.b;
            long j3 = j + this.a;
            long jLongValue = ((Long) entry.getKey()).longValue();
            long j4 = ((long) ((acao) entry.getValue()).b) + jLongValue;
            if (jLongValue > j3) {
                return jLongValue - j3;
            }
            if (j4 < j2) {
                return j2 - j4;
            }
        }
        return 0L;
    }

    public final boolean a(TreeMap treeMap, long j, long j2) {
        long j3 = j + this.a;
        Map.Entry entryFloorEntry = treeMap.floorEntry(Long.valueOf(j3));
        acao acaoVar = null;
        if (entryFloorEntry != null) {
            acao acaoVar2 = (acao) entryFloorEntry.getValue();
            long jLongValue = ((Long) entryFloorEntry.getKey()).longValue();
            if (acaoVar2 != null && j3 >= jLongValue && j3 - jLongValue <= acaoVar2.b) {
                acaoVar = acaoVar2;
            }
        }
        return acaoVar == null || j2 < acaoVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.List] */
    public final void b(TreeMap treeMap, acga acgaVar, long j) {
        if (treeMap.size() >= this.c) {
            Map.Entry entryFirstEntry = treeMap.firstEntry();
            Map.Entry entryLastEntry = treeMap.lastEntry();
            if (c(entryLastEntry, j) > c(entryFirstEntry, j)) {
                entryFirstEntry = entryLastEntry;
            }
            if (entryFirstEntry == null || c(entryFirstEntry, j) == 0) {
                return;
            }
            treeMap.remove(entryFirstEntry.getKey());
            acgaVar.o(((acao) entryFirstEntry.getValue()).c);
        }
    }

    public acac(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = (j + j2) / 5000;
    }
}
